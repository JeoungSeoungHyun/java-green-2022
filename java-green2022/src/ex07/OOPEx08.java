package ex07;

class Person2 {
    String name;
    int height;
    int weight;

    Person2(String d1, int d2, int d3) { // 매개변수(파라미터)
        name = d1;
        height = d2;
        weight = d3;
    }
}

/**
 * <생성자>
 * 클래스 이름과 동일해야 한다.
 * 클래스의 상태를 초기화를 위해 사용한다.
 * return값이 없다.
 * 내가 만들지 않으면 자동으로 생성된다.
 */

public class OOPEx08 {
    public static void main(String[] args) {
        Person2 s1 = new Person2("홍길동", 170, 70); // argument
        Person2 s2 = new Person2("임꺽정", 150, 200);
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}
// 'new 클래스명()' 을 생성자 호출문이라고 한다.
