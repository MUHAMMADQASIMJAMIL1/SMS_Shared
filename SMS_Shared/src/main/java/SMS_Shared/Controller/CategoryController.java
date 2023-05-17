package SMS_Shared.Controller;

import SMS_Shared.DTO.CategoryDto;
import SMS_Shared.ResponceDto.ResponceDto;
import SMS_Shared.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping (value = "api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/findall")
    public ResponceDto<List<CategoryDto>> findAll(){
        ResponceDto<List<CategoryDto>> categoryDtoList= categoryService.findAll();
        return categoryDtoList;
    }
    @GetMapping("/{id}")
    public ResponceDto<CategoryDto> findById(@PathVariable Integer id){
        ResponceDto<CategoryDto> categoryDto=categoryService.findById(id);
        return categoryDto;
    }
    @PostMapping("/create")
    public ResponceDto<String> save(@RequestBody CategoryDto categoryDto){
        ResponceDto<String> messege=categoryService.save(categoryDto);
        return messege;

    }
    @PutMapping("/update")
    public ResponceDto<String> update(@RequestBody CategoryDto categoryDto){
        ResponceDto<String> messege=categoryService.update(categoryDto);
        return messege;
    }
    @DeleteMapping("/delete/{id}")
    public ResponceDto<String> delete(@PathVariable Integer id){
        ResponceDto<String> messege=categoryService.delete(id);
        return messege;
    }

}
