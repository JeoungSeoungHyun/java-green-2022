package bubble;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bubble {
    public static void main(String[] args) {
        // 버블정렬 구현
        // 1. 리스트를 만든다 (버블정렬 할 리스트와 정렬결과 비교하기 위한 리스트)
        // 2. 버블정렬 1바퀴를 노가다코드로 적어본다.
        // 3. 패턴화시킨다
        // 4. 검증

        // List<Integer> bubble = Arrays.asList(6, 5, 4, 3, 2, 1);
        // Araays.asList로 생성한 리스트는 고정되어있어 원소 제거나 추가가 불가
        Scanner sc = new Scanner(System.in);
        List<Integer> bubble = new ArrayList<>();
        int exit2 = 1;
        while (true) {
            System.out.println("리스트에 넣고 싶은 숫자를 입력하세요. 다 넣은 경우 종료를 입력하세요.");
            String m = sc.nextLine();
            // if (m == "종료") { 문자열 비교는 무조건 equlas다!!!!!!!!!!!!!! 까먹지마!!!!!!!!!!!!!!!!!
            if (m.equals("종료")) {
                break;
            } else {
                bubble.add(Integer.parseInt(m));
            }
        }

        System.out.println("오름차순이면 1을 내림차순이면 0을 입력하세요.");
        int choice = sc.nextInt();
        if (choice == 1) {
            System.out.println("버블정렬 전 : " + bubble);
            System.out.println("======================");

            int copy;
            final int LENTHBUBBLE = bubble.size();

            // 버블정렬 될때까지 비교하기 위한 정렬 된 리스트 만들기
            List<Integer> finalBubble = new ArrayList<>(bubble);
            Collections.sort(finalBubble);
            // System.out.println(finalBubble);

            // 테스트
            int failCheck = 0;
            int exit = 1;
            int cycle = 0;
            while (exit != 0) {
                cycle++;
                System.out.println("<" + cycle + "회전 결과>");
                for (int i = 0; i < LENTHBUBBLE - 1; i++) {
                    if (bubble.get(i) > bubble.get(i + 1)) {
                        copy = bubble.get(i);
                        bubble.remove(i);
                        bubble.add(i + 1, copy);
                        System.out.println(bubble);
                    }
                }

                for (int i = 0; i < LENTHBUBBLE; i++) {
                    if (finalBubble.get(i) != bubble.get(i)) {
                        failCheck++;
                    }
                }
                if (failCheck == 0) {
                    exit = 0;
                }
                failCheck = 0;
                System.out.println("======================");
            }

            System.out.println("버블정렬 완료 : " + bubble);
        } else if (choice == 0) {
            int replace;
            for (int i = 1; i < bubble.size(); i++) {
                for (int j = 0; j < bubble.size() - i; j++) {
                    if (bubble.get(j) < bubble.get(j + 1)) {
                        replace = bubble.get(j);
                        bubble.set(j, bubble.get(j + 1));
                        bubble.set(j + 1, replace);
                    }
                }
            }
            System.out.println("======================");
            System.out.println("버블정렬 완료 : " + bubble);
        } else {
            System.out.println("다시 입력하세요");
        }

    }
}
