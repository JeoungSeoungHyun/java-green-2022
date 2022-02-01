package lottoex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Random num = new Random();
        List<List<Integer>> buyLotto = new ArrayList<>();

        // 스캔으로 금액을 입력받는다.
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        // lotto = > 구입하는 복권 하나
        for (int i = 0; i < money / 1000; i++) {
            Set<Integer> lotto = new HashSet<>();
            while (lotto.size() != 6) {
                int n = num.nextInt(45) + 1;
                lotto.add(n);
                // 구입했던 복권 번호 확인하여 중복되는 번호는 제거
                for (int j = 0; j < buyLotto.size(); j++) {
                    for (int k = 0; k < buyLotto.get(j).size(); k++) {
                        if (n == buyLotto.get(j).get(k)) {
                            lotto.remove(n);
                        }
                    }
                }
            }
            List<Integer> temp = new ArrayList<>(lotto);
            Collections.sort(temp);
            buyLotto.add(temp);
        }

        System.out.println(buyLotto);
    }
}