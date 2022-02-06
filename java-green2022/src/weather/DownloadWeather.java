package weather;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import weather.WeatherDto.Response.Body.Items.Item;

public class DownloadWeather {
    public static Map<String, Double> getWeather(String date, String time) {

        Map<String, Double> weatherMap = new HashMap<>();

        try {
            // HttpURLConnection을 통하여 Byte Stream 연결하기
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtNcst?serviceKey=LIqv%2F8heOoyddG4p%2FF8IZOXKJ5BKYBrTStXTKwrDT4%2BIB1fxJFKf8vPU4CUdID94Ctqlk3a6MMNlwAKC%2BASMHA%3D%3D&pageNo=1&numOfRows=1000&dataType=JSON&base_date="
                            + date + "&base_time=" + time + "&nx=98&ny=75");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection(); // 명시적 형변환 필요

            // BufferedReader를 통해 읽기 (한번으로 모자란 경우 while문을 통해 읽어내야 한다.)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            String responseJson = br.readLine();

            // Gson을 통하여 Json을 Java Object로 바꾸기
            Gson gson = new Gson();
            WeatherDto dto = gson.fromJson(responseJson, WeatherDto.class);

            // Item들을 ArrayList에 담은 후 key를 통해 원하는 value를 얻을 수 있도록
            // for문을 통하여 weatherMap이라는 HashMap에 담아놓기.
            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            for (int i = 0; i < result.size(); i++) {
                weatherMap.put(result.get(i).getCategory(), result.get(i).getObsrValue());
            }
        } catch (Exception e) {
            System.out.println("날씨 정보 조회 중 오류가 발생하였습니다.");
        }
        return weatherMap;
    }
}