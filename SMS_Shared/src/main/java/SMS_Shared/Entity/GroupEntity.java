package SMS_Shared.Entity;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "add_group", schema = "sms_shared", catalog = "")
public class GroupEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "group_name", nullable = true, length = 255)
    private String groupName;
    @Basic
    @Column(name = "status", nullable = true)
    private Integer status;
    @OneToMany(mappedBy = "groupByGroupIndex")
    private Set<OrganizationSiteEntity> organizationSitesById;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupEntity that = (GroupEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(groupName, that.groupName) && Objects.equals(status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName, status);
    }

    public Set<OrganizationSiteEntity> getOrganizationSitesById() {
        return organizationSitesById;
    }

    public void setOrganizationSitesById(Set<OrganizationSiteEntity> organizationSitesById) {
        this.organizationSitesById = organizationSitesById;
    }
}
