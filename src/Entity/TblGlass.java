package Entity;

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
                Objects.equals(gManufacturer, tblGlass.gManufacturer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gId, gType, gMinquantity, gMaxquantity, gCurrentQuantity, gBasePrice, gSalePrice, gTaxPrice, gManufacturer);
    }

}
