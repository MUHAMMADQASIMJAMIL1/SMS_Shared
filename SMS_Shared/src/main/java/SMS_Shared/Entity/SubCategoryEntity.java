package SMS_Shared.Entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "sub_category", schema = "sms_shared", catalog = "")
public class SubCategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "co2", nullable = true, length = 255)
    private String co2;
    @Basic
    @Column(name = "co2_unit", nullable = true, length = 255)
    private String co2Unit;
    @Basic
    @Column(name = "ch4", nullable = true, length = 255)
    private String ch4;
    @Basic
    @Column(name = "ch4_unit", nullable = true, length = 255)
    private String ch4Unit;
    @Basic
    @Column(name = "ch", nullable = true, length = 255)
    private String ch;
    @Basic
    @Column(name = "ch_unit", nullable = true, length = 255)
    private String chUnit;
    @Basic
    @Column(name = "unit_index", nullable = true)
    private Long unitIndex;
    @Basic
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;
    @Basic
    @Column(name = "n2o", nullable = true, length = 255)
    private String n2O;
    @Basic
    @Column(name = "n2o_unit", nullable = true, length = 255)
    private String n2OUnit;
    @Basic
    @Column(name = "hfcs", nullable = true, length = 255)
    private String hfcs;
    @Basic
    @Column(name = "hfcs_unit", nullable = true, length = 255)
    private String hfcsUnit;
    @Basic
    @Column(name = "pfcs", nullable = true, length = 255)
    private String pfcs;
    @Basic
    @Column(name = "pfcs_unit", nullable = true, length = 255)
    private String pfcsUnit;
    @Basic
    @Column(name = "sf6", nullable = true, length = 255)
    private String sf6;
    @Basic
    @Column(name = "sf6_unit", nullable = true, length = 255)
    private String sf6Unit;
    @Basic
    @Column(name = "nf3", nullable = true, length = 255)
    private String nf3;
    @Basic
    @Column(name = "nf3_unit", nullable = true, length = 255)
    private String nf3Unit;
    @Basic
    @Column(name = "co2_quantity", nullable = true, length = 255)
    private String co2Quantity;
    @ManyToOne
    @JoinColumn(name = "category_index", referencedColumnName = "id")
    private CategoryEntity categoryByCategoryIndex;
    @ManyToOne
    @JoinColumn(name = "standard_index", referencedColumnName = "id")
    private StandardEntity standardByStandardIndex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public String getCo2Unit() {
        return co2Unit;
    }

    public void setCo2Unit(String co2Unit) {
        this.co2Unit = co2Unit;
    }

    public String getCh4() {
        return ch4;
    }

    public void setCh4(String ch4) {
        this.ch4 = ch4;
    }

    public String getCh4Unit() {
        return ch4Unit;
    }

    public void setCh4Unit(String ch4Unit) {
        this.ch4Unit = ch4Unit;
    }

    public String getCh() {
        return ch;
    }

    public void setCh(String ch) {
        this.ch = ch;
    }

    public String getChUnit() {
        return chUnit;
    }

    public void setChUnit(String chUnit) {
        this.chUnit = chUnit;
    }

    public Long getUnitIndex() {
        return unitIndex;
    }

    public void setUnitIndex(Long unitIndex) {
        this.unitIndex = unitIndex;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getN2O() {
        return n2O;
    }

    public void setN2O(String n2O) {
        this.n2O = n2O;
    }

    public String getN2OUnit() {
        return n2OUnit;
    }

    public void setN2OUnit(String n2OUnit) {
        this.n2OUnit = n2OUnit;
    }

    public String getHfcs() {
        return hfcs;
    }

    public void setHfcs(String hfcs) {
        this.hfcs = hfcs;
    }

    public String getHfcsUnit() {
        return hfcsUnit;
    }

    public void setHfcsUnit(String hfcsUnit) {
        this.hfcsUnit = hfcsUnit;
    }

    public String getPfcs() {
        return pfcs;
    }

    public void setPfcs(String pfcs) {
        this.pfcs = pfcs;
    }

    public String getPfcsUnit() {
        return pfcsUnit;
    }

    public void setPfcsUnit(String pfcsUnit) {
        this.pfcsUnit = pfcsUnit;
    }

    public String getSf6() {
        return sf6;
    }

    public void setSf6(String sf6) {
        this.sf6 = sf6;
    }

    public String getSf6Unit() {
        return sf6Unit;
    }

    public void setSf6Unit(String sf6Unit) {
        this.sf6Unit = sf6Unit;
    }

    public String getNf3() {
        return nf3;
    }

    public void setNf3(String nf3) {
        this.nf3 = nf3;
    }

    public String getNf3Unit() {
        return nf3Unit;
    }

    public void setNf3Unit(String nf3Unit) {
        this.nf3Unit = nf3Unit;
    }

    public String getCo2Quantity() {
        return co2Quantity;
    }

    public void setCo2Quantity(String co2Quantity) {
        this.co2Quantity = co2Quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubCategoryEntity that = (SubCategoryEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(co2, that.co2) && Objects.equals(co2Unit, that.co2Unit) && Objects.equals(ch4, that.ch4) && Objects.equals(ch4Unit, that.ch4Unit) && Objects.equals(ch, that.ch) && Objects.equals(chUnit, that.chUnit) && Objects.equals(unitIndex, that.unitIndex) && Objects.equals(createdDate, that.createdDate) && Objects.equals(status, that.status) && Objects.equals(n2O, that.n2O) && Objects.equals(n2OUnit, that.n2OUnit) && Objects.equals(hfcs, that.hfcs) && Objects.equals(hfcsUnit, that.hfcsUnit) && Objects.equals(pfcs, that.pfcs) && Objects.equals(pfcsUnit, that.pfcsUnit) && Objects.equals(sf6, that.sf6) && Objects.equals(sf6Unit, that.sf6Unit) && Objects.equals(nf3, that.nf3) && Objects.equals(nf3Unit, that.nf3Unit) && Objects.equals(co2Quantity, that.co2Quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, co2, co2Unit, ch4, ch4Unit, ch, chUnit, unitIndex, createdDate, status, n2O, n2OUnit, hfcs, hfcsUnit, pfcs, pfcsUnit, sf6, sf6Unit, nf3, nf3Unit, co2Quantity);
    }

    public CategoryEntity getCategoryByCategoryIndex() {
        return categoryByCategoryIndex;
    }

    public void setCategoryByCategoryIndex(CategoryEntity categoryByCategoryIndex) {
        this.categoryByCategoryIndex = categoryByCategoryIndex;
    }

    public StandardEntity getStandardByStandardIndex() {
        return standardByStandardIndex;
    }

    public void setStandardByStandardIndex(StandardEntity standardByStandardIndex) {
        this.standardByStandardIndex = standardByStandardIndex;
    }
}
