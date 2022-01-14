package ex05;

public class OperEx02 {
    public static void main(String[] args) {
        System.out.println(false);
        System.out.println(!(1 == 1)); // 괄호는 우선순위를 지정할 수 있다.
        // System.out.println(!1 == 1); // 1을 부정할 수 없기 때문에 오류가 발생
        System.out.println(!true); // !부정
        System.out.println(1 != 1); // 같지 않나요?
        System.out.println(1 < 2);
    }
}
