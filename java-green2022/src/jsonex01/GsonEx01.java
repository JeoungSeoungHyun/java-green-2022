package jsonex01;

import com.google.gson.Gson;

// Dto => Data Transper Object
class UserDto {
    private String username;
    private String password;

    public UserDto(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserDto [password=" + password + ", username=" + username + "]";
    }
}

public class GsonEx01 {
    public static void main(String[] args) {
        // JavaObject -> json으로 변경 (데이터 전송 목적)
        UserDto userDto = new UserDto("ssar", "1234");
        Gson gson = new Gson(); // toJson(), from Json()
        String jsonUserDto = gson.toJson(userDto);
        System.out.println(jsonUserDto);

        // Json -> JavaObject로 변경 (데이터 다운로드 목적)
        // 받을 클래스를 잘 만들어놔야 할 수 있다.
        UserDto javaUserDto = gson.fromJson(jsonUserDto, UserDto.class);
        System.out.println(javaUserDto);
    }
}