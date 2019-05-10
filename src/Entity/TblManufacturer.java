package Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_manufacturer", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblManufacturer {
    private int maId;
    private String maFname;
    private String maLname;
    private Integer maContactnumber;
    private String maStreetaddress;
    private String maCityaddress;

    @Id
    @Column(name = "ma_id", nullable = false)
    public int getMaId() {
        return maId;
    }

    public void setMaId(int maId) {
        this.maId = maId;
    }

    @Basic
    @Column(name = "ma_fname", nullable = true, length = 255)
    public String getMaFname() {
        return maFname;
    }

    public void setMaFname(String maFname) {
        this.maFname = maFname;
    }

    @Basic
    @Column(name = "ma_lname", nullable = true, length = 255)
    public String getMaLname() {
        return maLname;
    }

    public void setMaLname(String maLname) {
        this.maLname = maLname;
    }

    @Basic
    @Column(name = "ma_contactnumber", nullable = true)
    public Integer getMaContactnumber() {
        return maContactnumber;
    }

    public void setMaContactnumber(Integer maContactnumber) {
        this.maContactnumber = maContactnumber;
    }

    @Basic
    @Column(name = "ma_streetaddress", nullable = true, length = 255)
    public String getMaStreetaddress() {
        return maStreetaddress;
    }

    public void setMaStreetaddress(String maStreetaddress) {
        this.maStreetaddress = maStreetaddress;
    }

    @Basic
    @Column(name = "ma_cityaddress", nullable = true, length = 255)
    public String getMaCityaddress() {
        return maCityaddress;
    }

    public void setMaCityaddress(String maCityaddress) {
        this.maCityaddress = maCityaddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblManufacturer that = (TblManufacturer) o;
        return maId == that.maId &&
                Objects.equals(maFname, that.maFname) &&
                Objects.equals(maLname, that.maLname) &&
                Objects.equals(maContactnumber, that.maContactnumber) &&
                Objects.equals(maStreetaddress, that.maStreetaddress) &&
                Objects.equals(maCityaddress, that.maCityaddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maId, maFname, maLname, maContactnumber, maStreetaddress, maCityaddress);
    }

}
