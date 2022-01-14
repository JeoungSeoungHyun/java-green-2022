package ex06;

public class GugudanEx03 {
    public static void main(String[] args) {

        for (int step = 2; step <= 9; step++) {
            for (int step2 = 1; step2 <= 9; step2++) {
                System.out.println(step + "*" + step2 + "=" + step * step2);
            }
            System.out.println("=====================");
        }
    }
}