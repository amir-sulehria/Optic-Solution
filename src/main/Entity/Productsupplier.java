package main.Entity;

public class Productsupplier {
    private int psId;
    private Integer fId;
    private Integer lId;
    private Integer gId;
    private Integer cId;
    private Integer suId;

    public Productsupplier(Integer fId, Integer lId, Integer gId, Integer cId, Integer suId) {
        this.fId = fId;
        this.lId = lId;
        this.gId = gId;
        this.cId = cId;
        this.suId = suId;
    }

    public Productsupplier(int psId, Integer fId, Integer lId, Integer gId, Integer cId, Integer suId) {
        this.psId = psId;
        this.fId = fId;
        this.lId = lId;
        this.gId = gId;
        this.cId = cId;
        this.suId = suId;
    }

    public int getPsId() {
        return psId;
    }

    public void setPsId(int psId) {
        this.psId = psId;
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

    public Integer getSuId() {
        return suId;
    }

    public void setSuId(Integer suId) {
        this.suId = suId;
    }
}
