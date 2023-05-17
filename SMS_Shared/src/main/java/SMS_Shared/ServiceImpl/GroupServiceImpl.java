package SMS_Shared.ServiceImpl;

import SMS_Shared.DTO.CategoryDto;
import SMS_Shared.DTO.GroupDto;
import SMS_Shared.Entity.CategoryEntity;
import SMS_Shared.Entity.GroupEntity;
import SMS_Shared.Repository.GroupRepo;
import SMS_Shared.ResponceDto.ResponceDto;
import SMS_Shared.Service.GroupService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GroupServiceImpl implements GroupService {
    @Autowired
    private GroupRepo groupRepo;

    @Override
    public ResponceDto<String> save(GroupDto groupDto) {
        ResponceDto<String> responceDto=new ResponceDto<>();
        try {
            GroupEntity groupEntity=new GroupEntity();
            BeanUtils.copyProperties(groupDto,groupEntity);
            groupRepo.save(groupEntity);
            responceDto.setMessage("Group is created Successfully");
            responceDto.setStatusCode(HttpStatus.OK.toString());

        }
        catch (Exception e){
            responceDto.setMessage("Group is not created ");
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }

        return responceDto;
    }

    @Override
    public ResponceDto<String> update(GroupDto groupDto) {
        ResponceDto<String> responceDto=new ResponceDto<>();
        try {
            GroupEntity groupEntity=groupRepo.findById(groupDto.getId()).orElseThrow();
            BeanUtils.copyProperties(groupDto,groupEntity);
            groupRepo.save(groupEntity);
            responceDto.setMessage("Group is updated Successfully");
            responceDto.setStatusCode(HttpStatus.OK.toString());
        }
        catch (Exception e){
            responceDto.setMessage("Group is not updated");
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }
        return responceDto;
    }

    @Override
    public ResponceDto<String> delete(Integer id) {
        ResponceDto<String> responceDto=new ResponceDto<>();
        try {
            GroupEntity groupEntity=groupRepo.findByIdAndStatusNot(id,"-1");
            if(groupEntity==null){
                responceDto.setMessage("Not Exist");
                responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
                return responceDto;
            }
            groupRepo.delete(groupEntity);
            responceDto.setMessage("Group is deleted Successfully");
            responceDto.setStatusCode(HttpStatus.OK.toString());

        }
        catch (Exception e){
            responceDto.setMessage("Group is not Deleted");
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }
        return responceDto;
    }

    @Override
    public ResponceDto<GroupDto> findById(Integer id) {
        ResponceDto<GroupDto> responceDto=new ResponceDto<>();
        try {
            GroupEntity groupEntity=groupRepo.findByIdAndStatusNot(id,"-1");
            GroupDto groupDto=new GroupDto();
            BeanUtils.copyProperties(groupEntity,groupDto);
            responceDto.setData(groupDto);
            responceDto.setStatusCode(HttpStatus.OK.toString());
        }
        catch (Exception e){

            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }
        return responceDto;
    }

    @Override
    public ResponceDto<List<GroupDto>> findAll() {
        ResponceDto responceDto=new ResponceDto<>();
        try {
            List<GroupEntity> groupEntityList=groupRepo.findByStatusNot(-1);
            List<GroupDto> groupDtoList=new ArrayList<>(groupEntityList.size());
            groupEntityList.forEach(groupEntity -> {
                GroupDto groupDto=new GroupDto();
                BeanUtils.copyProperties(groupEntity,groupDto);
                groupDtoList.add(groupDto);
            });
            responceDto.setData(groupDtoList);
            responceDto.setStatusCode(HttpStatus.OK.toString());
        }
        catch (Exception e){

            responceDto.setMessage("Not find such group");
            responceDto.setStatusCode(HttpStatus.BAD_REQUEST.toString());
        }
        return responceDto;
    }
}
