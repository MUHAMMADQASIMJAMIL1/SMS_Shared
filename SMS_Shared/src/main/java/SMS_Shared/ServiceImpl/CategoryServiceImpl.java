package SMS_Shared.ServiceImpl;

import SMS_Shared.DTO.CategoryDto;
import SMS_Shared.Entity.CategoryEntity;
import SMS_Shared.Repository.CategoryRepo;
import SMS_Shared.ResponceDto.ResponceDto;
import SMS_Shared.Service.CategoryService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

  @Autowired
  private CategoryRepo categoryRepo;

    @Override
    public ResponceDto<String> save(CategoryDto categoryDto) {
        ResponceDto responceDto=new ResponceDto<>();
        try {
            CategoryEntity categoryEntity = new CategoryEntity();
            BeanUtils.copyProperties(categoryDto, categoryEntity);
            categoryRepo.save(categoryEntity);
            responceDto.setMessage("Category is created Successfully");
          responceDto.setStatusCode(HttpStatus.OK.toString());
        } catch(Exception e){
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
            responceDto.setMessage("Category is not Created");
            }

        return responceDto;
    }
    @Override
    public ResponceDto<String> update(CategoryDto categoryDto) {
        ResponceDto responceDto=new ResponceDto<>();
        try {
            CategoryEntity categoryEntity=categoryRepo.findById(categoryDto.getId()).orElseThrow();
            BeanUtils.copyProperties(categoryDto,categoryEntity);
            responceDto.setMessage("Category is updated Successfully");
            responceDto.setStatusCode(HttpStatus.OK.toString());
            categoryRepo.save(categoryEntity);
        }
        catch (Exception e){
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }
        return responceDto;
    }
    @Override
    public ResponceDto<String> delete(Integer id) {
        ResponceDto responceDto=new ResponceDto();
        try {
            CategoryEntity categoryEntity=categoryRepo.findByIdAndStatusNot(id,"-1");
            if(categoryEntity==null){
                responceDto.setMessage("Not Exist");
                responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
                return responceDto;
            }
            categoryEntity.setStatus(Integer.valueOf("-1"));
            categoryRepo.save(categoryEntity);
            responceDto.setStatusCode(HttpStatus.OK.toString());
            responceDto.setMessage("Category is deleted Successfully");

        }
        catch (Exception e){
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }
        return responceDto;
    }
    @Override
    public ResponceDto<CategoryDto> findById(Integer id) {
        ResponceDto responceDto=new ResponceDto<>();
        try {
            CategoryEntity categoryEntity=categoryRepo.findByIdAndStatusNot(id,"-1");
            CategoryDto categoryDto=new CategoryDto();
            BeanUtils.copyProperties(categoryEntity,categoryDto);
            responceDto.setData(categoryDto);
            responceDto.setStatusCode(HttpStatus.OK.toString());
        }
        catch(Exception e){
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }
        return responceDto;
    }
    @Override
    public ResponceDto<List<CategoryDto>> findAll() {
        ResponceDto responceDto=new ResponceDto<>();
        try {
            List<CategoryEntity> categoryEntityList=categoryRepo.findByStatusNot("-1");
            List<CategoryDto> categoryDtoList=new ArrayList<>(categoryEntityList.size());
            categoryEntityList.forEach(categoryEntity -> {
                CategoryDto categoryDto=new CategoryDto();
                BeanUtils.copyProperties(categoryEntity,categoryDto);
                categoryDtoList.add(categoryDto);
            });
            responceDto.setData(categoryDtoList);
            responceDto.setStatusCode(HttpStatus.OK.toString());
        }
        catch (Exception e){
            responceDto.setMessage("Not find such Category");
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }
        return responceDto;
    }
}
