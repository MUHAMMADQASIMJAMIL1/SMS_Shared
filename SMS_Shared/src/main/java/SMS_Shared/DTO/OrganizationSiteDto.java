package SMS_Shared.DTO;

import SMS_Shared.Entity.GroupEntity;
import SMS_Shared.Entity.RegionEntity;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrganizationSiteDto {
    private Long id;
    private String orgSiteName;
    private Integer organizationIndex;
    private String address;
    private String createdBy;

    private String createdDate;

    private String description;

    private String contactNo;

    private Timestamp updatedDate;

    private String updatedBy;

    private GroupDto groupByGroupIndex;

    private RegionDto regionByRegionIndex;
//    private Set<OrganizationSiteDto> organizationSitesById;
}
