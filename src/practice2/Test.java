package practice2;

public class Test {
    public static void main(String[] args) {

        while (true) {
            int n = 0;
            System.out.println("while");
            for (int i = 0; i < 10; i++) {
                n++;
                System.out.println(n);
                if (n == 5) {
                    break;
                }
            }

            System.out.println("while break 안걸림");
            break;
        }
    }
}
