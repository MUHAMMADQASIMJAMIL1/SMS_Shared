package SMS_Shared.Entity;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "periods", schema = "sms_shared", catalog = "")
public class PeriodsEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "period_name", nullable = true, length = 255)
    private String periodName;
    @Basic
    @Column(name = "organization_index", nullable = true)
    private Integer organizationIndex;
    @Basic
    @Column(name = "status", nullable = true, length = 10)
    private String status;
    @Basic
    @Column(name = "period_start", nullable = true, length = 255)
    private String periodStart;
    @Basic
    @Column(name = "period_end", nullable = true, length = 255)
    private String periodEnd;
    @Basic
    @Column(name = "created_by", nullable = true, length = 255)
    private String createdBy;
    @Basic
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "updated_date", nullable = true)
    private Date updatedDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public Integer getOrganizationIndex() {
        return organizationIndex;
    }

    public void setOrganizationIndex(Integer organizationIndex) {
        this.organizationIndex = organizationIndex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPeriodStart() {
        return periodStart;
    }

    public void setPeriodStart(String periodStart) {
        this.periodStart = periodStart;
    }

    public String getPeriodEnd() {
        return periodEnd;
    }

    public void setPeriodEnd(String periodEnd) {
        this.periodEnd = periodEnd;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PeriodsEntity that = (PeriodsEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(periodName, that.periodName) && Objects.equals(organizationIndex, that.organizationIndex) && Objects.equals(status, that.status) && Objects.equals(periodStart, that.periodStart) && Objects.equals(periodEnd, that.periodEnd) && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdDate, that.createdDate) && Objects.equals(description, that.description) && Objects.equals(updatedDate, that.updatedDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, periodName, organizationIndex, status, periodStart, periodEnd, createdBy, createdDate, description, updatedDate);
    }
}
