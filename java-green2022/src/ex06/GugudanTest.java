package ex06;

import java.util.Scanner;

public class GugudanTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("출력할 구구단의 범위를 입력하시오.");
            System.out.println("0을 입력하면 종료됩니다.");

            int replace = 0;

            int min = sc.nextInt();
            if (min == 0) {
                break;
            }
            int max = sc.nextInt();
            if (max == 0) {
                break;
            }
            if (min > max) {
                replace = min;
                min = max;
                max = replace;
            }

            for (int x = min; x <= max; x++) {
                System.out.println("=========" + x + "단========");
                for (int y = 1; y <= 9; y++) {
                    System.out.println(x + "*" + y + "=" + x * y);
                }
            }
            System.out.println("====================");
        }
    }
}