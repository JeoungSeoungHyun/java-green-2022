package lottoex01;

import java.util.HashSet;

public class Test3 {
    public static void main(String[] args) {
        // 3. HashSet으로 랜덤한 로또 번호 6개 받기
        // Mock
        HashSet<Integer> numberLotto = new HashSet<>();
        numberLotto.add(2);
        numberLotto.add(5);
        numberLotto.add(40);
        numberLotto.add(25);
        numberLotto.add(6);

        // 눈으로 테스트
        System.out.println(numberLotto);

        // 검증
        if (numberLotto.size() == 5) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }
}
