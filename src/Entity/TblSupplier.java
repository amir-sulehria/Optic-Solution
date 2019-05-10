package Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_supplier", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblSupplier {
    private int suId;
    private String suFname;
    private String suLname;
    private Integer suContactnumber;
    private String suStreetaddress;
    private String suCityaddress;
    private Integer suCharges;

    @Id
    @Column(name = "su_id", nullable = false)
    public int getSuId() {
        return suId;
    }

    public void setSuId(int suId) {
        this.suId = suId;
    }

    @Basic
    @Column(name = "su_fname", nullable = true, length = 255)
    public String getSuFname() {
        return suFname;
    }

    public void setSuFname(String suFname) {
        this.suFname = suFname;
    }

    @Basic
    @Column(name = "su_lname", nullable = true, length = 255)
    public String getSuLname() {
        return suLname;
    }

    public void setSuLname(String suLname) {
        this.suLname = suLname;
    }

    @Basic
    @Column(name = "su_contactnumber", nullable = true)
    public Integer getSuContactnumber() {
        return suContactnumber;
    }

    public void setSuContactnumber(Integer suContactnumber) {
        this.suContactnumber = suContactnumber;
    }

    @Basic
    @Column(name = "su_streetaddress", nullable = true, length = 255)
    public String getSuStreetaddress() {
        return suStreetaddress;
    }

    public void setSuStreetaddress(String suStreetaddress) {
        this.suStreetaddress = suStreetaddress;
    }

    @Basic
    @Column(name = "su_cityaddress", nullable = true, length = 255)
    public String getSuCityaddress() {
        return suCityaddress;
    }

    public void setSuCityaddress(String suCityaddress) {
        this.suCityaddress = suCityaddress;
    }

    @Basic
    @Column(name = "su_charges", nullable = true)
    public Integer getSuCharges() {
        return suCharges;
    }

    public void setSuCharges(Integer suCharges) {
        this.suCharges = suCharges;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblSupplier that = (TblSupplier) o;
        return suId == that.suId &&
                Objects.equals(suFname, that.suFname) &&
                Objects.equals(suLname, that.suLname) &&
                Objects.equals(suContactnumber, that.suContactnumber) &&
                Objects.equals(suStreetaddress, that.suStreetaddress) &&
                Objects.equals(suCityaddress, that.suCityaddress) &&
                Objects.equals(suCharges, that.suCharges);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suId, suFname, suLname, suContactnumber, suStreetaddress, suCityaddress, suCharges);
    }

}
