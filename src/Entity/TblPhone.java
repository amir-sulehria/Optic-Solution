package Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_phone", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblPhone {
    private int phId;
    private int ph_uid;
    private Integer phNo;
    private String phUserDesignation;

    public TblPhone(int phId, int ph_uid, Integer phNo, String phUserDesignation) {
        this.phId = phId;
        this.ph_uid = ph_uid;
        this.phNo = phNo;
        this.phUserDesignation = phUserDesignation;
    }

    @Id
    @Column(name = "ph_id", nullable = false)
    public int getPhId() {
        return phId;
    }

    public void setPhId(int phId) {
        this.phId = phId;
    }

    @Basic
    @Column(name = "ph_uid", nullable = true)
    public int getPh_uid(){ return ph_uid;}
    public void setPh_uid(int ph_uid) { this.ph_uid = ph_uid;}

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

}
