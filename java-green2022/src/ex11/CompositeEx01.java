package ex11;

class 엔진 {
    int power = 5000;
}

class 소나타 { // extends 엔진 하면 다형성이 성립이 안된다. 추상화가 안돼!!

    // has 관계(콤포지션) =>소나타는 엔진에 의존적이다. is관계(다형성)
    // 구체적인 것에 결합하는 것을 강한 결합이라고 한다. 코드 수정 필요
    // 추상적인 것에 결합하는 것을 느슨한 결합이라고 한다. 코드 수정 불필요
    // 강한 결합과 느슨한 결합은 추상화 부분에서의 개념이 아니라 콤포지션 부분에서의 개념이다.
    엔진 engine; // new해서 해버리면 나중에 바꾸려면 다 바꿔야 한다.
    // 가져야 할 것을 생성자로 주입 받아줘야 한다.
    // nullpointerexception에러가 날 수가 없다. 그전에 오류 뜸

    소나타(엔진 engine) {
        this.engine = engine;
    }
}

public class CompositeEx01 {
    public static void main(String[] args) {
        엔진 e = new 엔진();
        소나타 s = new 소나타(e);
        System.out.println(s.engine.power); // null을 가르키므로 engine에서 오류가 발생.
    }
}
