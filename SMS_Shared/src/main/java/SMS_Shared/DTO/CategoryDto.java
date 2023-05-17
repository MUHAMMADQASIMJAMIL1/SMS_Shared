package SMS_Shared.DTO;

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
public class CategoryDto {

    private Long id;
    private String emmisionName;
    private Integer status;
    private String createdBy;
    private Timestamp createdDate;
    private String scope;
//    private Set<SubCategoryDto> subCategoriesById;
}
