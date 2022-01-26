package lottoex01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test5 {
    public static void main(String[] args) {
        // 5. 로또 세트(Hash Set) 5개를 ArrayList에 담기
        // Mock
        Set<Integer> lotto1 = new HashSet<>();
        Set<Integer> lotto2 = new HashSet<>();
        Set<Integer> lotto3 = new HashSet<>();
        Set<Integer> lotto4 = new HashSet<>();
        Set<Integer> lotto5 = new HashSet<>();
        List<Set<Integer>> buyLotto = new ArrayList<>();

        buyLotto.add(lotto1);
        buyLotto.add(lotto2);
        buyLotto.add(lotto3);
        buyLotto.add(lotto4);
        buyLotto.add(lotto5);

        // 눈으로 확인
        System.out.println(buyLotto);

        // 검증
        if (buyLotto.size() == 5) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }

}
