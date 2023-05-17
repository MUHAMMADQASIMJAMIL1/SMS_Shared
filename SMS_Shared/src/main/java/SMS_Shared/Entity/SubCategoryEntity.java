package SMS_Shared.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "sub_category", schema = "sms_shared", catalog = "")
public class SubCategoryEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name", nullable = true, length = 255)
    private String name;
    @Basic
    @Column(name = "description", nullable = true, length = 255)
    private String description;
    @Basic
    @Column(name = "co2", nullable = true, length = 255)
    private String co2;
    @Basic
    @Column(name = "co2_unit", nullable = true, length = 255)
    private String co2Unit;
    @Basic
    @Column(name = "ch4", nullable = true, length = 255)
    private String ch4;
    @Basic
    @Column(name = "ch4_unit", nullable = true, length = 255)
    private String ch4Unit;
    @Basic
    @Column(name = "ch", nullable = true, length = 255)
    private String ch;
    @Basic
    @Column(name = "ch_unit", nullable = true, length = 255)
    private String chUnit;
    @Basic
    @Column(name = "unit_index", nullable = true)
    private Long unitIndex;
    @Basic
    @Column(name = "created_date", nullable = true)
    private Date createdDate;
    @Basic
    @Column(name = "status", nullable = true, length = 255)
    private String status;
    @Basic
    @Column(name = "n2o", nullable = true, length = 255)
    private String n2O;
    @Basic
    @Column(name = "n2o_unit", nullable = true, length = 255)
    private String n2OUnit;
    @Basic
    @Column(name = "hfcs", nullable = true, length = 255)
    private String hfcs;
    @Basic
    @Column(name = "hfcs_unit", nullable = true, length = 255)
    private String hfcsUnit;
    @Basic
    @Column(name = "pfcs", nullable = true, length = 255)
    private String pfcs;
    @Basic
    @Column(name = "pfcs_unit", nullable = true, length = 255)
    private String pfcsUnit;
    @Basic
    @Column(name = "sf6", nullable = true, length = 255)
    private String sf6;
    @Basic
    @Column(name = "sf6_unit", nullable = true, length = 255)
    private String sf6Unit;
    @Basic
    @Column(name = "nf3", nullable = true, length = 255)
    private String nf3;
    @Basic
    @Column(name = "nf3_unit", nullable = true, length = 255)
    private String nf3Unit;
    @Basic
    @Column(name = "co2_quantity", nullable = true, length = 255)
    private String co2Quantity;
    @ManyToOne
    @JoinColumn(name = "category_index", referencedColumnName = "id")
    private CategoryEntity categoryIndex;
    @ManyToOne
    @JoinColumn(name = "standard_index", referencedColumnName = "id")
    private StandardEntity standardIndex;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SubCategoryEntity that = (SubCategoryEntity) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(co2, that.co2) && Objects.equals(co2Unit, that.co2Unit) && Objects.equals(ch4, that.ch4) && Objects.equals(ch4Unit, that.ch4Unit) && Objects.equals(ch, that.ch) && Objects.equals(chUnit, that.chUnit) && Objects.equals(unitIndex, that.unitIndex) && Objects.equals(createdDate, that.createdDate) && Objects.equals(status, that.status) && Objects.equals(n2O, that.n2O) && Objects.equals(n2OUnit, that.n2OUnit) && Objects.equals(hfcs, that.hfcs) && Objects.equals(hfcsUnit, that.hfcsUnit) && Objects.equals(pfcs, that.pfcs) && Objects.equals(pfcsUnit, that.pfcsUnit) && Objects.equals(sf6, that.sf6) && Objects.equals(sf6Unit, that.sf6Unit) && Objects.equals(nf3, that.nf3) && Objects.equals(nf3Unit, that.nf3Unit) && Objects.equals(co2Quantity, that.co2Quantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, co2, co2Unit, ch4, ch4Unit, ch, chUnit, unitIndex, createdDate, status, n2O, n2OUnit, hfcs, hfcsUnit, pfcs, pfcsUnit, sf6, sf6Unit, nf3, nf3Unit, co2Quantity);
    }


}
