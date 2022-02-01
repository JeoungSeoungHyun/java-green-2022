package corona;

import java.util.Map;
import java.util.Scanner;

import corona.CoronaDto.Response.Body.Items.Item;

public class MainApp {
    public static void main(String[] args) {
        String startDt;
        String endDt;
        String searchDt;
        Scanner sc = new Scanner(System.in);
        System.out.println("검색 기간 시작 날짜를 입력하세요 ex)20220131");
        startDt = sc.nextLine();

        if (startDt.length() == 8) {
            System.out.println("검색 기간 끝 날짜를 입력하세요 ex)20220131");
            endDt = sc.nextLine();

            if (endDt.length() == 8) {

                int exitNum = 1;
                while (exitNum != 0) {
                    System.out.println("원하는 날짜를 입력하세요 ex)20220131");
                    System.out.println("종료를 원하면 종료를 입력하세요.");
                    searchDt = sc.nextLine();

                    if (searchDt.length() == 8) {
                        Map<String, Item> item = Download.getCorona(startDt, endDt);
                        // System.out.println(dto.toString());
                        System.out.println(
                                "누적 의심 신고 검사자 수 : " + String.format("%,d", item.get(searchDt).getAccExamCnt()) + "명");
                        System.out.println("사망자 수 : " + String.format("%,d", item.get(searchDt).getDeathCnt()) + "명");
                        System.out.println("확진자 수 : " + String.format("%,d", item.get(searchDt).getDecideCnt()) + "명");
                    } else if (searchDt.equals("종료")) {
                        exitNum = 0;
                    } else {
                        System.out.println("날짜가 잘못되었습니다.");
                    }
                }
            } else {
                System.out.println("날짜가 잘못되었습니다.");
            }
        } else {
            System.out.println("날짜가 잘못되었습니다.");
        }
    }
}
