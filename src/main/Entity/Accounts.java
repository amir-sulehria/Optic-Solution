package main.Entity;

import java.util.Date;

public class Accounts {
    private int acId;
    private Integer eId;
    private Integer suId;
    private Integer pId;
    private Integer acCost;
    private Date acDate;
    private Object acTime;
    private String acCostType;
    private String acCostDescription;
    private Employee employeeByEId;
    private Supplier supplierBySuId;
    private Purchase purchaseByPId;

    public Accounts(int acId, Integer eId, Integer suId, Integer pId, Integer acCost, Date acDate, Object acTime, String acCostType, String acCostDescription, Employee employeeByEId, Supplier supplierBySuId, Purchase purchaseByPId) {
        this.acId = acId;
        this.eId = eId;
        this.suId = suId;
        this.pId = pId;
        this.acCost = acCost;
        this.acDate = acDate;
        this.acTime = acTime;
        this.acCostType = acCostType;
        this.acCostDescription = acCostDescription;
        this.employeeByEId = employeeByEId;
        this.supplierBySuId = supplierBySuId;
        this.purchaseByPId = purchaseByPId;
    }

    public Accounts(Integer eId, Integer suId, Integer pId, Integer acCost, Date acDate, Object acTime, String acCostType, String acCostDescription, Employee employeeByEId, Supplier supplierBySuId, Purchase purchaseByPId) {
        this.eId = eId;
        this.suId = suId;
        this.pId = pId;
        this.acCost = acCost;
        this.acDate = acDate;
        this.acTime = acTime;
        this.acCostType = acCostType;
        this.acCostDescription = acCostDescription;
        this.employeeByEId = employeeByEId;
        this.supplierBySuId = supplierBySuId;
        this.purchaseByPId = purchaseByPId;
    }

    public int getAcId() {
        return acId;
    }

    public void setAcId(int acId) {
        this.acId = acId;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public Integer getSuId() {
        return suId;
    }

    public void setSuId(Integer suId) {
        this.suId = suId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getAcCost() {
        return acCost;
    }

    public void setAcCost(Integer acCost) {
        this.acCost = acCost;
    }

    public Date getAcDate() {
        return acDate;
    }

    public void setAcDate(Date acDate) {
        this.acDate = acDate;
    }

    public Object getAcTime() {
        return acTime;
    }

    public void setAcTime(Object acTime) {
        this.acTime = acTime;
    }

    public String getAcCostType() {
        return acCostType;
    }

    public void setAcCostType(String acCostType) {
        this.acCostType = acCostType;
    }

    public String getAcCostDescription() {
        return acCostDescription;
    }

    public void setAcCostDescription(String acCostDescription) {
        this.acCostDescription = acCostDescription;
    }

    public Employee getEmployeeByEId() {
        return employeeByEId;
    }

    public void setEmployeeByEId(Employee employeeByEId) {
        this.employeeByEId = employeeByEId;
    }

    public Supplier getSupplierBySuId() {
        return supplierBySuId;
    }

    public void setSupplierBySuId(Supplier supplierBySuId) {
        this.supplierBySuId = supplierBySuId;
    }

    public Purchase getPurchaseByPId() {
        return purchaseByPId;
    }

    public void setPurchaseByPId(Purchase purchaseByPId) {
        this.purchaseByPId = purchaseByPId;
    }
}
