package Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_employee", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblEmployee {
    private int eId;
    private String eUname;
    private String eFname;
    private String eLname;
    private String ePassword;
    private String eType;
    private Date eDatestart;
    private Integer eContactnumber;
    private String eStreetAddress;
    private String eCityAddress;
    private Integer eBaseSalary;
    private Integer eBonuses;
    private Integer eReductions;
    private TblPhone tblPhoneByEContactnumber;
    private Collection<TblPurchase> tblPurchasesByEId;

    @Id
    @Column(name = "e_id", nullable = false)
    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    @Basic
    @Column(name = "e_uname", nullable = true, length = 255)
    public String geteUname() {
        return eUname;
    }

    public void seteUname(String eUname) {
        this.eUname = eUname;
    }

    @Basic
    @Column(name = "e_fname", nullable = true, length = 255)
    public String geteFname() {
        return eFname;
    }

    public void seteFname(String eFname) {
        this.eFname = eFname;
    }

    @Basic
    @Column(name = "e_lname", nullable = true, length = 255)
    public String geteLname() {
        return eLname;
    }

    public void seteLname(String eLname) {
        this.eLname = eLname;
    }

    @Basic
    @Column(name = "e_password", nullable = true, length = 255)
    public String getePassword() {
        return ePassword;
    }

    public void setePassword(String ePassword) {
        this.ePassword = ePassword;
    }

    @Basic
    @Column(name = "e_type", nullable = true, length = 255)
    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType;
    }

    @Basic
    @Column(name = "e_datestart", nullable = true)
    public Date geteDatestart() {
        return eDatestart;
    }

    public void seteDatestart(Date eDatestart) {
        this.eDatestart = eDatestart;
    }

    @Basic
    @Column(name = "e_contactnumber", nullable = true)
    public Integer geteContactnumber() {
        return eContactnumber;
    }

    public void seteContactnumber(Integer eContactnumber) {
        this.eContactnumber = eContactnumber;
    }

    @Basic
    @Column(name = "e_street_address", nullable = true, length = 255)
    public String geteStreetAddress() {
        return eStreetAddress;
    }

    public void seteStreetAddress(String eStreetAddress) {
        this.eStreetAddress = eStreetAddress;
    }

    @Basic
    @Column(name = "e_city_address", nullable = true, length = 255)
    public String geteCityAddress() {
        return eCityAddress;
    }

    public void seteCityAddress(String eCityAddress) {
        this.eCityAddress = eCityAddress;
    }

    @Basic
    @Column(name = "e_base_salary", nullable = true)
    public Integer geteBaseSalary() {
        return eBaseSalary;
    }

    public void seteBaseSalary(Integer eBaseSalary) {
        this.eBaseSalary = eBaseSalary;
    }

    @Basic
    @Column(name = "e_bonuses", nullable = true)
    public Integer geteBonuses() {
        return eBonuses;
    }

    public void seteBonuses(Integer eBonuses) {
        this.eBonuses = eBonuses;
    }

    @Basic
    @Column(name = "e_reductions", nullable = true)
    public Integer geteReductions() {
        return eReductions;
    }

    public void seteReductions(Integer eReductions) {
        this.eReductions = eReductions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblEmployee that = (TblEmployee) o;
        return eId == that.eId &&
                Objects.equals(eUname, that.eUname) &&
                Objects.equals(eFname, that.eFname) &&
                Objects.equals(eLname, that.eLname) &&
                Objects.equals(ePassword, that.ePassword) &&
                Objects.equals(eType, that.eType) &&
                Objects.equals(eDatestart, that.eDatestart) &&
                Objects.equals(eContactnumber, that.eContactnumber) &&
                Objects.equals(eStreetAddress, that.eStreetAddress) &&
                Objects.equals(eCityAddress, that.eCityAddress) &&
                Objects.equals(eBaseSalary, that.eBaseSalary) &&
                Objects.equals(eBonuses, that.eBonuses) &&
                Objects.equals(eReductions, that.eReductions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eId, eUname, eFname, eLname, ePassword, eType, eDatestart, eContactnumber, eStreetAddress, eCityAddress, eBaseSalary, eBonuses, eReductions);
    }

    @ManyToOne
    @JoinColumn(name = "e_contactnumber", referencedColumnName = "ph_id")
    public TblPhone getTblPhoneByEContactnumber() {
        return tblPhoneByEContactnumber;
    }

    public void setTblPhoneByEContactnumber(TblPhone tblPhoneByEContactnumber) {
        this.tblPhoneByEContactnumber = tblPhoneByEContactnumber;
    }

    @OneToMany(mappedBy = "tblEmployeeByCId")
    public Collection<TblPurchase> getTblPurchasesByEId() {
        return tblPurchasesByEId;
    }

    public void setTblPurchasesByEId(Collection<TblPurchase> tblPurchasesByEId) {
        this.tblPurchasesByEId = tblPurchasesByEId;
    }
}
