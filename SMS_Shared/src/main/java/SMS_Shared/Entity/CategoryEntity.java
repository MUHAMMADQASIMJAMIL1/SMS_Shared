package SMS_Shared.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "category", schema = "sms_shared", catalog = "")
public class CategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "emmision_name", nullable = true, length = -1)
    private String emmisionName;
    @Basic
    @Column(name = "status", nullable = true)
    private Integer status;
    @Basic
    @Column(name = "created_by", nullable = true, length = 255)
    private String createdBy;
    @Basic
    @Column(name = "created_date", nullable = true)
    private Timestamp createdDate;
    @Basic
    @Column(name = "scope", nullable = true, length = 255)
    private String scope;
    @OneToMany(mappedBy = "categoryByCategoryIndex")
    private Set<SubCategoryEntity> subCategoriesById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmmisionName() {
        return emmisionName;
    }

    public void setEmmisionName(String emmisionName) {
        this.emmisionName = emmisionName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Timestamp getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Timestamp createdDate) {
        this.createdDate = createdDate;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoryEntity that = (CategoryEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(emmisionName, that.emmisionName) && Objects.equals(status, that.status) && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdDate, that.createdDate) && Objects.equals(scope, that.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, emmisionName, status, createdBy, createdDate, scope);
    }

    public Set<SubCategoryEntity> getSubCategoriesById() {
        return subCategoriesById;
    }

    public void setSubCategoriesById(Set<SubCategoryEntity> subCategoriesById) {
        this.subCategoriesById = subCategoriesById;
    }
}
