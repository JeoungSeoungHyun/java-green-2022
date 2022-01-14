package ex06;

public class WhileEx03 {
    public static void main(String[] args) {
        // 남은 동전 구하기 게임(500, 100, 50, 10)
        int money = 2680; // 500*5, 100*1, 50*1, 10*3
        // 타입이 double일 경우 int로 명시적 형변환 해줘야 된다.
        int restMoney = money;

        int coin = 500;

        // 1. 500원 동전 구하기
        System.out.println(coin + "원 ================");
        System.out.println(restMoney / coin + "개");
        restMoney = restMoney % 500; // 180원

        // 2. 100원 동전 구하기
        coin = 100;
        System.out.println(coin + "원 ================");
        System.out.println(restMoney / 100 + "개");
        restMoney = restMoney % 100; // 80원

        // 3. 50원 동전 구하기
        coin = 50;
        System.out.println(coin + "원 ================");
        System.err.println(restMoney / 50 + "개 ");
        restMoney = restMoney % 50; // 30원

        // 4. 10원 동전 구하기
        coin = 10;
        System.out.println(coin + "원 ================");
        System.err.println(restMoney / 10 + "개");
    }
}
