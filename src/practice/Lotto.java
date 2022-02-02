package practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class Dataes {
    private Set<Integer> dataes;

    Dataes(Set<Integer> dataes) {
        this.dataes = dataes;
    }

    public Set<Integer> getDataes() {
        return dataes;
    }

}

public class Lotto {
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
                        i = 0;
                    }
                }
            }
        }
        System.out.println("당첨 번호 : " + winArray); // 당첨 번호 확인

        // 스캔으로 금액을 입력받는다.
        System.out.println("금액을 입력하세요 ex)5000");
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
        }
        // System.out.println("구입한 복권 번호 : " + dataesArray); // 구입한 복권 번호 확인

        // 당첨 번호 정렬 확인
        Collections.sort(winArray);
        System.out.println("당첨번호정렬 : " + winArray);

        // 구입한 복권 하나 확인
        for (int i = 0; i < dataesArray.size(); i++) {
            Iterator<Integer> its = dataesArray.get(i).iterator();
            while (its.hasNext()) {
                compareArray.add(its.next());
            }
            // System.out.println("구입한 복권 하나 확인 : " + compareArray);

            Collections.sort(compareArray);
            // System.out.println("구입한 복권 하나 정렬 확인 : " + compareArray);

            // 당첨복권과 비교하여 맞은 개수 확인
            for (int j = 0; j < compareArray.size(); j++) {
                for (int k = 0; k < winArray.size(); k++) {
                    if (compareArray.get(j) == winArray.get(k)) {
                        count++;
                    }
                }
            }
            // System.out.println("복권 맞은 개수" + count); // 복권 맞은 번호 개수

            // 결과 발표
            if (count == 6) {
                System.out.println("당첨입니다~! 부럽다..");
            } else {
                System.out.println("복권 맞은 개수 : " + count + "개" + " 다음 기회에....");
            }
            count = 0;
            compareArray.clear();
        }
    }
}
