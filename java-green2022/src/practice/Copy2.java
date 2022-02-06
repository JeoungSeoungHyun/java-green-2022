package practice;

class 애완동물 {
    void sound() {
    }

    void printName() {

    }

    void chageName(String 앵무새) {

    }

}

class 강아지 extends 애완동물 {

    String name = "강아지";

    void sound() {
        System.out.println("멍멍");
    }

    void printName() {
        System.out.println(name);
    }

    void chageName() {
        System.out.println("송아지");
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

    void chageName(String 앵무새) {
        name = 앵무새;
        System.out.println(name);
    }
}

public class Copy2 {

    static void start(애완동물 u1) {
        u1.sound();
        u1.printName();
        u1.chageName("참치");

    }

    public static void main(String[] args) {
        애완동물 cat = new 고양이();
        강아지 dog = new 강아지();
        start(cat);
    }
}