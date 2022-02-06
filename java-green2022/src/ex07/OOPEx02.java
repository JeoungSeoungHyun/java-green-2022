package ex07;

class Doctor {
    String name = "홍길동";
    int sal = 5000;
}

public class OOPEx02 {
    public static void main(String[] args) {

        Doctor info = new Doctor(); // info는 레퍼런스 변수
        System.out.println(info.name);
        System.out.println(info.sal);

    }
}