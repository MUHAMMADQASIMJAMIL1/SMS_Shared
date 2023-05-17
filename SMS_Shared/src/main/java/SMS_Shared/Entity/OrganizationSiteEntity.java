package SMS_Shared.Entity;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "organization_site", schema = "sms_shared", catalog = "")
public class OrganizationSiteEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "org_site_name", nullable = true, length = 255)
    private String orgSiteName;
    @Basic
    @Column(name = "status", nullable = true, length = 10)
    private String status;
    @Basic
    @Column(name = "organization_index", nullable = true)
    private Integer organizationIndex;
    @Basic
    @Column(name = "address", nullable = true, length = 255)
    private String address;
    @Basic
    @Column(name = "created_by", nullable = true, length = 255)
    private String createdBy;
    @Basic
    @Column(name = "created_date", nullable = true, length = 255)
    private String createdDate;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "contact_no", nullable = true, length = 255)
    private String contactNo;
    @Basic
    @Column(name = "updated_date", nullable = true)
    private Timestamp updatedDate;
    @Basic
    @Column(name = "updated_by", nullable = true, length = 200)
    private String updatedBy;
    @ManyToOne
    @JoinColumn(name = "group_index", referencedColumnName = "id")
    private GroupEntity groupByGroupIndex;
    @ManyToOne
    @JoinColumn(name = "region_index", referencedColumnName = "id")
    private RegionEntity regionByRegionIndex;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgSiteName() {
        return orgSiteName;
    }

    public void setOrgSiteName(String orgSiteName) {
        this.orgSiteName = orgSiteName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getOrganizationIndex() {
        return organizationIndex;
    }

    public void setOrganizationIndex(Integer organizationIndex) {
        this.organizationIndex = organizationIndex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
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
        OrganizationSiteEntity that = (OrganizationSiteEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(orgSiteName, that.orgSiteName) && Objects.equals(status, that.status) && Objects.equals(organizationIndex, that.organizationIndex) && Objects.equals(address, that.address) && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdDate, that.createdDate) && Objects.equals(description, that.description) && Objects.equals(contactNo, that.contactNo) && Objects.equals(updatedDate, that.updatedDate) && Objects.equals(updatedBy, that.updatedBy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, orgSiteName, status, organizationIndex, address, createdBy, createdDate, description, contactNo, updatedDate, updatedBy);
    }

    public GroupEntity getGroupByGroupIndex() {
        return groupByGroupIndex;
    }

    public void setGroupByGroupIndex(GroupEntity groupByGroupIndex) {
        this.groupByGroupIndex = groupByGroupIndex;
    }

    public RegionEntity getRegionByRegionIndex() {
        return regionByRegionIndex;
    }

    public void setRegionByRegionIndex(RegionEntity regionByRegionIndex) {
        this.regionByRegionIndex = regionByRegionIndex;
    }
}
