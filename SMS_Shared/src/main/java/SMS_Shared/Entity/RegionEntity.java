package SMS_Shared.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "region", schema = "sms_shared", catalog = "")
public class RegionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "region_name", nullable = true, length = 255)
    private String regionName;
    @Basic
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
    @Basic
    @Column(name = "created_by", nullable = true, length = 255)
    private String createdBy;
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;
    @OneToMany(mappedBy = "regionIndex")
    private Set<OrganizationSiteEntity> organizationSitesById;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegionEntity that = (RegionEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(regionName, that.regionName) && Objects.equals(createdDate, that.createdDate) && Objects.equals(createdBy, that.createdBy) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, regionName, createdDate, createdBy, status);
    }

    public Set<OrganizationSiteEntity> getOrganizationSitesById() {
        return organizationSitesById;
    }

    public void setOrganizationSitesById(Set<OrganizationSiteEntity> organizationSitesById) {
        this.organizationSitesById = organizationSitesById;
    }
}
