package lottoex01;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        // 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();

        // 검증
        int chance = (int) money / 1000;

        if (chance == 5) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
