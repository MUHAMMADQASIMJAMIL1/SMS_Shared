package SMS_Shared.DTO;

import SMS_Shared.Entity.SubCategoryEntity;
import jakarta.persistence.*;
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
public class StandardDto {


    private Long id;

    private String standardName;

    private Integer year;

    private Integer countryIndex;

    private String status;

    private Timestamp createdDate;

    private String createdBy;

    private Timestamp updatedDate;

    private String updatedBy;

//    private Set<SubCategoryDto> subCategoriesById;




}
