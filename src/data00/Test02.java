package data00;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.ProcessBuilder.Redirect.Type;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Test02 {
    public static void main(String[] args) {
        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // System.out.println(responseJson);
            Gson gson = new Gson();

            // Type myType = new TypeToken<Dto<ItemAirport>>() {}.getType();

            Dto<ItemAirport> dto = gson.fromJson(responseJson, Dto.class);
            // System.out.println("출력결과 : " +
            // dto.getResponse().getBody().getItems().getItem());
            List<ItemAirport> result = dto.getResponse().getBody().getItems().getItem();
            System.out.println(result);
            System.out.println("사이즈 : " + result.size());

            // 최종적으로 할 것!!
            Map<String, String> airportMap = new HashMap<>();
            for (int i = 0; i < result.size(); i++) {

                // airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
                System.out.println("AirportId : " + result.get(i).getAirportId());
                System.out.println("AirportNm : " + result.get(i).getAirportNm());
            }
            // System.out.println(airportMap.get("제주"));
        } catch (Exception e) {
            System.out.println("주소 입력이 잘못되었습니다.");
            e.printStackTrace();
        }
    }
}