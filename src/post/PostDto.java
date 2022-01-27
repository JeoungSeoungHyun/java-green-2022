package post;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PostDto {

    private int code;
    private String msg;
    private List<UserDto> data;

}
