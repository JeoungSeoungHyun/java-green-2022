package ex22;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CollectionEx03 {
    public static void main(String[] args) {
        Random r = new Random();

        Set<Integer> dataes = new HashSet<Integer>();
        while (true) {
            int n = r.nextInt(45) + 1; // 2= 0~1
            dataes.add(n);
            if (dataes.size() == 6) {
                break;
            }
            // HashSet 에 n값을 add해서 저장
        }

        // HashSet 데이터 출력!!
        System.out.println(dataes);
    }
}