package SMS_Shared.Service;

import SMS_Shared.DTO.CategoryDto;
import SMS_Shared.ResponceDto.ResponceDto;

import java.util.List;

public interface CategoryService {

    ResponceDto<String> save(CategoryDto categoryDto);
    ResponceDto<String> update(CategoryDto categoryDto);
    ResponceDto<String> delete(Integer id);
    ResponceDto<CategoryDto> findById(Integer id);
    ResponceDto<List<CategoryDto>> findAll();



}
