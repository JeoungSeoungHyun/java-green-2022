package weather;

import java.util.Map;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 날짜 입력 받기
        System.out.println("=============================================");
        System.out.println("※ 미래의 날씨는 예측 할 수 없습니다!");
        System.out.println("=============================================");
        System.out.println("==========원하는 날짜를 입력하세요.==========");
        System.out.println(" ex) 20220126");
        String date = sc.nextLine();

        // 시간 입력 받기
        if (date.length() == 8) {
            System.out.println("=============================================");
            System.out.println("=============================================");
            System.out.println("※ 매시간 30분에 생성되고 10분마다 최신 정보로 업데이트됩니다.");
            System.out.println(" ex) 0600 -> 0630 생성");
            System.out.println("=============원하는 시간을 입력하세요.=======");
            System.out.println(" ex ) 0600");
            String time = sc.nextLine();

            // 카테고리 입력 받기
            if (time.length() == 4) {
                System.out.println("=============================================");
                System.out.println("========원하는 정보를 입력하세요.============");
                System.out.println("ex) T1H , RN1 , REH , WSD , END ");
                System.out.println("(T1H:기온 , RN1:1시간 강수량, REH:습도, WSD:풍속, END:종료) ");

                int exit = 1;
                while (exit != 0) {
                    String category = sc.nextLine();
                    // 날짜와 시간을 통해 원하는 시간대의 공공데이터를 파싱하여 Object로 만든 후
                    // Object내의 category와 value 정보만 weatherList라는 HashMap에 담기
                    if (category.length() == 3) {
                        Map<String, Double> weatherList = DownloadWeather.getWeather(date, time);
                        // System.out.println(weatherList);

                        // 원하는 category에 따라 알맞게 출력하여 준다.
                        final Double INFO = weatherList.get(category);
                        System.out.println("============================");
                        if (category.equals("T1H")) {
                            System.out.println("부산진구의 기온은 " + INFO + "℃ 입니다.");
                        } else if (category.equals("RN1")) {
                            System.out.println("부산진구의 1시간 강수량은 " + INFO + "mm 입니다.");
                        } else if (category.equals("REH")) {
                            System.out.println("부산진구의 습도는 " + INFO + "% 입니다.");
                        } else if (category.equals("WSD")) {
                            System.out.println("부산진구의 풍속은" + INFO + "m/s 입니다.");
                        } else if (category.equals("END")) {
                            exit = 0;
                        }
                        System.out.println("============================");
                    } else {
                        System.out.println("없는 정보입니다.");
                    }
                }
            } else {
                System.out.println("시간이 잘못되었습니다.");
            }
        } else {
            System.out.println("날짜가 잘못되었습니다.");
        }
    }
}
