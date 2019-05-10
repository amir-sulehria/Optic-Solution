package Model;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "tbl_purchase", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblPurchase {
    private int pId;
    private Integer fId;
    private Integer lId;
    private Integer gId;
    private Integer cId;
    private Integer cuId;
    private Integer empId;
    private String paymentStatus;
    private String purchaseStatus;
    private String purchaseType;
    private Date paymentCompletionDate;
    private Date purchaseCompletionDate;
    private TblFrames tblFramesByFId;
    private TblLens tblLensByLId;
    private TblGlass tblGlassByGId;
    private TblCoating tblCoatingByCId;
    private TblEmployee tblEmployeeByCId;
    private TblCustomer tblCustomerByCuId;

    @Id
    @Column(name = "p_id", nullable = false)
    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
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
    @Column(name = "cu_id", nullable = true)
    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    @Basic
    @Column(name = "emp_id", nullable = true)
    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    @Basic
    @Column(name = "payment_status", nullable = true, length = 255)
    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    @Basic
    @Column(name = "purchase_status", nullable = true, length = 255)
    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    @Basic
    @Column(name = "purchase_type", nullable = true, length = 255)
    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    @Basic
    @Column(name = "payment_completion_date", nullable = true)
    public Date getPaymentCompletionDate() {
        return paymentCompletionDate;
    }

    public void setPaymentCompletionDate(Date paymentCompletionDate) {
        this.paymentCompletionDate = paymentCompletionDate;
    }

    @Basic
    @Column(name = "purchase_completion_date", nullable = true)
    public Date getPurchaseCompletionDate() {
        return purchaseCompletionDate;
    }

    public void setPurchaseCompletionDate(Date purchaseCompletionDate) {
        this.purchaseCompletionDate = purchaseCompletionDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblPurchase that = (TblPurchase) o;
        return pId == that.pId &&
                Objects.equals(fId, that.fId) &&
                Objects.equals(lId, that.lId) &&
                Objects.equals(gId, that.gId) &&
                Objects.equals(cId, that.cId) &&
                Objects.equals(cuId, that.cuId) &&
                Objects.equals(empId, that.empId) &&
                Objects.equals(paymentStatus, that.paymentStatus) &&
                Objects.equals(purchaseStatus, that.purchaseStatus) &&
                Objects.equals(purchaseType, that.purchaseType) &&
                Objects.equals(paymentCompletionDate, that.paymentCompletionDate) &&
                Objects.equals(purchaseCompletionDate, that.purchaseCompletionDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pId, fId, lId, gId, cId, cuId, empId, paymentStatus, purchaseStatus, purchaseType, paymentCompletionDate, purchaseCompletionDate);
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
    @JoinColumn(name = "c_id", referencedColumnName = "e_id")
    public TblEmployee getTblEmployeeByCId() {
        return tblEmployeeByCId;
    }

    public void setTblEmployeeByCId(TblEmployee tblEmployeeByCId) {
        this.tblEmployeeByCId = tblEmployeeByCId;
    }

    @ManyToOne
    @JoinColumn(name = "cu_id", referencedColumnName = "cu_id")
    public TblCustomer getTblCustomerByCuId() {
        return tblCustomerByCuId;
    }

    public void setTblCustomerByCuId(TblCustomer tblCustomerByCuId) {
        this.tblCustomerByCuId = tblCustomerByCuId;
    }
}
