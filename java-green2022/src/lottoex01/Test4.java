package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test4 {
    public static void main(String[] args) {
        // 4. HashSet은 순서를 보장하지 않고 데이터를 가지기 떄문에 순차 정렬이 필요! (구글링)
        // Mock
        Set<Integer> array = new HashSet<>();
        array.add(4);
        array.add(15);
        array.add(6);
        array.add(9);
        array.add(32);
        array.add(19);

        // 테스트
        List<Integer> sl = new ArrayList<>(array);
        Collections.sort(sl);

        // 눈으로 확인
        System.out.println(sl);

        // 검증
        int failCheck = 0;

        // 노가다 코드를 통해 패턴 파악 후 반복문으로 변경
        // if (sl.get(0) < sl.get(1)) {
        // System.out.println("0번지와 1번지 비교 성공");
        // } else {
        // failCheck++;
        // }
        // if (sl.get(1) < sl.get(2)) {
        // System.out.println("1번지와 2번지 비교 성공");
        // } else {
        // failCheck++;
        // }
        // if (sl.get(2) < sl.get(3)) {
        // System.out.println("2번지와 3번지 비교 성공");
        // } else {
        // failCheck++;
        // }
        // if (sl.get(3) < sl.get(4)) {
        // System.out.println("3번지와 4번지 비교 성공");
        // } else {
        // failCheck++;
        // }
        // if (sl.get(4) < sl.get(5)) {
        // System.out.println("4번지와 5번지 비교 성공");
        // } else {
        // failCheck++;
        // }

        // 검증
        final int LOTTOSIZE = sl.size(); // 상수화 하여 for문 내에 스택이 계속 쌓이는 걸 방지
        for (int i = 0; i < LOTTOSIZE - 1; i++) {
            if (sl.get(i) < sl.get(i + 1)) {
                System.out.println(i + "번지와 " + (i + 1) + "번지 비교 성공");
            } else {
                failCheck++;
            }
        }

        if (failCheck == 0) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
