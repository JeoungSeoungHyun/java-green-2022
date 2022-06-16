package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class Test01 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=LIqv%2F8heOoyddG4p%2FF8IZOXKJ5BKYBrTStXTKwrDT4%2BIB1fxJFKf8vPU4CUdID94Ctqlk3a6MMNlwAKC%2BASMHA%3D%3D&numOfRows=10&pageNo=1&depAirportId=NAARKSS&arrAirportId=NAARKPC&depPlandTime=20220129&airlineId=AAR&_type=json");

            // 변수 conn -> Byte Stream 선!!
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // http쓸지 https 쓸지 몰라서 return타입을 부모로 해놨기때문에 다운캐스팅 해줘야한다.

            // 원래 default 1Byte 한글을 읽었기 때문에 한글이 깨졌다.
            // utf-8 한글을 3Byte로 끊어 읽겠다.
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();

            Dto<?> dto = gson.fromJson(responseJson, Dto.class);
            // List<Item> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(dto.getResponse().getBody().getItems().getItem());
            // System.out.println(dto);

        } catch (Exception e) {
            System.out.println("주소 입력이 잘못되었습니다.");
        }
    }
}