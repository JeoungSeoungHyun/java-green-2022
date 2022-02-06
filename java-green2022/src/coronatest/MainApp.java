package coronatest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;

import coronatest.CoronaDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        String startDt;
        String endDt;
        boolean isActive = true;
        Scanner sc = new Scanner(System.in);

        while (isActive) {
            System.out.println("코로나 현황 범위를 입력하세요. ex)20220207");
            System.out.print("시작일 : ");
            startDt = sc.nextLine();

            // 시작날짜 입력오류 확인
            if (startDt.length() == 8) {
                System.out.print("종료일 : ");
                endDt = sc.nextLine();

                // 종료날짜 입력오류 확인
                if (endDt.length() == 8) {
                    sc.close();
                    try {
                        // 바이트 스트림 연결
                        URL url = new URL(
                                "http://openapi.data.go.kr/openapi/service/rest/Covid19/getCovid19InfStateJson?serviceKey=wJmmW29e3AEUjwLioQR22CpmqS645ep4S8TSlqtSbEsxvnkZFoNe7YG1weEWQHYZ229eNLidnI2Yt5EZ3Stv7g%3D%3D&pageNo=1&numOfRows=10&startCreateDt="
                                        + startDt + "&endCreateDt=" + endDt + "&_type=json");
                        HttpURLConnection conn = (HttpURLConnection) url.openConnection();

                        // 버퍼에 담기
                        BufferedReader br = new BufferedReader(
                                new InputStreamReader(conn.getInputStream(), "utf-8"));
                        String responseJson = br.readLine();

                        // Gson을 이용하여 Json 파싱
                        Gson gson = new Gson();
                        CoronaDto dto = gson.fromJson(responseJson, CoronaDto.class);
                        // System.out.println(dto.toString());

                        // API 오류 확인
                        if (dto.getResponse().getHeader().getResultCode().equals("00")) {
                            List<Item> result = dto.getResponse().getBody().getItems().getItem();
                            // System.out.println(result);

                            for (int i = 0; i < result.size(); i++) {
                                System.out.println("---------------------------------------------");
                                System.out.println(
                                        "누적 의심신고 검사자 수 : " + String.format("%,d", result.get(i).getAccExamCnt()) + "명");
                                System.out.println(
                                        "확진자 수 : " + String.format("%,d", result.get(i).getDecideCnt()) + "명");
                                System.out.println(
                                        "사망자 수 : " + String.format("%,d", result.get(i).getDeathCnt()) + "명");
                                System.out.println(
                                        "기준일 : " + result.get(i).getStateDt().substring(0, 4) + "-"
                                                + result.get(i).getStateDt().substring(4, 6) + "-"
                                                + result.get(i).getStateDt().substring(6));
                                System.out.println("기준시간 : " + result.get(i).getStateTime());
                                System.out.println("게시글번호 : " + String.format("%,d", result.get(i).getSeq()) + "번");
                                System.out.println("등록일시분초 : " + result.get(i).getCreateDt());
                                System.out.println("수정일시분초 : " + result.get(i).getUpdateDt());
                            }
                        } else {
                            System.out.println("Open API 오류가 발생하였습니다.");
                            System.out.println(dto.getResponse().getHeader().getResultCode() + ":" +
                                    dto.getResponse().getHeader().getResultMsg());
                        }
                    } catch (Exception e) {
                        System.out.println("오류가 발생하였습니다 : " + e.getMessage());
                        e.printStackTrace();
                    }
                    isActive = false;
                } else {
                    System.out.println("날짜가 잘못되었습니다.");
                    System.out.println("-----------------------------");
                }
            } else {
                System.out.println("날짜가 잘못되었습니다.");
                System.out.println("-----------------------------");
            }
        }
    }
}