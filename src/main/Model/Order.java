
package main.Model;

import java.util.Date;

public class Order {

    private int p_id;
    private String cust_name;
    private String emp_name;
    private int price;
    private String purch_status;
    private String purch_date;
    private String pay_status;
    private String pay_date;
    private String purch_type;

    public int getP_id() {
        return p_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public int getPrice() {
        return price;
    }

    public String getPurch_status() {
        return purch_status;
    }

    public String getPurch_date() {
        return purch_date;
    }

    public String getPay_status() {
        return pay_status;
    }

    public String getPay_date() {
        return pay_date;
    }

    public String getPurch_type() {
        return purch_type;
    }

    public Order(String c_name, String e_name){
        this.cust_name = c_name;
        this.emp_name = e_name;
    }

    public Order(int p_id, String cust_name, String emp_name, int price, String purch_status, String purch_date, String pay_status, String pay_date, String purch_type) {
        this.p_id = p_id;
        this.cust_name = cust_name;
        this.emp_name = emp_name;
        this.price = price;
        this.purch_status = purch_status;
        this.purch_date = purch_date;
        this.pay_status = pay_status;
        this.pay_date = pay_date;
        this.purch_type = purch_type;
    }
}
