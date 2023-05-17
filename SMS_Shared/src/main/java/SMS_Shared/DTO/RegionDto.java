package SMS_Shared.DTO;

import SMS_Shared.Entity.OrganizationSiteEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Set;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegionDto {

    private Long id;
    private String regionName;
    private Date createdDate;
    private String createdBy;
    private String status;
//    private Set<OrganizationSiteDto> organizationSitesById;

}
