package main.Entity;

public class Productpurchase {
    private int prId;
    private Integer pId;
    private Integer fId;
    private Integer lId;
    private Integer gId;
    private Integer cId;

    public Productpurchase(Integer pId, Integer fId, Integer lId, Integer gId, Integer cId) {
        this.pId = pId;
        this.fId = fId;
        this.lId = lId;
        this.gId = gId;
        this.cId = cId;
    }

    public Productpurchase(int prId, Integer pId, Integer fId, Integer lId, Integer gId, Integer cId) {
        this.prId = prId;
        this.pId = pId;
        this.fId = fId;
        this.lId = lId;
        this.gId = gId;
        this.cId = cId;
    }

    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
    }

    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public Integer getfId() {
        return fId;
    }

    public void setfId(Integer fId) {
        this.fId = fId;
    }

    public Integer getlId() {
        return lId;
    }

    public void setlId(Integer lId) {
        this.lId = lId;
    }

    public Integer getgId() {
        return gId;
    }

    public void setgId(Integer gId) {
        this.gId = gId;
    }

    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }
}
