package datatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class DownloadFlight {
    // 특정 날짜에 특정 출발지에서 특정 목적지로 도착하는 항공편 정보 가져오는 메서드
    // DownloadFlight.getFlightList("20220126", "제주", "김해");
    public static List<FlightItem> getFlightList(
            String depPlandTime,
            String depAirportNm,
            String arrAirportNm) {

        // 공항목록을 조회하여 Map에 담는다.
        Map<String, String> airportMap = DownloadAirport.getAirportList();
        String depAirportId = airportMap.get(depAirportNm);
        String arrAirportId = airportMap.get(arrAirportNm);

        try {
            URL url = new URL(
                    "http://openapi.tago.go.kr/openapi/service/DmstcFlightNvgInfoService/getFlightOpratInfoList?serviceKey=LIqv%2F8heOoyddG4p%2FF8IZOXKJ5BKYBrTStXTKwrDT4%2BIB1fxJFKf8vPU4CUdID94Ctqlk3a6MMNlwAKC%2BASMHA%3D%3D&numOfRows=10&pageNo=1&depAirportId="
                            + depAirportId + "&arrAirportId=" + arrAirportId + "&depPlandTime="
                            + depPlandTime + "&_type=json");

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();

            ResponseDto<FlightItem> dto = gson.fromJson(responseJson, ResponseDto.class);
            System.out.println("DownloadFlight" + dto);
            List<FlightItem> result = dto.getResponse().getBody().getItems().getItem();
            return result;
        } catch (Exception e) {
            e.getMessage();
            e.printStackTrace();
            System.out.println("항공편 조회중 오류가 발생했습니다.");
        }
        return null;
    }
}
