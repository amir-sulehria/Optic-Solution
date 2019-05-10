package Model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tbl_product_supplier", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblProductSupplier {
    private int psId;
    private Integer fId;
    private Integer lId;
    private Integer gId;
    private Integer cId;
    private Integer sId;
    private TblFrames tblFramesByFId;
    private TblLens tblLensByLId;
    private TblGlass tblGlassByGId;
    private TblCoating tblCoatingByCId;
    private TblSupplier tblSupplierBySId;

    @Id
    @Column(name = "ps_id", nullable = false)
    public int getPsId() {
        return psId;
    }

    public void setPsId(int psId) {
        this.psId = psId;
    }

    @Basic
    @Column(name = "f_id", nullable = true)
    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "l_id", nullable = true)
    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    @Basic
    @Column(name = "g_id", nullable = true)
    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    @Basic
    @Column(name = "c_id", nullable = true)
    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "s_id", nullable = true)
    public Integer getsId() {
        return sId;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblProductSupplier that = (TblProductSupplier) o;
        return psId == that.psId &&
                Objects.equals(fId, that.fId) &&
                Objects.equals(lId, that.lId) &&
                Objects.equals(gId, that.gId) &&
                Objects.equals(cId, that.cId) &&
                Objects.equals(sId, that.sId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(psId, fId, lId, gId, cId, sId);
    }

    @ManyToOne
    @JoinColumn(name = "f_id", referencedColumnName = "f_id")
    public TblFrames getTblFramesByFId() {
        return tblFramesByFId;
    }

    public void setTblFramesByFId(TblFrames tblFramesByFId) {
        this.tblFramesByFId = tblFramesByFId;
    }

    @ManyToOne
    @JoinColumn(name = "l_id", referencedColumnName = "l_id")
    public TblLens getTblLensByLId() {
        return tblLensByLId;
    }

    public void setTblLensByLId(TblLens tblLensByLId) {
        this.tblLensByLId = tblLensByLId;
    }

    @ManyToOne
    @JoinColumn(name = "g_id", referencedColumnName = "g_id")
    public TblGlass getTblGlassByGId() {
        return tblGlassByGId;
    }

    public void setTblGlassByGId(TblGlass tblGlassByGId) {
        this.tblGlassByGId = tblGlassByGId;
    }

    @ManyToOne
    @JoinColumn(name = "c_id", referencedColumnName = "c_id")
    public TblCoating getTblCoatingByCId() {
        return tblCoatingByCId;
    }

    public void setTblCoatingByCId(TblCoating tblCoatingByCId) {
        this.tblCoatingByCId = tblCoatingByCId;
    }

    @ManyToOne
    @JoinColumn(name = "s_id", referencedColumnName = "su_id")
    public TblSupplier getTblSupplierBySId() {
        return tblSupplierBySId;
    }

    public void setTblSupplierBySId(TblSupplier tblSupplierBySId) {
        this.tblSupplierBySId = tblSupplierBySId;
    }
}
