package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_frames", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblFrames {
    private int fId;
    private String fModel;
    private Long fSerialnumber;
    private Integer fWidth;
    private Integer fHeight;
    private Integer fLenswidth;
    private Integer fLensheight;
    private Integer fBridge;
    private Integer fTemplelength;
    private Integer fWeight;
    private Integer fRdMinrange;
    private Integer fRdMaxrange;
    private Integer fPrescriptionMinrange;
    private Integer fPrescriptionMaxrange;
    private String fRimtype;
    private String fShape;
    private String fMaterial;
    private Long fMinquantity;
    private Long fMaxquantity;
    private Long fCurrentQuantity;
    private Long fBasePrice;
    private Long fSalePrice;
    private Long fTaxPrice;
    private Integer fManufacturer;
    private Integer fSupplier;
    private TblManufacturer tblManufacturerByFManufacturer;
    private TblSupplier tblSupplierByFSupplier;
    private Collection<TblProductSupplier> tblProductSuppliersByFId;
    private Collection<TblPurchase> tblPurchasesByFId;

    @Id
    @Column(name = "f_id", nullable = false)
    public int getfId() {
        return fId;
    }

    public void setfId(int fId) {
        this.fId = fId;
    }

    @Basic
    @Column(name = "f_model", nullable = true, length = 255)
    public String getfModel() {
        return fModel;
    }

    public void setfModel(String fModel) {
        this.fModel = fModel;
    }

    @Basic
    @Column(name = "f_serialnumber", nullable = true)
    public Long getfSerialnumber() {
        return fSerialnumber;
    }

    public void setfSerialnumber(Long fSerialnumber) {
        this.fSerialnumber = fSerialnumber;
    }

    @Basic
    @Column(name = "f_width", nullable = true)
    public Integer getfWidth() {
        return fWidth;
    }

    public void setfWidth(Integer fWidth) {
        this.fWidth = fWidth;
    }

    @Basic
    @Column(name = "f_height", nullable = true)
    public Integer getfHeight() {
        return fHeight;
    }

    public void setfHeight(Integer fHeight) {
        this.fHeight = fHeight;
    }

    @Basic
    @Column(name = "f_lenswidth", nullable = true)
    public Integer getfLenswidth() {
        return fLenswidth;
    }

    public void setfLenswidth(Integer fLenswidth) {
        this.fLenswidth = fLenswidth;
    }

    @Basic
    @Column(name = "f_lensheight", nullable = true)
    public Integer getfLensheight() {
        return fLensheight;
    }

    public void setfLensheight(Integer fLensheight) {
        this.fLensheight = fLensheight;
    }

    @Basic
    @Column(name = "f_bridge", nullable = true)
    public Integer getfBridge() {
        return fBridge;
    }

    public void setfBridge(Integer fBridge) {
        this.fBridge = fBridge;
    }

    @Basic
    @Column(name = "f_templelength", nullable = true)
    public Integer getfTemplelength() {
        return fTemplelength;
    }

    public void setfTemplelength(Integer fTemplelength) {
        this.fTemplelength = fTemplelength;
    }

    @Basic
    @Column(name = "f_weight", nullable = true)
    public Integer getfWeight() {
        return fWeight;
    }

    public void setfWeight(Integer fWeight) {
        this.fWeight = fWeight;
    }

    @Basic
    @Column(name = "f_rd_minrange", nullable = true)
    public Integer getfRdMinrange() {
        return fRdMinrange;
    }

    public void setfRdMinrange(Integer fRdMinrange) {
        this.fRdMinrange = fRdMinrange;
    }

    @Basic
    @Column(name = "f_rd_maxrange", nullable = true)
    public Integer getfRdMaxrange() {
        return fRdMaxrange;
    }

    public void setfRdMaxrange(Integer fRdMaxrange) {
        this.fRdMaxrange = fRdMaxrange;
    }

    @Basic
    @Column(name = "f_prescription_minrange", nullable = true)
    public Integer getfPrescriptionMinrange() {
        return fPrescriptionMinrange;
    }

    public void setfPrescriptionMinrange(Integer fPrescriptionMinrange) {
        this.fPrescriptionMinrange = fPrescriptionMinrange;
    }

    @Basic
    @Column(name = "f_prescription_maxrange", nullable = true)
    public Integer getfPrescriptionMaxrange() {
        return fPrescriptionMaxrange;
    }

    public void setfPrescriptionMaxrange(Integer fPrescriptionMaxrange) {
        this.fPrescriptionMaxrange = fPrescriptionMaxrange;
    }

    @Basic
    @Column(name = "f_rimtype", nullable = true, length = 255)
    public String getfRimtype() {
        return fRimtype;
    }

    public void setfRimtype(String fRimtype) {
        this.fRimtype = fRimtype;
    }

    @Basic
    @Column(name = "f_shape", nullable = true, length = 255)
    public String getfShape() {
        return fShape;
    }

    public void setfShape(String fShape) {
        this.fShape = fShape;
    }

    @Basic
    @Column(name = "f_material", nullable = true, length = 255)
    public String getfMaterial() {
        return fMaterial;
    }

    public void setfMaterial(String fMaterial) {
        this.fMaterial = fMaterial;
    }

    @Basic
    @Column(name = "f_minquantity", nullable = true)
    public Long getfMinquantity() {
        return fMinquantity;
    }

    public void setfMinquantity(Long fMinquantity) {
        this.fMinquantity = fMinquantity;
    }

    @Basic
    @Column(name = "f_maxquantity", nullable = true)
    public Long getfMaxquantity() {
        return fMaxquantity;
    }

    public void setfMaxquantity(Long fMaxquantity) {
        this.fMaxquantity = fMaxquantity;
    }

    @Basic
    @Column(name = "f_currentQuantity", nullable = true)
    public Long getfCurrentQuantity() {
        return fCurrentQuantity;
    }

    public void setfCurrentQuantity(Long fCurrentQuantity) {
        this.fCurrentQuantity = fCurrentQuantity;
    }

    @Basic
    @Column(name = "f_basePrice", nullable = true)
    public Long getfBasePrice() {
        return fBasePrice;
    }

    public void setfBasePrice(Long fBasePrice) {
        this.fBasePrice = fBasePrice;
    }

    @Basic
    @Column(name = "f_salePrice", nullable = true)
    public Long getfSalePrice() {
        return fSalePrice;
    }

    public void setfSalePrice(Long fSalePrice) {
        this.fSalePrice = fSalePrice;
    }

    @Basic
    @Column(name = "f_taxPrice", nullable = true)
    public Long getfTaxPrice() {
        return fTaxPrice;
    }

    public void setfTaxPrice(Long fTaxPrice) {
        this.fTaxPrice = fTaxPrice;
    }

    @Basic
    @Column(name = "f_manufacturer", nullable = true)
    public Integer getfManufacturer() {
        return fManufacturer;
    }

    public void setfManufacturer(Integer fManufacturer) {
        this.fManufacturer = fManufacturer;
    }

    @Basic
    @Column(name = "f_supplier", nullable = true)
    public Integer getfSupplier() {
        return fSupplier;
    }

    public void setfSupplier(Integer fSupplier) {
        this.fSupplier = fSupplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblFrames tblFrames = (TblFrames) o;
        return fId == tblFrames.fId &&
                Objects.equals(fModel, tblFrames.fModel) &&
                Objects.equals(fSerialnumber, tblFrames.fSerialnumber) &&
                Objects.equals(fWidth, tblFrames.fWidth) &&
                Objects.equals(fHeight, tblFrames.fHeight) &&
                Objects.equals(fLenswidth, tblFrames.fLenswidth) &&
                Objects.equals(fLensheight, tblFrames.fLensheight) &&
                Objects.equals(fBridge, tblFrames.fBridge) &&
                Objects.equals(fTemplelength, tblFrames.fTemplelength) &&
                Objects.equals(fWeight, tblFrames.fWeight) &&
                Objects.equals(fRdMinrange, tblFrames.fRdMinrange) &&
                Objects.equals(fRdMaxrange, tblFrames.fRdMaxrange) &&
                Objects.equals(fPrescriptionMinrange, tblFrames.fPrescriptionMinrange) &&
                Objects.equals(fPrescriptionMaxrange, tblFrames.fPrescriptionMaxrange) &&
                Objects.equals(fRimtype, tblFrames.fRimtype) &&
                Objects.equals(fShape, tblFrames.fShape) &&
                Objects.equals(fMaterial, tblFrames.fMaterial) &&
                Objects.equals(fMinquantity, tblFrames.fMinquantity) &&
                Objects.equals(fMaxquantity, tblFrames.fMaxquantity) &&
                Objects.equals(fCurrentQuantity, tblFrames.fCurrentQuantity) &&
                Objects.equals(fBasePrice, tblFrames.fBasePrice) &&
                Objects.equals(fSalePrice, tblFrames.fSalePrice) &&
                Objects.equals(fTaxPrice, tblFrames.fTaxPrice) &&
                Objects.equals(fManufacturer, tblFrames.fManufacturer) &&
                Objects.equals(fSupplier, tblFrames.fSupplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fId, fModel, fSerialnumber, fWidth, fHeight, fLenswidth, fLensheight, fBridge, fTemplelength, fWeight, fRdMinrange, fRdMaxrange, fPrescriptionMinrange, fPrescriptionMaxrange, fRimtype, fShape, fMaterial, fMinquantity, fMaxquantity, fCurrentQuantity, fBasePrice, fSalePrice, fTaxPrice, fManufacturer, fSupplier);
    }

    @ManyToOne
    @JoinColumn(name = "f_manufacturer", referencedColumnName = "ma_id")
    public TblManufacturer getTblManufacturerByFManufacturer() {
        return tblManufacturerByFManufacturer;
    }

    public void setTblManufacturerByFManufacturer(TblManufacturer tblManufacturerByFManufacturer) {
        this.tblManufacturerByFManufacturer = tblManufacturerByFManufacturer;
    }

    @ManyToOne
    @JoinColumn(name = "f_supplier", referencedColumnName = "su_id")
    public TblSupplier getTblSupplierByFSupplier() {
        return tblSupplierByFSupplier;
    }

    public void setTblSupplierByFSupplier(TblSupplier tblSupplierByFSupplier) {
        this.tblSupplierByFSupplier = tblSupplierByFSupplier;
    }

    @OneToMany(mappedBy = "tblFramesByFId")
    public Collection<TblProductSupplier> getTblProductSuppliersByFId() {
        return tblProductSuppliersByFId;
    }

    public void setTblProductSuppliersByFId(Collection<TblProductSupplier> tblProductSuppliersByFId) {
        this.tblProductSuppliersByFId = tblProductSuppliersByFId;
    }

    @OneToMany(mappedBy = "tblFramesByFId")
    public Collection<TblPurchase> getTblPurchasesByFId() {
        return tblPurchasesByFId;
    }

    public void setTblPurchasesByFId(Collection<TblPurchase> tblPurchasesByFId) {
        this.tblPurchasesByFId = tblPurchasesByFId;
    }
}
