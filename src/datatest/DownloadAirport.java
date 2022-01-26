package datatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class DownloadAirport {

    public static Map<String, String> getAirportList() {
        Map<String, String> airportMap = new HashMap<>();
        try {
            // 바이트스트림 연결
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getArprtList?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            // 버퍼드리더로 담기
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));
            String responseJson = br.readLine();
            // Gson을 통해 오브젝트로 변경
            Gson gson = new Gson();
            AirportDto dto = gson.fromJson(responseJson, AirportDto.class);
            List<AirportItem> result = dto.getResponse().getBody().getItems().getItem();

            for (int i = 0; i < result.size(); i++) {
                airportMap.put(result.get(i).getAirportNm(), result.get(i).getAirportId());
            }
        } catch (Exception e) {
            System.out.println("공항목록 조회중오류가 발생했습니다.");
        }
        return airportMap;
    }
}
