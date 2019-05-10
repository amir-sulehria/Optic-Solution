package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_glass", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblGlass {
    private int gId;
    private String gType;
    private Long gMinquantity;
    private Long gMaxquantity;
    private Long gCurrentQuantity;
    private Long gBasePrice;
    private Long gSalePrice;
    private Long gTaxPrice;
    private Integer gManufacturer;
    private Integer gSupplier;
    private TblManufacturer tblManufacturerByGManufacturer;
    private TblSupplier tblSupplierByGSupplier;
    private Collection<TblProductSupplier> tblProductSuppliersByGId;
    private Collection<TblPurchase> tblPurchasesByGId;

    @Id
    @Column(name = "g_id", nullable = false)
    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
    }

    @Basic
    @Column(name = "g_type", nullable = true, length = 255)
    public String getgType() {
        return gType;
    }

    public void setgType(String gType) {
        this.gType = gType;
    }

    @Basic
    @Column(name = "g_minquantity", nullable = true)
    public Long getgMinquantity() {
        return gMinquantity;
    }

    public void setgMinquantity(Long gMinquantity) {
        this.gMinquantity = gMinquantity;
    }

    @Basic
    @Column(name = "g_maxquantity", nullable = true)
    public Long getgMaxquantity() {
        return gMaxquantity;
    }

    public void setgMaxquantity(Long gMaxquantity) {
        this.gMaxquantity = gMaxquantity;
    }

    @Basic
    @Column(name = "g_currentQuantity", nullable = true)
    public Long getgCurrentQuantity() {
        return gCurrentQuantity;
    }

    public void setgCurrentQuantity(Long gCurrentQuantity) {
        this.gCurrentQuantity = gCurrentQuantity;
    }

    @Basic
    @Column(name = "g_basePrice", nullable = true)
    public Long getgBasePrice() {
        return gBasePrice;
    }

    public void setgBasePrice(Long gBasePrice) {
        this.gBasePrice = gBasePrice;
    }

    @Basic
    @Column(name = "g_salePrice", nullable = true)
    public Long getgSalePrice() {
        return gSalePrice;
    }

    public void setgSalePrice(Long gSalePrice) {
        this.gSalePrice = gSalePrice;
    }

    @Basic
    @Column(name = "g_taxPrice", nullable = true)
    public Long getgTaxPrice() {
        return gTaxPrice;
    }

    public void setgTaxPrice(Long gTaxPrice) {
        this.gTaxPrice = gTaxPrice;
    }

    @Basic
    @Column(name = "g_manufacturer", nullable = true)
    public Integer getgManufacturer() {
        return gManufacturer;
    }

    public void setgManufacturer(Integer gManufacturer) {
        this.gManufacturer = gManufacturer;
    }

    @Basic
    @Column(name = "g_supplier", nullable = true)
    public Integer getgSupplier() {
        return gSupplier;
    }

    public void setgSupplier(Integer gSupplier) {
        this.gSupplier = gSupplier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblGlass tblGlass = (TblGlass) o;
        return gId == tblGlass.gId &&
                Objects.equals(gType, tblGlass.gType) &&
                Objects.equals(gMinquantity, tblGlass.gMinquantity) &&
                Objects.equals(gMaxquantity, tblGlass.gMaxquantity) &&
                Objects.equals(gCurrentQuantity, tblGlass.gCurrentQuantity) &&
                Objects.equals(gBasePrice, tblGlass.gBasePrice) &&
                Objects.equals(gSalePrice, tblGlass.gSalePrice) &&
                Objects.equals(gTaxPrice, tblGlass.gTaxPrice) &&
                Objects.equals(gManufacturer, tblGlass.gManufacturer) &&
                Objects.equals(gSupplier, tblGlass.gSupplier);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gId, gType, gMinquantity, gMaxquantity, gCurrentQuantity, gBasePrice, gSalePrice, gTaxPrice, gManufacturer, gSupplier);
    }

    @ManyToOne
    @JoinColumn(name = "g_manufacturer", referencedColumnName = "ma_id")
    public TblManufacturer getTblManufacturerByGManufacturer() {
        return tblManufacturerByGManufacturer;
    }

    public void setTblManufacturerByGManufacturer(TblManufacturer tblManufacturerByGManufacturer) {
        this.tblManufacturerByGManufacturer = tblManufacturerByGManufacturer;
    }

    @ManyToOne
    @JoinColumn(name = "g_supplier", referencedColumnName = "su_id")
    public TblSupplier getTblSupplierByGSupplier() {
        return tblSupplierByGSupplier;
    }

    public void setTblSupplierByGSupplier(TblSupplier tblSupplierByGSupplier) {
        this.tblSupplierByGSupplier = tblSupplierByGSupplier;
    }

    @OneToMany(mappedBy = "tblGlassByGId")
    public Collection<TblProductSupplier> getTblProductSuppliersByGId() {
        return tblProductSuppliersByGId;
    }

    public void setTblProductSuppliersByGId(Collection<TblProductSupplier> tblProductSuppliersByGId) {
        this.tblProductSuppliersByGId = tblProductSuppliersByGId;
    }

    @OneToMany(mappedBy = "tblGlassByGId")
    public Collection<TblPurchase> getTblPurchasesByGId() {
        return tblPurchasesByGId;
    }

    public void setTblPurchasesByGId(Collection<TblPurchase> tblPurchasesByGId) {
        this.tblPurchasesByGId = tblPurchasesByGId;
    }
}
