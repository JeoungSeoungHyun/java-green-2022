package ex20;

import java.util.Random;

public class LibEx02 {

    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
        }
    }
}
