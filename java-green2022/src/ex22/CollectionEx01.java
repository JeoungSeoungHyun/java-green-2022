package ex22;

import java.util.ArrayList;

public class CollectionEx01 {
    public static void main(String[] args) {

        // ArrayList는 데이터가 중복되도 되는 데이터 모임
        // 여러개의 데이터가 저장되는 제네릭 박스
        ArrayList<String> dataes = new ArrayList<String>(); // 무슨 타입이 들어올지 모르니 제네릭으로 라이브러리를 만들어놓았다.
        dataes.add("데이터1");
        dataes.add("데이터2");
        dataes.add("데이터3");
        dataes.add("데이터4");

        dataes.set(1, "data2");
        dataes.remove(3);
        System.out.println(dataes.get(0));
        System.out.println(dataes.get(1));
        System.out.println(dataes.get(2));
        // System.out.println(dataes.get(3));

    }
}