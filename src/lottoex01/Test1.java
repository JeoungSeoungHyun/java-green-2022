package lottoex01;

import java.util.ArrayList;

/**
 * 단위 테스트(모르는 건 무조건 테스트 과정에 넣어라!)
 * 1. ArrayList에 숫자 6개 담기
 * 2. Scanner로 금액 입력받아서 횟수 정하기 ex) 5000 -> 5회
 * 3. HashSet으로 랜덤한 로또 번호 6개 받기
 * 4. HashSet은 순서를 보장하지 않고 데이터를 가지기 떄문에 순차 정렬이 필요! (구글링)
 * 5. 로또 세트(Hash Set) 5개를 ArrayList에 담기
 * 6. ArrayList 로또 2개 만들어서 비교해보기(로또 세트랑 바로 비교하지말고 하나 비교해보는 것)
 */
public class Test1 {
    public static void main(String[] args) {
        // 1. ArrayList에 숫자 6개 담기(Mock)
        ArrayList<Integer> buyLotto = new ArrayList<>();
        buyLotto.add(3);
        buyLotto.add(15);
        buyLotto.add(20);
        buyLotto.add(25);
        buyLotto.add(30);
        buyLotto.add(35);

        // 눈으로 테스트
        System.out.println(buyLotto);

        // 검증(Verify)
        if (buyLotto.size() == 6) {
            System.out.println("테스트 성공");
        } else {
            System.out.println("테스트 실패");
        }
    }

}
