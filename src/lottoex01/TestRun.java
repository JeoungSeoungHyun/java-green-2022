package lottoex01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class TestRun {

    /**
     * 단위 테스트(모르는 건 무조건 테스트 과정에 넣어라!)
     * 1. ArrayList에 숫자 6개 담기
     * 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
     * 3. HashSet으로 랜덤한 로또 번호 6개 받기
     * 4. HashSet은 순서를 보장하지 않고 데이터를 가지기 떄문에 순차 정렬이 필요! (구글링)
     * 5. 로또 세트(Hash Set) 5개를 ArrayList에 담기
     * 6. ArrayList 로또 2개 만들어서 비교해보기(로또 세트랑 바로 비교하지말고 하나 비교해보는 것)
     */
    public static void main(String[] args) {
        List<Integer> numWin = new ArrayList<>();
        Random num = new Random();

        // 랜덤 당첨 번호 만들기
        while (numWin.size() != 6) {
            int n = num.nextInt(45) + 1;
            numWin.add(n);
            for (int i = 0; i < numWin.size(); i++) {
                for (int j = 0; j < i; j++) {
                    if (numWin.get(numWin.size() - 1) == numWin.get(j)) {
                        numWin.remove(numWin.size() - 1);
                        break;
                    }
                }
            }
        }
        System.out.println("당첨번호 : " + numWin);

        // 스캔으로 금액 입력받아 횟수정하기
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        List<List<Integer>> buyLotto = new ArrayList<>();
        // HashSet으로 랜덤한 로또 번호 6개 받기 * 금액만큼
        for (int j = 0; j < (int) (money / 1000); j++) {
            Set<Integer> lotto = new HashSet<>();
            while (lotto.size() != 6) {
                int n = num.nextInt(45) + 1;
                lotto.add(n);
            }
            List<Integer> sortLotto = new ArrayList<>(lotto);
            Collections.sort(sortLotto);
            buyLotto.add(sortLotto);
            // System.out.println(lotto);
        }
        System.out.println("구매로또 : " + buyLotto);

        // 비교해보기
        final int LOTTOSIZE = numWin.size();
        final int BUYLOTTO = buyLotto.size();
        int check = 0;
        for (int i = 0; i < BUYLOTTO; i++) {
            for (int j = 0; j < LOTTOSIZE; j++) {
                for (int k = 0; k < LOTTOSIZE; k++)
                    if (buyLotto.get(i).get(j) == numWin.get(k)) {
                        check++;
                        break;
                    }
            }
            if (check == 6) {
                System.out.println("축하합니다. 당첨이에요. 부럽다...");
            } else {
                System.out.println("꽝 다음 기회에!!!! " + (i + 1) + "번째 복권 맞은 개수 : " + check + "개");
            }
            check = 0;
        }
    }
}
