package ex00;

// 계산기
// 상태와 행위가 꼭 필요한 것은 아니다.

class Calculator {

    // void 는 출구가 없다.
    // add뒤에 있는 () 입구
    // 모듈이 총 4개 -> 모여있는 클래스는 라이브러리
    // 라이브러리는 모듈이 모여있는 것 (하나의 모듈도 라이브러리가 될 수 있다.)

    // add(더하기)
    void add(int n1, int n2) {
        System.out.println("더하기 메서드입니다.");
        System.out.println(n1 + n2);
    }

    // minus(빼기)
    void minus(int n1, int n2) {
        System.out.println("빼기 메서드입니다.");
        System.out.println(n1 - n2);
    }

    // multi(곱하기)
    void multi(int n1, int n2) {
        System.out.println("곱하기 메서드입니다.");
        System.out.println(n1 * n2);
    }

    // divide(나누기)
    void divide(int n1, int n2) {
        System.out.println("나누기 메서드입니다.");
        System.out.println(n1 / n2);
    }
}

public class MethEx01 {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.add(10, 5);
        c1.minus(10, 5);
        c1.multi(10, 5);
        c1.divide(10, 5);
    }
}
