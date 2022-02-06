package corona;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

import corona.CoronaDto.Response.Body.Items.Item;

public class Download {
    public static Map<String, Item> getCorona(String startDt, String endDt) {
        Map<String, Item> coronaMap = new HashMap<>();
        try {
            URL url = new URL(
                    "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=LIqv%2F8heOoyddG4p%2FF8IZOXKJ5BKYBrTStXTKwrDT4%2BIB1fxJFKf8vPU4CUdID94Ctqlk3a6MMNlwAKC%2BASMHA%3D%3D&pageNo=1&numOfRows=10&startCreateDt="
                            + startDt + "&endCreateDt=" + endDt + "&_type=json");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();

            Gson gson = new Gson();

            CoronaDto dto = gson.fromJson(responseJson, CoronaDto.class);

            List<Item> result = dto.getResponse().getBody().getItems().getItem();
            // System.out.println(dto.toString());

            for (int i = 0; i < result.size(); i++) {
                coronaMap.put(result.get(i).getStateDt(), result.get(i));
            }
        } catch (Exception e) {
            System.out.println("오류가 발생하였습니다 : " + e.getMessage());
            e.printStackTrace();
        }
        return coronaMap;
    }
}
