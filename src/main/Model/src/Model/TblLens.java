package Model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_lens", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblLens {
    private int lId;
    private String lType;
    private Long lMinquantity;
    private Long lMaxquantity;
    private Long lCurrentQuantity;
    private Long lBasePrice;
    private Long lSalePrice;
    private Long lTaxPrice;
    private Integer lManufacturer;
    private TblManufacturer tblManufacturerByLManufacturer;
    private Collection<TblProductSupplier> tblProductSuppliersByLId;
    private Collection<TblPurchase> tblPurchasesByLId;

    @Id
    @Column(name = "l_id", nullable = false)
    public int getlId() {
        return lId;
    }

    public void setlId(int lId) {
        this.lId = lId;
    }

    @Basic
    @Column(name = "l_type", nullable = true, length = 255)
    public String getlType() {
        return lType;
    }

    public void setlType(String lType) {
        this.lType = lType;
    }

    @Basic
    @Column(name = "l_minquantity", nullable = true)
    public Long getlMinquantity() {
        return lMinquantity;
    }

    public void setlMinquantity(Long lMinquantity) {
        this.lMinquantity = lMinquantity;
    }

    @Basic
    @Column(name = "l_maxquantity", nullable = true)
    public Long getlMaxquantity() {
        return lMaxquantity;
    }

    public void setlMaxquantity(Long lMaxquantity) {
        this.lMaxquantity = lMaxquantity;
    }

    @Basic
    @Column(name = "l_currentQuantity", nullable = true)
    public Long getlCurrentQuantity() {
        return lCurrentQuantity;
    }

    public void setlCurrentQuantity(Long lCurrentQuantity) {
        this.lCurrentQuantity = lCurrentQuantity;
    }

    @Basic
    @Column(name = "l_basePrice", nullable = true)
    public Long getlBasePrice() {
        return lBasePrice;
    }

    public void setlBasePrice(Long lBasePrice) {
        this.lBasePrice = lBasePrice;
    }

    @Basic
    @Column(name = "l_salePrice", nullable = true)
    public Long getlSalePrice() {
        return lSalePrice;
    }

    public void setlSalePrice(Long lSalePrice) {
        this.lSalePrice = lSalePrice;
    }

    @Basic
    @Column(name = "l_taxPrice", nullable = true)
    public Long getlTaxPrice() {
        return lTaxPrice;
    }

    public void setlTaxPrice(Long lTaxPrice) {
        this.lTaxPrice = lTaxPrice;
    }

    @Basic
    @Column(name = "l_manufacturer", nullable = true)
    public Integer getlManufacturer() {
        return lManufacturer;
    }

    public void setlManufacturer(Integer lManufacturer) {
        this.lManufacturer = lManufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblLens tblLens = (TblLens) o;
        return lId == tblLens.lId &&
                Objects.equals(lType, tblLens.lType) &&
                Objects.equals(lMinquantity, tblLens.lMinquantity) &&
                Objects.equals(lMaxquantity, tblLens.lMaxquantity) &&
                Objects.equals(lCurrentQuantity, tblLens.lCurrentQuantity) &&
                Objects.equals(lBasePrice, tblLens.lBasePrice) &&
                Objects.equals(lSalePrice, tblLens.lSalePrice) &&
                Objects.equals(lTaxPrice, tblLens.lTaxPrice) &&
                Objects.equals(lManufacturer, tblLens.lManufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lId, lType, lMinquantity, lMaxquantity, lCurrentQuantity, lBasePrice, lSalePrice, lTaxPrice, lManufacturer);
    }

    @ManyToOne
    @JoinColumn(name = "l_manufacturer", referencedColumnName = "ma_id")
    public TblManufacturer getTblManufacturerByLManufacturer() {
        return tblManufacturerByLManufacturer;
    }

    public void setTblManufacturerByLManufacturer(TblManufacturer tblManufacturerByLManufacturer) {
        this.tblManufacturerByLManufacturer = tblManufacturerByLManufacturer;
    }

    @OneToMany(mappedBy = "tblLensByLId")
    public Collection<TblProductSupplier> getTblProductSuppliersByLId() {
        return tblProductSuppliersByLId;
    }

    public void setTblProductSuppliersByLId(Collection<TblProductSupplier> tblProductSuppliersByLId) {
        this.tblProductSuppliersByLId = tblProductSuppliersByLId;
    }

    @OneToMany(mappedBy = "tblLensByLId")
    public Collection<TblPurchase> getTblPurchasesByLId() {
        return tblPurchasesByLId;
    }

    public void setTblPurchasesByLId(Collection<TblPurchase> tblPurchasesByLId) {
        this.tblPurchasesByLId = tblPurchasesByLId;
    }
}
