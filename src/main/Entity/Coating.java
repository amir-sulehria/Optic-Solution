package main.Entity;

public class Coating {
    private int cId;
    private String cType;
    private Long cMinquantity;
    private Long cMaxquantity;
    private Long cCurrentQuantity;
    private Long cBasePrice;
    private Long cSalePrice;
    private Long cTaxPrice;
    private Integer cManufacturer;
    private Manufacturer manufacturerByCManufacturer;

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    public Long getcMinquantity() {
        return cMinquantity;
    }

    public void setcMinquantity(Long cMinquantity) {
        this.cMinquantity = cMinquantity;
    }

    public Long getcMaxquantity() {
        return cMaxquantity;
    }

    public void setcMaxquantity(Long cMaxquantity) {
        this.cMaxquantity = cMaxquantity;
    }

    public Long getcCurrentQuantity() {
        return cCurrentQuantity;
    }

    public void setcCurrentQuantity(Long cCurrentQuantity) {
        this.cCurrentQuantity = cCurrentQuantity;
    }

    public Long getcBasePrice() {
        return cBasePrice;
    }

    public void setcBasePrice(Long cBasePrice) {
        this.cBasePrice = cBasePrice;
    }

    public Long getcSalePrice() {
        return cSalePrice;
    }

    public void setcSalePrice(Long cSalePrice) {
        this.cSalePrice = cSalePrice;
    }

    public Long getcTaxPrice() {
        return cTaxPrice;
    }

    public void setcTaxPrice(Long cTaxPrice) {
        this.cTaxPrice = cTaxPrice;
    }

    public Integer getcManufacturer() {
        return cManufacturer;
    }

    public void setcManufacturer(Integer cManufacturer) {
        this.cManufacturer = cManufacturer;
    }

    public Manufacturer getManufacturerByCManufacturer() {
        return manufacturerByCManufacturer;
    }

    public void setManufacturerByCManufacturer(Manufacturer manufacturerByCManufacturer) {
        this.manufacturerByCManufacturer = manufacturerByCManufacturer;
    }

    public Coating(String cType, Long cMinquantity, Long cMaxquantity, Long cCurrentQuantity, Long cBasePrice, Long cSalePrice, Long cTaxPrice, Integer cManufacturer, Manufacturer manufacturerByCManufacturer) {
        this.cType = cType;
        this.cMinquantity = cMinquantity;
        this.cMaxquantity = cMaxquantity;
        this.cCurrentQuantity = cCurrentQuantity;
        this.cBasePrice = cBasePrice;
        this.cSalePrice = cSalePrice;
        this.cTaxPrice = cTaxPrice;
        this.cManufacturer = cManufacturer;
        this.manufacturerByCManufacturer = manufacturerByCManufacturer;
    }

    public Coating(int cId, String cType, Long cMinquantity, Long cMaxquantity, Long cCurrentQuantity, Long cBasePrice, Long cSalePrice, Long cTaxPrice, Integer cManufacturer, Manufacturer manufacturerByCManufacturer) {
        this.cId = cId;
        this.cType = cType;
        this.cMinquantity = cMinquantity;
        this.cMaxquantity = cMaxquantity;
        this.cCurrentQuantity = cCurrentQuantity;
        this.cBasePrice = cBasePrice;
        this.cSalePrice = cSalePrice;
        this.cTaxPrice = cTaxPrice;
        this.cManufacturer = cManufacturer;
        this.manufacturerByCManufacturer = manufacturerByCManufacturer;
    }
}
