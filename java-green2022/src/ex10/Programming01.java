package ex10;

import java.util.Scanner;

public class Programming01 {
    public static void main(String[] args) {
        int[] reserve = { 0, 0, 0, 0, 0, 1, 1, 1, 0, 0 };
        int check = 1;

        while (true) {
            int checkReserve;
            int seatNum;
            System.out.println("좌석을 예약하시곗습니까?(1 또는 0)");
            Scanner scan = new Scanner(System.in);
            checkReserve = scan.nextInt();
            check = 1;
            while (check == 1) {
                if (checkReserve == 1) {
                    System.out.println("현재의 예약 상태는 다음과 같습니다.");
                    System.out.println("---------------------------");
                    for (int i = 0; i < reserve.length; i++) {
                        System.out.println(i + 1);
                    }
                    System.out.println("---------------------------");
                    for (int i = 0; i < reserve.length; i++) {
                        System.out.println(reserve[i]);
                    }
                    System.out.println("몇번쨰 좌석을 예약하시곘습니까?");
                    seatNum = scan.nextInt();
                    if (reserve[seatNum - 1] != 1) {
                        reserve[seatNum - 1] = 1;
                        System.out.println("예약되었습니다.");
                        check = 0;
                    } else {
                        System.out.println("예약 된 자리입니다. 다른 자리를 골라주세요.");
                    }
                }
            }
        }
    }
}
