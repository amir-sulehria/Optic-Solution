package Entity;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "tbl_coating", schema = "dbo", catalog = "OPTIC_SOLUTIONS")
public class TblCoating {
    private int cId;
    private String cType;
    private Long cMinquantity;
    private Long cMaxquantity;
    private Long cCurrentQuantity;
    private Long cBasePrice;
    private Long cSalePrice;
    private Long cTaxPrice;
    private Integer cManufacturer;

    @Id
    @Column(name = "c_id", nullable = false)
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "c_type", nullable = true, length = 255)
    public String getcType() {
        return cType;
    }

    public void setcType(String cType) {
        this.cType = cType;
    }

    @Basic
    @Column(name = "c_minquantity", nullable = true)
    public Long getcMinquantity() {
        return cMinquantity;
    }

    public void setcMinquantity(Long cMinquantity) {
        this.cMinquantity = cMinquantity;
    }

    @Basic
    @Column(name = "c_maxquantity", nullable = true)
    public Long getcMaxquantity() {
        return cMaxquantity;
    }

    public void setcMaxquantity(Long cMaxquantity) {
        this.cMaxquantity = cMaxquantity;
    }

    @Basic
    @Column(name = "c_currentQuantity", nullable = true)
    public Long getcCurrentQuantity() {
        return cCurrentQuantity;
    }

    public void setcCurrentQuantity(Long cCurrentQuantity) {
        this.cCurrentQuantity = cCurrentQuantity;
    }

    @Basic
    @Column(name = "c_basePrice", nullable = true)
    public Long getcBasePrice() {
        return cBasePrice;
    }

    public void setcBasePrice(Long cBasePrice) {
        this.cBasePrice = cBasePrice;
    }

    @Basic
    @Column(name = "c_salePrice", nullable = true)
    public Long getcSalePrice() {
        return cSalePrice;
    }

    public void setcSalePrice(Long cSalePrice) {
        this.cSalePrice = cSalePrice;
    }

    @Basic
    @Column(name = "c_taxPrice", nullable = true)
    public Long getcTaxPrice() {
        return cTaxPrice;
    }

    public void setcTaxPrice(Long cTaxPrice) {
        this.cTaxPrice = cTaxPrice;
    }

    @Basic
    @Column(name = "c_manufacturer", nullable = true)
    public Integer getcManufacturer() {
        return cManufacturer;
    }

    public void setcManufacturer(Integer cManufacturer) {
        this.cManufacturer = cManufacturer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TblCoating that = (TblCoating) o;
        return cId == that.cId &&
                Objects.equals(cType, that.cType) &&
                Objects.equals(cMinquantity, that.cMinquantity) &&
                Objects.equals(cMaxquantity, that.cMaxquantity) &&
                Objects.equals(cCurrentQuantity, that.cCurrentQuantity) &&
                Objects.equals(cBasePrice, that.cBasePrice) &&
                Objects.equals(cSalePrice, that.cSalePrice) &&
                Objects.equals(cTaxPrice, that.cTaxPrice) &&
                Objects.equals(cManufacturer, that.cManufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cId, cType, cMinquantity, cMaxquantity, cCurrentQuantity, cBasePrice, cSalePrice, cTaxPrice, cManufacturer);
    }

}
