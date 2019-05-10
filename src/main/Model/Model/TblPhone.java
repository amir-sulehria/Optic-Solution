package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_phone", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblPhone {
    private int phId;
    private Integer phNo;
    private String phUserDesignation;
    private Collection<TblEmployee> tblEmployeesByPhId;
    private Collection<TblManufacturer> tblManufacturersByPhId;
    private Collection<TblSupplier> tblSuppliersByPhId;

    @Id
    @Column(name = "ph_id", nullable = false)
    public int getPhId() {
        return phId;
    }

    public void setPhId(int phId) {
        this.phId = phId;
    }

    @Basic
    @Column(name = "ph_no", nullable = true)
    public Integer getPhNo() {
        return phNo;
    }

    public void setPhNo(Integer phNo) {
        this.phNo = phNo;
    }

    @Basic
    @Column(name = "ph_user_designation", nullable = true, length = 255)
    public String getPhUserDesignation() {
        return phUserDesignation;
    }

    public void setPhUserDesignation(String phUserDesignation) {
        this.phUserDesignation = phUserDesignation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblPhone tblPhone = (TblPhone) o;
        return phId == tblPhone.phId &&
                Objects.equals(phNo, tblPhone.phNo) &&
                Objects.equals(phUserDesignation, tblPhone.phUserDesignation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phId, phNo, phUserDesignation);
    }

    @OneToMany(mappedBy = "tblPhoneByEContactnumber")
    public Collection<TblEmployee> getTblEmployeesByPhId() {
        return tblEmployeesByPhId;
    }

    public void setTblEmployeesByPhId(Collection<TblEmployee> tblEmployeesByPhId) {
        this.tblEmployeesByPhId = tblEmployeesByPhId;
    }

    @OneToMany(mappedBy = "tblPhoneByMaContactnumber")
    public Collection<TblManufacturer> getTblManufacturersByPhId() {
        return tblManufacturersByPhId;
    }

    public void setTblManufacturersByPhId(Collection<TblManufacturer> tblManufacturersByPhId) {
        this.tblManufacturersByPhId = tblManufacturersByPhId;
    }

    @OneToMany(mappedBy = "tblPhoneBySuContactnumber")
    public Collection<TblSupplier> getTblSuppliersByPhId() {
        return tblSuppliersByPhId;
    }

    public void setTblSuppliersByPhId(Collection<TblSupplier> tblSuppliersByPhId) {
        this.tblSuppliersByPhId = tblSuppliersByPhId;
    }
}
