package ex07;

//class이름 같으면 오류 다른데서도 쓸 수 있어서
class Person {
    String name;
    int height;
    int weight;

    // 클래스 설계도에 생성자를 내가 직접 만들지 않으면 디폴트 생성자가 만들어진다. 매번 필요한데 아무 내용도 필요없으니 편하게 자동으로
    // 만들어주는 것
    // 클래스명(){}

    // 디폴트 생성자 - 객체의 초기화를 위해 필요!!
    Person() {
        System.out.println("사람이 생성되었습니다");
        name = "홍길동";
        height = 170;
        weight = 70;
    }
    // 이렇게 쓰면 똑같이 생성되므로 이렇게 사용하지는 않는다.
}

public class OOPEx07 {
    public static void main(String[] args) {
        Person s1 = new Person();
        System.out.println(s1.name);
    }
}
// Bulid failed 오류는 컴파일이 안되었다는것