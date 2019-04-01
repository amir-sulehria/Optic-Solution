create database OPTIC_SOLUTIONS

create table tbl_supplier (
	su_id int primary key,
	su_fname varchar(255) default 'Unregistered',
	su_lname varchar(255) default 'Supplier',
	su_contactnumber int default 0,
	su_streetaddress varchar(255),
	su_cityaddress varchar(255),
)

create table tbl_manufacturer (
	ma_id int primary key,
	ma_fname varchar(255) default 'Unregistered',
	ma_lname varchar(255) default 'Manufacturer',
	ma_contactnumber int default 0,
	ma_streetaddress varchar(255),
	ma_cityaddress varchar(255),
)

create table tbl_employee (
	e_id int primary key,
	e_uname varchar(255),
	e_fname varchar(255),
	e_lname varchar(255),
	e_password varchar(255), 
	e_type varchar(255), --ADMIN / USER
	e_datestart DATE default getDate(),
	e_contactnumber int default 0,
	e_street_address varchar(255) default 'Undefined',
	e_city_address varchar(255) default 'Undefined',
	e_base_salary int,
	e_bonuses int,
	e_reductions int
)
create table tbl_doctor (
	d_id int primary key,
	d_uname varchar(255),
	d_fname varchar(255),
	d_lname varchar(255),
	d_datestart DATE default getDate(),
	d_contactnumber int default 0,
	d_street_address varchar(255) default 'Undefined',
	d_city_address varchar(255) default 'Undefined',
	e_base_salary int,
	e_bonuses int,
	e_reductions int
)

create table tbl_glass(
	g_id int primary key,
	g_type varchar(255) NULL,
	g_minquantity bigint default 1, 
	g_maxquantity bigint default 1,
	g_currentQuantity bigint,
	g_basePrice bigint check(g_basePrice >= 0),
	g_salePrice bigint check(g_salePrice >= 0),
	g_taxPrice bigint check(g_taxPrice >= 0),
	g_manufacturer int CONSTRAINT FK_ManufacturerGlass FOREIGN KEY (g_manufacturer) REFERENCES tbl_manufacturer(ma_id),
	g_supplier int CONSTRAINT FK_SupplierGlass FOREIGN KEY (g_supplier) REFERENCES tbl_supplier(su_id), --foreign key
	CONSTRAINT glassMinQuantity check (g_minquantity <= g_maxquantity AND g_minquantity >= 0),
	CONSTRAINT glassMaxQuantity check (g_maxquantity >= g_minquantity AND g_maxquantity >= 1),
)

create table tbl_coating(
	c_id int primary key,
	c_type varchar(255) NULL,
	c_minquantity bigint default 1 ,
	c_maxquantity bigint default 1 ,
	c_currentQuantity bigint,
	c_basePrice bigint check(c_basePrice >= 0),
	c_salePrice bigint check(c_salePrice >= 0),
	c_taxPrice bigint check(c_taxPrice >= 0),
	c_manufacturer int CONSTRAINT FK_ManufacturerCoating FOREIGN KEY (c_manufacturer) REFERENCES tbl_manufacturer(ma_id), --foreign key
	c_supplier int CONSTRAINT FK_SupplierCoating FOREIGN KEY (c_supplier) REFERENCES tbl_supplier(su_id),--foreign key
	CONSTRAINT coatingMinQuantity check (c_minquantity <= c_maxquantity AND c_minquantity >= 0),
	CONSTRAINT coatingMaxQuantity check (c_maxquantity >= c_minquantity AND c_maxquantity >= 1),
)

create table tbl_lens(
	l_id int primary key,
	l_type varchar(255) NULL,
	l_minquantity bigint default 1 ,
	l_maxquantity bigint default 1 ,
	l_currentQuantity bigint,
	l_basePrice bigint check(l_basePrice >= 0),
	l_salePrice bigint check(l_salePrice >= 0),
	l_taxPrice bigint check(l_taxPrice >= 0),
	l_manufacturer int CONSTRAINT FK_ManufacturerLens FOREIGN KEY (l_manufacturer) REFERENCES tbl_manufacturer(ma_id), --foreign key
	l_supplier int CONSTRAINT FK_SupplierLens FOREIGN KEY (l_supplier) REFERENCES tbl_supplier(su_id),--foreign key
	CONSTRAINT lensMinQuantity check (l_minquantity <= l_maxquantity AND l_minquantity >= 0),
	CONSTRAINT lensMaxQuantity check (l_maxquantity >= l_minquantity AND l_maxquantity >= 1),
)

