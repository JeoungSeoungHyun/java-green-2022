package ex22;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class CollectionEx05 {
    public static void main(String[] args) {
        Random num = new Random();
        List<Set<Integer>> dataesArray = new ArrayList<>();
        List<Integer> winArray = new ArrayList<>();
        List<Integer> compareArray = new ArrayList<>();
        int count = 0;
        // 당첨 번호를 무작위로 ArrayList에 담는다
        while (winArray.size() != 6) {
            int n = num.nextInt(45) + 1;
            winArray.add(n);
            for (int i = 0; i < winArray.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (winArray.get(i) == winArray.get(j)) {
                        winArray.remove(i);
                        i = 0; // i=0으로 바꿔주지 않으면 i의 값과 winArray의 사이즈가 같아져서 IndexOutOfBoundsException 오류가 발생하게
                               // 된다.
                    } // 0인 이유는 더 이상 비교 할 필요가 없기 때문에 for문을 끝내기 위해서
                }
            }
        }

        System.out.println("당첨 번호 : " + winArray); // 당첨 번호 확인

        // 스캔으로 금액을 입력받는다. 1000원에 하나
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        // 구입한 복권 번호 생성
        for (int i = 0; i < money / 1000; i++) {
            Set<Integer> dataes = new HashSet<>();
            while (dataes.size() != 6) {
                int n = num.nextInt(45) + 1;
                dataes.add(n);
            }
            dataesArray.add(dataes);
            // 구입한 복권 번호 확인
        }

        System.out.println("구입한 복권 번호 : " + dataesArray);
        // 당첨 번호 정렬 확인
        Collections.sort(winArray);
        System.out.println("당첨번호정렬 : " + winArray);

        // 구입한 복권 하나 확인
        for (int i = 0; i < dataesArray.size(); i++) {
            Iterator<Integer> its = dataesArray.get(i).iterator();
            while (its.hasNext()) {
                compareArray.add(its.next());
            }

            // 구입한 복권 하나 정렬 확인
            Collections.sort(compareArray);
            // System.out.println("구입한 복권 하나 정렬 확인 : " + compareArray);

            // 당첨인지 확인
            for (int j = 0; j < compareArray.size(); j++) {
                if (compareArray.get(j) == winArray.get(j)) {
                    count++;
                }
            }

            // 결과 발표
            if (count == 6) {
                System.out.println("당첨입니다~! 부럽다..");
            } else {
                System.out.println("다음 기회에....");
            }
            compareArray.clear();
            count = 0;
        }
    }
}