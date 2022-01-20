package practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Prac {
    public static void main(String[] args) {
        List<Integer> winArray = new ArrayList<>();
        Random num = new Random();

        while (winArray.size() != 6) {
            int n = num.nextInt(45) + 1;
            winArray.add(n);
            for (int i = 0; i < winArray.size(); i++) {
                for (int j = 0; j < i; j++) {
                    System.out.println("i =" + i + "j=" + j);
                    if (winArray.get(i) == winArray.get(j)) {

                        winArray.remove(i);

                    }
                }
            }
        }
        System.out.println("당첨 번호 : " + winArray); // 당첨 번호 확인
    }
}