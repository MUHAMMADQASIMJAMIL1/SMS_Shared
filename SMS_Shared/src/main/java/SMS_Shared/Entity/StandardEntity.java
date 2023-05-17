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
    @OneToMany(mappedBy = "standardIndex")
    private Set<SubCategoryEntity> subCategoriesById;



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


}
