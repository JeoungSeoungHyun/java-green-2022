package ex10;

import java.util.Scanner;

public class Programming03 {
    public static void main(String[] args) {
        double total = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("학생의 수를 입력하시오: ");
        int students = sc.nextInt();
        int scores[] = new int[students];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("학생 " + (i + 1) + "의 성적을 입력하시오: ");
            int score = sc.nextInt();
            if (score > 100) {
                i -= 1;
                System.out.println("잘못된 성적입니다. 다시 입력하시오.");
            } else {
                scores[i] = score;
                total += scores[i];
            }
        }
        System.out.println("성적 평균은 " + total / scores.length + "입니다.");
    }
}
