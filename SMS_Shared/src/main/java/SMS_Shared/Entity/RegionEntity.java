package SMS_Shared.Entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;
import java.util.Set;

@Entity
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
    @OneToMany(mappedBy = "regionByRegionIndex")
    private Set<OrganizationSiteEntity> organizationSitesById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

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
