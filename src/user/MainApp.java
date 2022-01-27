package user;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/user";
            URL url = new URL(addr);
            // conn은 ByteStream
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 데이터가 짧은 길이이고 고정 할 수 있을만큼 오차가 적다면 인풋스트림리더 사용
            // 버퍼리더는 가변길이를 받고 싶어서
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            // 1바이트씩 읽기때문에 한글이 깨지므로 utf-8을 통해 3바이트씩 끊어읽어주도록 한다.

            String responseJson = br.readLine();
            // 데이터를 한 번 받아서 잘 받아졌는지 한번에 받아지는지 문제는 없는지 확인해본다.
            // System.out.println(responseJson); // 데이터가 한번에 다 들어오므로 while 돌리지 않아도 된다.

            // gosn을 통해 자바 오브젝트로 바꿔준다.
            Gson gson = new Gson();
            UserDto dto = gson.fromJson(responseJson, UserDto.class);

            // 1. 통신 검증
            if (dto.getCode() != 1) {
                // stack을 그냥 종료하지말고 종료 된 이유를 알려줘야한다.
                System.out.println("통신 실패" + dto.getMsg());
                return;
            } else {
                // 2 . 프로그램 만들기

                // (1) 화면에 회원정보를 출력하겠다. 끝이 있으니 for문 사용!!
                for (int i = dto.getData().size() - 1; i >= 0; i--) {
                    System.out.println("회원번호 : " + dto.getData().get(i).getId());
                    System.out.println("회원아이디 : " + dto.getData().get(i).getUsername());
                    System.out.println("회원비밀번호 : " + dto.getData().get(i).getPassword());
                    System.out.println("회원이메일 : " + dto.getData().get(i).getEmail());
                    System.out.println("회원가입날짜 : " + dto.getData().get(i).getCreated());
                    System.out.println("회원로그인날짜 : " + dto.getData().get(i).getUpdated());
                    System.out.println("============================");
                }
            }
        } catch (Exception e) {
            e.printStackTrace(); // 오류를 추적할 수 있는 로그를 콘솔에 보여줌.
        }
    }
}