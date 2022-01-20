package ex22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionEx02 {
    public static void main(String[] args) {
        Set<Integer> dataes = new HashSet<Integer>();

        dataes.add(10);
        dataes.add(20);
        dataes.add(20);
        dataes.add(30);
        dataes.add(40);

        dataes.remove(10);

        System.out.println(dataes.size());
        System.out.println(dataes);
        // 해시는 데이터 중복되지 않을 때 사용
        Iterator<Integer> its = dataes.iterator();
        while (its.hasNext()) {
            System.out.println(its.next());
        }
    }
}