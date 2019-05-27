package main.Entity;

public class Productaccounts {
    private int prId;
    private Integer acId;
    private Integer fId;
    private Integer lId;
    private Integer gId;
    private Integer cId;

    public int getPrId() {
        return prId;
    }

    public void setPrId(int prId) {
        this.prId = prId;
    }

    public Integer getAcId() {
        return acId;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
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

    public Productaccounts(Integer acId, Integer fId, Integer lId, Integer gId, Integer cId) {
        this.acId = acId;
        this.fId = fId;
        this.lId = lId;
        this.gId = gId;
        this.cId = cId;
    }

    public Productaccounts(int prId, Integer acId, Integer fId, Integer lId, Integer gId, Integer cId) {
        this.prId = prId;
        this.acId = acId;
        this.fId = fId;
        this.lId = lId;
        this.gId = gId;
        this.cId = cId;
    }
}
