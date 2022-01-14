package ex06;

public class WhileEx06 {
    public static void main(String[] args) {

        int n = 1;

        // 변수 n을 이용해서 1부터 10까지 중 2의 배수를 출력하시오.
        // 출력이 끝나면 break 문으로 빠져나오시오.

        while (true) {

            if (n % 2 == 0) {
                System.out.println(n);
            }
            n = n + 1;

            if (n > 10) { // 조건문이 위에 있는게 좋을까 밑에 있는게 좋을까
                break; // 밑에 있는게 while문을 한 번 덜 타기 때문에 더 좋다.
            }
        }
    }
}
