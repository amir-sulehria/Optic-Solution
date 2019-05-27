package main.Entity;


import java.util.Date;

public class Purchase {
    private int pId;
    private String paymentStatus;
    private String purchaseStatus;
    private String purchaseType;
    private Date paymentCompletionDate;
    private Object paymentCompletionTime;
    private Date purchaseCompletionDate;
    private Object purchaseCompletionTime;
    private Integer cuId;
    private Integer empId;

    public Purchase(String paymentStatus, String purchaseStatus, String purchaseType, Date paymentCompletionDate, Object paymentCompletionTime, Date purchaseCompletionDate, Object purchaseCompletionTime, Integer cuId, Integer empId) {
        this.paymentStatus = paymentStatus;
        this.purchaseStatus = purchaseStatus;
        this.purchaseType = purchaseType;
        this.paymentCompletionDate = paymentCompletionDate;
        this.paymentCompletionTime = paymentCompletionTime;
        this.purchaseCompletionDate = purchaseCompletionDate;
        this.purchaseCompletionTime = purchaseCompletionTime;
        this.cuId = cuId;
        this.empId = empId;
    }

    public Purchase(int pId, String paymentStatus, String purchaseStatus, String purchaseType, Date paymentCompletionDate, Object paymentCompletionTime, Date purchaseCompletionDate, Object purchaseCompletionTime, Integer cuId, Integer empId) {
        this.pId = pId;
        this.paymentStatus = paymentStatus;
        this.purchaseStatus = purchaseStatus;
        this.purchaseType = purchaseType;
        this.paymentCompletionDate = paymentCompletionDate;
        this.paymentCompletionTime = paymentCompletionTime;
        this.purchaseCompletionDate = purchaseCompletionDate;
        this.purchaseCompletionTime = purchaseCompletionTime;
        this.cuId = cuId;
        this.empId = empId;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getPurchaseStatus() {
        return purchaseStatus;
    }

    public void setPurchaseStatus(String purchaseStatus) {
        this.purchaseStatus = purchaseStatus;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public Date getPaymentCompletionDate() {
        return paymentCompletionDate;
    }

    public void setPaymentCompletionDate(Date paymentCompletionDate) {
        this.paymentCompletionDate = paymentCompletionDate;
    }

    public Object getPaymentCompletionTime() {
        return paymentCompletionTime;
    }

    public void setPaymentCompletionTime(Object paymentCompletionTime) {
        this.paymentCompletionTime = paymentCompletionTime;
    }

    public Date getPurchaseCompletionDate() {
        return purchaseCompletionDate;
    }

    public void setPurchaseCompletionDate(Date purchaseCompletionDate) {
        this.purchaseCompletionDate = purchaseCompletionDate;
    }

    public Object getPurchaseCompletionTime() {
        return purchaseCompletionTime;
    }

    public void setPurchaseCompletionTime(Object purchaseCompletionTime) {
        this.purchaseCompletionTime = purchaseCompletionTime;
    }

    public Integer getCuId() {
        return cuId;
    }

    public void setCuId(Integer cuId) {
        this.cuId = cuId;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}
