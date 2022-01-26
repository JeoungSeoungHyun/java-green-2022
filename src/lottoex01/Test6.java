package lottoex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test6 {
    public static void main(String[] args) {
        // 6. ArrayList 로또 2개 만들어서 비교해보기(로또 세트랑 바로 비교하지말고 하나 비교해보는 것)
        List<Integer> a = new ArrayList<>();
        List<Integer> b = Arrays.asList(2, 4, 5, 8, 19, 31);

        a.add(2);
        a.add(4);
        a.add(5);
        a.add(8);
        a.add(19);
        a.add(31);

        // 테스트
        // int failCheck = 0;
        // if (a.get(0) == b.get(0)) {
        // System.out.println("0번지 확인");
        // } else {
        // failCheck++;
        // }
        // if (a.get(1) == b.get(1)) {
        // System.out.println("1번지 확인");
        // } else {
        // failCheck++;
        // }
        // if (a.get(2) == b.get(2)) {
        // System.out.println("2번지 확인");
        // } else {
        // failCheck++;
        // }
        // if (a.get(3) == b.get(3)) {
        // System.out.println("3번지 확인");
        // } else {
        // failCheck++;
        // }
        // if (a.get(4) == b.get(4)) {
        // System.out.println("4번지 확인");
        // } else {
        // failCheck++;
        // }
        // if (a.get(5) == b.get(5)) {
        // System.out.println("5번지 확인");
        // } else {
        // failCheck++;
        // }

        // 검증
        final int LOTTOSIZE = a.size();
        int failCheck = 0;
        for (int i = 0; i < LOTTOSIZE; i++) {
            if (a.get(i) == b.get(i)) {
                System.out.println(i + "번지 확인");
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
