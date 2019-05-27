package main.Entity;

public class Glass {
    private int gId;
    private String gType;
    private Long gMinquantity;
    private Long gMaxquantity;
    private Long gCurrentQuantity;
    private Long gBasePrice;
    private Long gSalePrice;
    private Long gTaxPrice;
    private Integer gManufacturer;

    public Glass(int gId, String gType, Long gMinquantity, Long gMaxquantity, Long gCurrentQuantity, Long gBasePrice, Long gSalePrice, Long gTaxPrice, Integer gManufacturer) {
        this.gId = gId;
        this.gType = gType;
        this.gMinquantity = gMinquantity;
        this.gMaxquantity = gMaxquantity;
        this.gCurrentQuantity = gCurrentQuantity;
        this.gBasePrice = gBasePrice;
        this.gSalePrice = gSalePrice;
        this.gTaxPrice = gTaxPrice;
        this.gManufacturer = gManufacturer;
    }

    public Glass(String gType, Long gMinquantity, Long gMaxquantity, Long gCurrentQuantity, Long gBasePrice, Long gSalePrice, Long gTaxPrice, Integer gManufacturer) {
        this.gType = gType;
        this.gMinquantity = gMinquantity;
        this.gMaxquantity = gMaxquantity;
        this.gCurrentQuantity = gCurrentQuantity;
        this.gBasePrice = gBasePrice;
        this.gSalePrice = gSalePrice;
        this.gTaxPrice = gTaxPrice;
        this.gManufacturer = gManufacturer;
    }

    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType;
    }

    public Long getgMinquantity() {
        return gMinquantity;
    }

    public void setgMinquantity(Long gMinquantity) {
        this.gMinquantity = gMinquantity;
    }

    public Long getgMaxquantity() {
        return gMaxquantity;
    }

    public void setgMaxquantity(Long gMaxquantity) {
        this.gMaxquantity = gMaxquantity;
    }

    public Long getgCurrentQuantity() {
        return gCurrentQuantity;
    }

    public void setgCurrentQuantity(Long gCurrentQuantity) {
        this.gCurrentQuantity = gCurrentQuantity;
    }

    public Long getgBasePrice() {
        return gBasePrice;
    }

    public void setgBasePrice(Long gBasePrice) {
        this.gBasePrice = gBasePrice;
    }

    public Long getgSalePrice() {
        return gSalePrice;
    }

    public void setgSalePrice(Long gSalePrice) {
        this.gSalePrice = gSalePrice;
    }

    public Long getgTaxPrice() {
        return gTaxPrice;
    }

    public void setgTaxPrice(Long gTaxPrice) {
        this.gTaxPrice = gTaxPrice;
    }

    public Integer getgManufacturer() {
        return gManufacturer;
    }

    public void setgManufacturer(Integer gManufacturer) {
        this.gManufacturer = gManufacturer;
    }
}
