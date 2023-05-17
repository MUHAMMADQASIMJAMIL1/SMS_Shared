package SMS_Shared.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "standard", schema = "sms_shared", catalog = "")
public class StandardEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "standard_name", nullable = true, length = 255)
    private String standardName;
    @Basic
    @Column(name = "year", nullable = true)
    private Integer year;
    @Basic
    @Column(name = "country_index", nullable = true)
    private Integer countryIndex;
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;
    @Basic
    @Column(name = "created_date", nullable = true)
    private Timestamp createdDate;
    @Basic
    @Column(name = "created_by", nullable = true, length = 255)
    private String createdBy;
    @Basic
    @Column(name = "updated_date", nullable = true)
    private Timestamp updatedDate;
    @Basic
    @Column(name = "updated_by", nullable = true, length = 255)
    private String updatedBy;
    @OneToMany(mappedBy = "standardByStandardIndex")
    private Set<SubCategoryEntity> subCategoriesById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getCountryIndex() {
        return countryIndex;
    }

    public void setCountryIndex(Integer countryIndex) {
        this.countryIndex = countryIndex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Timestamp updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StandardEntity that = (StandardEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(standardName, that.standardName) && Objects.equals(year, that.year) && Objects.equals(countryIndex, that.countryIndex) && Objects.equals(status, that.status) && Objects.equals(createdDate, that.createdDate) && Objects.equals(createdBy, that.createdBy) && Objects.equals(updatedDate, that.updatedDate) && Objects.equals(updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, standardName, year, countryIndex, status, createdDate, createdBy, updatedDate, updatedBy);
    }

    public Set<SubCategoryEntity> getSubCategoriesById() {
        return subCategoriesById;
    }

    public void setSubCategoriesById(Set<SubCategoryEntity> subCategoriesById) {
        this.subCategoriesById = subCategoriesById;
    }
}
