package main.Entity;

public class Frames {
    private int fId;
    private String fModel;
    private Long fSerialnumber;
    private String fShape;
    private String fMaterial;
    private Long fMinquantity;
    private Long fMaxquantity;
    private Long fCurrentQuantity;
    private Long fBasePrice;
    private Long fSalePrice;
    private Long fTaxPrice;
    private Integer fManufacturer;

    public Frames(int fId, String fModel, Long fSerialnumber, String fShape, String fMaterial, Long fMinquantity, Long fMaxquantity, Long fCurrentQuantity, Long fBasePrice, Long fSalePrice, Long fTaxPrice, Integer fManufacturer) {
        this.fId = fId;
        this.fModel = fModel;
        this.fSerialnumber = fSerialnumber;
        this.fShape = fShape;
        this.fMaterial = fMaterial;
        this.fMinquantity = fMinquantity;
        this.fMaxquantity = fMaxquantity;
        this.fCurrentQuantity = fCurrentQuantity;
        this.fBasePrice = fBasePrice;
        this.fSalePrice = fSalePrice;
        this.fTaxPrice = fTaxPrice;
        this.fManufacturer = fManufacturer;
    }

    public Frames(String fModel, Long fSerialnumber, String fShape, String fMaterial, Long fMinquantity, Long fMaxquantity, Long fCurrentQuantity, Long fBasePrice, Long fSalePrice, Long fTaxPrice, Integer fManufacturer) {
        this.fModel = fModel;
        this.fSerialnumber = fSerialnumber;
        this.fShape = fShape;
        this.fMaterial = fMaterial;
        this.fMinquantity = fMinquantity;
        this.fMaxquantity = fMaxquantity;
        this.fCurrentQuantity = fCurrentQuantity;
        this.fBasePrice = fBasePrice;
        this.fSalePrice = fSalePrice;
        this.fTaxPrice = fTaxPrice;
        this.fManufacturer = fManufacturer;
    }

    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    public String getfModel() {
        return fModel;
    }

    public void setfModel(String fModel) {
        this.fModel = fModel;
    }

    public Long getfSerialnumber() {
        return fSerialnumber;
    }

    public void setfSerialnumber(Long fSerialnumber) {
        this.fSerialnumber = fSerialnumber;
    }

    public String getfShape() {
        return fShape;
    }

    public void setfShape(String fShape) {
        this.fShape = fShape;
    }

    public String getfMaterial() {
        return fMaterial;
    }

    public void setfMaterial(String fMaterial) {
        this.fMaterial = fMaterial;
    }

    public Long getfMinquantity() {
        return fMinquantity;
    }

    public void setfMinquantity(Long fMinquantity) {
        this.fMinquantity = fMinquantity;
    }

    public Long getfMaxquantity() {
        return fMaxquantity;
    }

    public void setfMaxquantity(Long fMaxquantity) {
        this.fMaxquantity = fMaxquantity;
    }

    public Long getfCurrentQuantity() {
        return fCurrentQuantity;
    }

    public void setfCurrentQuantity(Long fCurrentQuantity) {
        this.fCurrentQuantity = fCurrentQuantity;
    }

    public Long getfBasePrice() {
        return fBasePrice;
    }

    public void setfBasePrice(Long fBasePrice) {
        this.fBasePrice = fBasePrice;
    }

    public Long getfSalePrice() {
        return fSalePrice;
    }

    public void setfSalePrice(Long fSalePrice) {
        this.fSalePrice = fSalePrice;
    }

    public Long getfTaxPrice() {
        return fTaxPrice;
    }

    public void setfTaxPrice(Long fTaxPrice) {
        this.fTaxPrice = fTaxPrice;
    }

    public Integer getfManufacturer() {
        return fManufacturer;
    }

    public void setfManufacturer(Integer fManufacturer) {
        this.fManufacturer = fManufacturer;
    }
}
