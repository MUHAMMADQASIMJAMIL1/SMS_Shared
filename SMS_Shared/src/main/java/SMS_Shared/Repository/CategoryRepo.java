package SMS_Shared.Repository;

import SMS_Shared.Entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepo extends JpaRepository<CategoryEntity,Long> {

    List<CategoryEntity> findByStatusNot(String status);
    CategoryEntity findByIdAndStatusNot(Integer id,String status);

}
