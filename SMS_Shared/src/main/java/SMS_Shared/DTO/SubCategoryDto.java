package SMS_Shared.DTO;

import SMS_Shared.Entity.CategoryEntity;
import SMS_Shared.Entity.StandardEntity;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
public class SubCategoryDto {


    private Long id;

    private String name;

    private String description;

    private String co2;

    private String co2Unit;

    private String ch4;

    private String ch4Unit;

    private String ch;

    private String chUnit;

    private Long unitIndex;

    private Date createdDate;

    private String status;

    private String n2O;

    private String n2OUnit;

    private String hfcs;

    private String hfcsUnit;

    private String pfcs;

    private String pfcsUnit;

    private String sf6;

    private String sf6Unit;

    private String nf3;

    private String nf3Unit;

    private String co2Quantity;

    private CategoryDto categoryIndex;

    private StandardDto standardIndex;












    private Set<SubCategoryDto> subCategoriesById;
}
