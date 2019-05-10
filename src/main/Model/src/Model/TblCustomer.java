package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_customer", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblCustomer {
    private int cuId;
    private String cuFname;
    private String cuLname;
    private String cuType;
    private Integer cuContactnumber;
    private String cuStreetaddress;
    private String cuCityaddress;
    private Integer prDistanceOdSphere;
    private Integer prDistanceOdAxis;
    private Integer prDistanceOdPrism;
    private Integer prDistanceOdBase;
    private Integer prDistanceOdCylinder;
    private Integer prDistanceOsSphere;
    private Integer prDistanceOsAxis;
    private Integer prDistanceOsPrism;
    private Integer prDistanceOsBase;
    private Integer prDistanceOsCylinder;
    private Integer prAddOsSphere;
    private Integer prAddOdSphere;
    private Collection<TblPurchase> tblPurchasesByCuId;

    @Id
    @Column(name = "cu_id", nullable = false)
    public int getCuId() {
        return cuId;
    }

    public void setCuId(int cuId) {
        this.cuId = cuId;
    }

    @Basic
    @Column(name = "cu_fname", nullable = true, length = 255)
    public String getCuFname() {
        return cuFname;
    }

    public void setCuFname(String cuFname) {
        this.cuFname = cuFname;
    }

    @Basic
    @Column(name = "cu_lname", nullable = true, length = 255)
    public String getCuLname() {
        return cuLname;
    }

    public void setCuLname(String cuLname) {
        this.cuLname = cuLname;
    }

    @Basic
    @Column(name = "cu_type", nullable = true, length = 255)
    public String getCuType() {
        return cuType;
    }

    public void setCuType(String cuType) {
        this.cuType = cuType;
    }

    @Basic
    @Column(name = "cu_contactnumber", nullable = true)
    public Integer getCuContactnumber() {
        return cuContactnumber;
    }

    public void setCuContactnumber(Integer cuContactnumber) {
        this.cuContactnumber = cuContactnumber;
    }

    @Basic
    @Column(name = "cu_streetaddress", nullable = true, length = 255)
    public String getCuStreetaddress() {
        return cuStreetaddress;
    }

    public void setCuStreetaddress(String cuStreetaddress) {
        this.cuStreetaddress = cuStreetaddress;
    }

    @Basic
    @Column(name = "cu_cityaddress", nullable = true, length = 255)
    public String getCuCityaddress() {
        return cuCityaddress;
    }

    public void setCuCityaddress(String cuCityaddress) {
        this.cuCityaddress = cuCityaddress;
    }

    @Basic
    @Column(name = "pr_distance_od_sphere", nullable = true)
    public Integer getPrDistanceOdSphere() {
        return prDistanceOdSphere;
    }

    public void setPrDistanceOdSphere(Integer prDistanceOdSphere) {
        this.prDistanceOdSphere = prDistanceOdSphere;
    }

    @Basic
    @Column(name = "pr_distance_od_axis", nullable = true)
    public Integer getPrDistanceOdAxis() {
        return prDistanceOdAxis;
    }

    public void setPrDistanceOdAxis(Integer prDistanceOdAxis) {
        this.prDistanceOdAxis = prDistanceOdAxis;
    }

    @Basic
    @Column(name = "pr_distance_od_prism", nullable = true)
    public Integer getPrDistanceOdPrism() {
        return prDistanceOdPrism;
    }

    public void setPrDistanceOdPrism(Integer prDistanceOdPrism) {
        this.prDistanceOdPrism = prDistanceOdPrism;
    }

    @Basic
    @Column(name = "pr_distance_od_base", nullable = true)
    public Integer getPrDistanceOdBase() {
        return prDistanceOdBase;
    }

    public void setPrDistanceOdBase(Integer prDistanceOdBase) {
        this.prDistanceOdBase = prDistanceOdBase;
    }

    @Basic
    @Column(name = "pr_distance_od_cylinder", nullable = true)
    public Integer getPrDistanceOdCylinder() {
        return prDistanceOdCylinder;
    }

    public void setPrDistanceOdCylinder(Integer prDistanceOdCylinder) {
        this.prDistanceOdCylinder = prDistanceOdCylinder;
    }

    @Basic
    @Column(name = "pr_distance_os_sphere", nullable = true)
    public Integer getPrDistanceOsSphere() {
        return prDistanceOsSphere;
    }

    public void setPrDistanceOsSphere(Integer prDistanceOsSphere) {
        this.prDistanceOsSphere = prDistanceOsSphere;
    }

    @Basic
    @Column(name = "pr_distance_os_axis", nullable = true)
    public Integer getPrDistanceOsAxis() {
        return prDistanceOsAxis;
    }

    public void setPrDistanceOsAxis(Integer prDistanceOsAxis) {
        this.prDistanceOsAxis = prDistanceOsAxis;
    }

    @Basic
    @Column(name = "pr_distance_os_prism", nullable = true)
    public Integer getPrDistanceOsPrism() {
        return prDistanceOsPrism;
    }

    public void setPrDistanceOsPrism(Integer prDistanceOsPrism) {
        this.prDistanceOsPrism = prDistanceOsPrism;
    }

    @Basic
    @Column(name = "pr_distance_os_base", nullable = true)
    public Integer getPrDistanceOsBase() {
        return prDistanceOsBase;
    }

    public void setPrDistanceOsBase(Integer prDistanceOsBase) {
        this.prDistanceOsBase = prDistanceOsBase;
    }

    @Basic
    @Column(name = "pr_distance_os_cylinder", nullable = true)
    public Integer getPrDistanceOsCylinder() {
        return prDistanceOsCylinder;
    }

    public void setPrDistanceOsCylinder(Integer prDistanceOsCylinder) {
        this.prDistanceOsCylinder = prDistanceOsCylinder;
    }

    @Basic
    @Column(name = "pr_add_os_sphere", nullable = true)
    public Integer getPrAddOsSphere() {
        return prAddOsSphere;
    }

    public void setPrAddOsSphere(Integer prAddOsSphere) {
        this.prAddOsSphere = prAddOsSphere;
    }

    @Basic
    @Column(name = "pr_add_od_sphere", nullable = true)
    public Integer getPrAddOdSphere() {
        return prAddOdSphere;
    }

    public void setPrAddOdSphere(Integer prAddOdSphere) {
        this.prAddOdSphere = prAddOdSphere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblCustomer that = (TblCustomer) o;
        return cuId == that.cuId &&
                Objects.equals(cuFname, that.cuFname) &&
                Objects.equals(cuLname, that.cuLname) &&
                Objects.equals(cuType, that.cuType) &&
                Objects.equals(cuContactnumber, that.cuContactnumber) &&
                Objects.equals(cuStreetaddress, that.cuStreetaddress) &&
                Objects.equals(cuCityaddress, that.cuCityaddress) &&
                Objects.equals(prDistanceOdSphere, that.prDistanceOdSphere) &&
                Objects.equals(prDistanceOdAxis, that.prDistanceOdAxis) &&
                Objects.equals(prDistanceOdPrism, that.prDistanceOdPrism) &&
                Objects.equals(prDistanceOdBase, that.prDistanceOdBase) &&
                Objects.equals(prDistanceOdCylinder, that.prDistanceOdCylinder) &&
                Objects.equals(prDistanceOsSphere, that.prDistanceOsSphere) &&
                Objects.equals(prDistanceOsAxis, that.prDistanceOsAxis) &&
                Objects.equals(prDistanceOsPrism, that.prDistanceOsPrism) &&
                Objects.equals(prDistanceOsBase, that.prDistanceOsBase) &&
                Objects.equals(prDistanceOsCylinder, that.prDistanceOsCylinder) &&
                Objects.equals(prAddOsSphere, that.prAddOsSphere) &&
                Objects.equals(prAddOdSphere, that.prAddOdSphere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuId, cuFname, cuLname, cuType, cuContactnumber, cuStreetaddress, cuCityaddress, prDistanceOdSphere, prDistanceOdAxis, prDistanceOdPrism, prDistanceOdBase, prDistanceOdCylinder, prDistanceOsSphere, prDistanceOsAxis, prDistanceOsPrism, prDistanceOsBase, prDistanceOsCylinder, prAddOsSphere, prAddOdSphere);
    }

    @OneToMany(mappedBy = "tblCustomerByCuId")
    public Collection<TblPurchase> getTblPurchasesByCuId() {
        return tblPurchasesByCuId;
    }

    public void setTblPurchasesByCuId(Collection<TblPurchase> tblPurchasesByCuId) {
        this.tblPurchasesByCuId = tblPurchasesByCuId;
    }
}
