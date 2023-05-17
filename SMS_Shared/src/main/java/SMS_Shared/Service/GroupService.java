package SMS_Shared.Service;

import SMS_Shared.DTO.GroupDto;
import SMS_Shared.ResponceDto.ResponceDto;
import org.springframework.boot.autoconfigure.security.reactive.ReactiveSecurityAutoConfiguration;

import java.util.List;

public interface GroupService {

    ResponceDto<String> save(GroupDto groupDto);
    ResponceDto<String> update(GroupDto groupDto);
    ResponceDto<String> delete(Integer id);
    ResponceDto<GroupDto> findById(Integer id);
    ResponceDto<List<GroupDto>> findAll();




}
