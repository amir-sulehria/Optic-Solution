package main.Entity;

public class Lens {
    private int lId;
    private String lType;
    private Long lMinquantity;
    private Long lMaxquantity;
    private Long lCurrentQuantity;
    private Long lBasePrice;
    private Long lSalePrice;
    private Long lTaxPrice;
    private Integer lManufacturer;
    private Manufacturer manufacturerByLManufacturer;

    public Lens(int lId, String lType, Long lMinquantity, Long lMaxquantity, Long lCurrentQuantity, Long lBasePrice, Long lSalePrice, Long lTaxPrice, Integer lManufacturer, Manufacturer manufacturerByLManufacturer) {
        this.lId = lId;
        this.lType = lType;
        this.lMinquantity = lMinquantity;
        this.lMaxquantity = lMaxquantity;
        this.lCurrentQuantity = lCurrentQuantity;
        this.lBasePrice = lBasePrice;
        this.lSalePrice = lSalePrice;
        this.lTaxPrice = lTaxPrice;
        this.lManufacturer = lManufacturer;
        this.manufacturerByLManufacturer = manufacturerByLManufacturer;
    }

    public Lens(String lType, Long lMinquantity, Long lMaxquantity, Long lCurrentQuantity, Long lBasePrice, Long lSalePrice, Long lTaxPrice, Integer lManufacturer, Manufacturer manufacturerByLManufacturer) {
        this.lType = lType;
        this.lMinquantity = lMinquantity;
        this.lMaxquantity = lMaxquantity;
        this.lCurrentQuantity = lCurrentQuantity;
        this.lBasePrice = lBasePrice;
        this.lSalePrice = lSalePrice;
        this.lTaxPrice = lTaxPrice;
        this.lManufacturer = lManufacturer;
        this.manufacturerByLManufacturer = manufacturerByLManufacturer;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    public void setlType(String lType) {
        this.lType = lType;
    }

    public void setlMinquantity(Long lMinquantity) {
        this.lMinquantity = lMinquantity;
    }

    public void setlMaxquantity(Long lMaxquantity) {
        this.lMaxquantity = lMaxquantity;
    }

    public void setlCurrentQuantity(Long lCurrentQuantity) {
        this.lCurrentQuantity = lCurrentQuantity;
    }

    public void setlBasePrice(Long lBasePrice) {
        this.lBasePrice = lBasePrice;
    }

    public void setlSalePrice(Long lSalePrice) {
        this.lSalePrice = lSalePrice;
    }

    public void setlTaxPrice(Long lTaxPrice) {
        this.lTaxPrice = lTaxPrice;
    }

    public void setlManufacturer(Integer lManufacturer) {
        this.lManufacturer = lManufacturer;
    }

    public void setManufacturerByLManufacturer(Manufacturer manufacturerByLManufacturer) {
        this.manufacturerByLManufacturer = manufacturerByLManufacturer;
    }

    public int getlId() {
        return lId;
    }

    public String getlType() {
        return lType;
    }

    public Long getlMinquantity() {
        return lMinquantity;
    }

    public Long getlMaxquantity() {
        return lMaxquantity;
    }

    public Long getlCurrentQuantity() {
        return lCurrentQuantity;
    }

    public Long getlBasePrice() {
        return lBasePrice;
    }

    public Long getlSalePrice() {
        return lSalePrice;
    }

    public Long getlTaxPrice() {
        return lTaxPrice;
    }

    public Integer getlManufacturer() {
        return lManufacturer;
    }

    public Manufacturer getManufacturerByLManufacturer() {
        return manufacturerByLManufacturer;
    }
}
