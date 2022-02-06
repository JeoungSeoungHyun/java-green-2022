package post;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class MainApp {
    public static void main(String[] args) {
        try {
            String addr = "http://lalacoding.site/init/post";
            URL url = new URL(addr);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // System.out.println(responseJson);

            Gson gson = new Gson();
            PostDto dto = gson.fromJson(responseJson, PostDto.class);

            if (dto.getCode() != 1) {
                System.out.println("통신 오류 : " + dto.getMsg());
                return;
            } else {
                for (int i = dto.getData().size() - 1; i >= 0; i--) {
                    System.out.println("작성글 번호 : " + dto.getData().get(i).getId());
                    System.out.println("작성글 제목 : " + dto.getData().get(i).getTitle());
                    System.out.println("작성글 생성일 : " + dto.getData().get(i).getCreated());
                    System.out.println("작성글 수정일 : " + dto.getData().get(i).getUpdated());
                    System.out.println("작성자 번호 : " + dto.getData().get(i).getUser().getId());
                    System.out.println("작성자 아이디 : " + dto.getData().get(i).getUser().getUsername());
                    System.out.println("작성자 패스워드 : " + dto.getData().get(i).getUser().getPassword());
                    System.out.println("작성자 이메일 : " + dto.getData().get(i).getUser().getEmail());
                    System.out.println("작성자 생성일 : " + dto.getData().get(i).getUser().getCreated());
                    System.out.println("작성자 업데이트일 : " + dto.getData().get(i).getUser().getUpdated());
                    System.out.println("============================================");
                }
            }
            // System.out.println(dto);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
