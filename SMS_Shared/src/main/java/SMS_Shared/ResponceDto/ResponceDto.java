package SMS_Shared.ResponceDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponceDto<T>{
    private T data;
    private String message;
    private String statusCode;


}
