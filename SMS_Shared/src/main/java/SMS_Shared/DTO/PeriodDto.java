package SMS_Shared.DTO;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeriodDto {


    private Long id;

    private String periodName;

    private Integer organizationIndex;

    private String status;

    private String periodStart;

    private String periodEnd;

    private String createdBy;

    private Date createdDate;

    private String description;

    private Date updatedDate;



}
