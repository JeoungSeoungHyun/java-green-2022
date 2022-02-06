package ex07;

// 1. 자바는 모든 코드가 class 내부에 있어야 한다. 1급 객체(제일 바깥에 존재할 수 있는 것)
// 2. 자바는 즉 class만 1급
// 3. class = 설계도
// 4. 클래스는 상태(변수)와 행위(메서드)를 가진다.
// 5. static은 찾을 때 클래스명.변수명
// !!6. static이 아닌 애들을 메모리에 띄우는 법 new 클래스명() ->heap에 뜬다
// !!7. 상태는 행위를 통해 변경해야 한다.

class Dog {
    int 배고픔 = 100; // 범위 0~100

    void 밥먹기() { // 메서드 = 행위
        배고픔 = 0;
    }
}

public class OOPEx04 {
    public static void main(String[] args) {
        Dog dd = new Dog();
        System.out.println(dd.배고픔);
        dd.밥먹기(); // 행위
        System.out.println(dd.배고픔);
    }
}
