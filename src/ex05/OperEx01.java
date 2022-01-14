package ex05;

public class OperEx01 {
    public static void main(String[] args) {
        System.out.println(1 + 1);
        System.out.println(1 - 1);
        System.out.println(2 * 2);
        System.out.println(2 / 2); // 나누기
        System.out.println(3 % 2); // 나머지

        // 더하기(산술더하기 or 결합)
        // String s1 = 문자; =>오류 : 왼쪽 오른쪽 타입이 같아야 하는데 '문자'는 문자열 취급 안됨
        // java에서 문자는 ""로 감싸야 한다.
        System.out.println("1" + 1);
    }

}
