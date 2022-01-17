package ex10;

import java.util.Scanner;

public class Programming02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];

        for (int i = 0; i < num.length; i++) {
            System.out.println("1~100 정수를 입력하세요.");
            num[i] = sc.nextInt();
            if (num[i] >= 1 && num[i] <= 10) {
                System.out.println(1);
            } else if (num[i] >= 11 && num[i] <= 20) {
                System.out.println(2);
            }
        }
    }
}
