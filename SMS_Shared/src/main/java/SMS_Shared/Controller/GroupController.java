package SMS_Shared.Controller;

import SMS_Shared.DTO.GroupDto;
import SMS_Shared.ResponceDto.ResponceDto;
import SMS_Shared.Service.GroupService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/group")
public class GroupController {
    @Autowired
    private GroupService groupService;

    @GetMapping("/findall")
    public ResponceDto<List<GroupDto>> findAll(){
        ResponceDto<List<GroupDto>> responceDtoList=groupService.findAll();
        return responceDtoList;
    }
    @GetMapping("/{id}")
    public ResponceDto<GroupDto> findById(@PathVariable Integer id){
        ResponceDto<GroupDto> responceDto=groupService.findById(id);
        return responceDto;
    }
    @PostMapping("/create")
    public ResponceDto<String> save(@RequestBody GroupDto groupDto){
        ResponceDto<String> responceDto=groupService.save(groupDto);
        return responceDto;
    }
    @PutMapping("/update")
    public ResponceDto<String> update(@RequestBody GroupDto groupDto){
        ResponceDto<String> responceDto=groupService.update(groupDto);
        return responceDto;
    }
    @DeleteMapping("/delete/{id}")
    public ResponceDto<String> delete(@PathVariable Integer id){
        ResponceDto<String>responceDto=groupService.delete(id);
        return responceDto;
    }



}
