package SMS_Shared.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
    @OneToMany(mappedBy = "categoryIndex")
    private Set<SubCategoryEntity> subCategoriesById;


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