create table tbl_frames(
	f_id int primary key,
	f_model varchar(255),
	f_serialnumber bigint,
	f_width int default 1 check (f_width >= 0),
	f_height int default 1 check (f_height >= 0),
	f_lenswidth int default 1 check (f_lenswidth >= 0),
	f_lensheight int default 1 check (f_lensheight >= 0),
	f_bridge int default 1 check (f_bridge >= 0),
	f_templelength int  check (f_templelength >= 0),
	f_weight int default 1 check (f_weight >= 0),  
	f_rd_minrange int NULL,
	f_rd_maxrange int NULL, 
	f_prescription_minrange int default -20 ,
	f_prescription_maxrange int default +20 ,
	f_rimtype varchar(255) default 'Undefined',
	f_shape varchar(255) default 'Undefined',
	f_material varchar(255) default 'Undefined',
	f_minquantity bigint default 1 ,
	f_maxquantity bigint default 1 ,
	f_currentQuantity bigint,
	f_basePrice bigint check(f_basePrice >= 0),
	f_salePrice bigint check(f_salePrice >= 0),
	f_taxPrice bigint check(f_taxPrice >= 0),
	f_manufacturer int CONSTRAINT FK_ManufacturerFrame FOREIGN KEY (f_manufacturer) REFERENCES tbl_manufacturer(ma_id), --foreign key
	f_supplier int CONSTRAINT FK_SupplierFrame FOREIGN KEY (f_supplier) REFERENCES tbl_supplier(su_id),--foreign key
	CONSTRAINT frameMinQuantity check (f_minquantity <= f_maxquantity AND f_minquantity >= 0),
	CONSTRAINT frameMaxQuantity check (f_maxquantity >= f_minquantity AND f_maxquantity >= 1),
	CONSTRAINT prescriptionMinRange check(f_prescription_minrange <= f_prescription_maxrange),
	CONSTRAINT prescriptionMaxRange check(f_prescription_maxrange >= f_prescription_minrange)
)

create table tbl_customer(
	cu_id int primary key,
	d_id int CONSTRAINT FK_CustomerDoctor FOREIGN KEY (d_id) REFERENCES tbl_doctor(d_id), --foreign key,
	cu_fname varchar(255) default 'Unregistered',
	cu_lname varchar(255) default 'user',
	cu_type varchar(255) default 'purchase',
	cu_contactnumber int default 0,
	cu_streetaddress varchar(255),
	cu_cityaddress varchar(255),--For doctors understanding
	pr_distance_od_sphere int NULL,
	pr_distance_od_axis int NULL,
	pr_distance_od_prism int NULL,
	pr_distance_od_base int NULL,
	pr_distance_od_cylinder int NULL,
	pr_distance_os_sphere int NULL,
	pr_distance_os_axis int NULL,
	pr_distance_os_prism int NULL,
	pr_distance_os_base int NULL,
	pr_distance_os_cylinder int NULL,
	pr_add_os_sphere int NULL,
	pr_add_od_sphere int NULL,
)


create table tbl_purchase (
	p_id int primary key, 
	f_id int CONSTRAINT FK_PurchaseFrame FOREIGN KEY (f_id) REFERENCES tbl_frames(f_id), --foreign key
	l_id int CONSTRAINT FK_PurchaseLens FOREIGN KEY (l_id) REFERENCES tbl_lens(l_id), --foreign key
	g_id int CONSTRAINT FK_PurchaseGlass FOREIGN KEY (g_id) REFERENCES tbl_glass(g_id), --foreign key
	c_id int CONSTRAINT FK_PurchaseCoating FOREIGN KEY (c_id) REFERENCES tbl_coating(c_id), --foreign key
	cu_id int CONSTRAINT FK_PurchaseCustomer FOREIGN KEY (cu_id) REFERENCES tbl_customer(cu_id), --foreign key
	emp_id int CONSTRAINT FK_PurchaseEmployee FOREIGN KEY (c_id) REFERENCES tbl_employee(e_id), --foreign key
	payment_status varchar(255) default 'Undefined',
	purchase_status varchar(255) default 'Undefined',
	payment_completion_date DATE default getDate(),
	purchase_completion_date DATE default getDate()
)

create table tbl_product_supplier (
	ps_id int primary key,
	f_id int CONSTRAINT FK_ProductSupplierFrame FOREIGN KEY (f_id) REFERENCES tbl_frames(f_id), --foreign key
	l_id int CONSTRAINT FK_ProductSupplierLens FOREIGN KEY (l_id) REFERENCES tbl_lens(l_id), --foreign key
	g_id int CONSTRAINT FK_ProductSupplierGlass FOREIGN KEY (g_id) REFERENCES tbl_glass(g_id), --foreign key
	c_id int CONSTRAINT FK_ProductSupplierCoating FOREIGN KEY (c_id) REFERENCES tbl_coating(c_id), --foreign key
	s_id int CONSTRAINT FK_ProductSupplierSupplier FOREIGN KEY (s_id) REFERENCES tbl_supplier(su_id), --foreign key
)

