package ex11;

class 가구 {
    String name = "가구";

    // 오버로딩
    // 부모클래스의 디폴트 생성자가 안 만들어지면 상속했을 때 오류가 난다.
    가구() {
    }

    가구(int temp) {

    }
}

// super는 extends한 경우에만 사용 가능
// 1. 'super 부모, this 자기자신' 이 나중에 뜰 힙 메모리 공간을 미리 표시해놓는 것
// 2. 자식을 new하면 자식의 생성자에 super() 문장이 생략되어 있음. 내가 적으면 사라짐
class 침대 extends 가구 {
    String name = "침대";

    침대() {
        super(); // 부모클래스 생성자
        // super(1);
        System.out.println(super.name);
    }
}

public class SuperEx01 {
    public static void main(String[] args) {
        침대 s = new 침대();
    }
}
