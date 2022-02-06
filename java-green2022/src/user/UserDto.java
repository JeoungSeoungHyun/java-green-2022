package user;

import java.net.URL;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

//같은 패키지 안에 있는건 import할 필요가 없다.
//import는 같은 패키지 안에 있는 것처럼 만들어주는것.
@Data // getter, setter, toString 자동생성
@AllArgsConstructor // 생성자 생성 모든 요소를 포함한
public class UserDto {
    private int code; // 1은 성공, -1은 실패, 0은 데이터 없음
    private String msg;
    private List<User> data;

}
