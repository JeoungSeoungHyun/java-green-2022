package ex20;

public class LibEx01 {
    public static void main(String[] args) {
        double num = 10.5;
        double result = Math.abs(-10.0);
        System.out.println(result);
        // 새로운 라이브러리를 사용할 때는 return타입이 뭔지 확인해보고 써야한다.
        double result2 = Math.ceil(num);
        System.out.println(result2);
        double result3 = Math.floor(num);
        System.out.println(result3);

        System.out.println("==============================");

        double a = 12.3456789;
        System.out.println((double) Math.round(a * 100));

        // 두개 ctrl로 보면 다르다 -> 오버로딩 된거다
        Math.abs(-10);
        Math.abs(-10.0);
    }
}