package ex11;

//추상클래스 추상메서드 클래스 클래스 앞에 abstract붙인다. new불가능
// 애완동물은 강아지 고양이 추상화시키기 위한 목적
// 자식들 메서드는 찾아지지만 변수는 못찾아
// 메서드를 이용해 변수를 찾아낸다. 오버라이드를 이용하여
class 애완동물 {
    // 오버라이드
    void sound() {
    }

    // 무효화
    void printName() {
        System.out.println("애완동물 printName");
    }

    void changeName() {

    }
}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }
}

class 고양이 extends 애완동물 {

    String name = "고양이";

    void sound() {
        System.out.println("야옹");
    }

    void printName() {
        System.out.println(name);
    }

    void changeName() {
        name = "앵무새";
    }
}

public class ExtendsEx03 {

    static void start(애완동물 u1) {
        u1.sound();
        u1.printName();
        u1.changeName();
        u1.printName();
    }

    public static void main(String[] args) {
        애완동물 cat = new 고양이();
        start(cat);
    }
}