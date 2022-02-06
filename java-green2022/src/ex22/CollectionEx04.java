package ex22;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionEx04 {
    public static void main(String[] args) {
        Random r = new Random();

        List<Integer> dataes = new ArrayList<>();
        while (true) {
            int n = r.nextInt(45) + 1; // 2= 0~1
            dataes.add(n);
            for (int i = 0; i < dataes.size(); i++) {
                System.out.println(dataes);

                // }
                // }

                // if (dataes.size() == 6) {
                // break;
                // }
                // }

                // HashSet 에 n값을 add해서 저장
            }
        }
    }
}
// HashSet 데이터 출력!!
