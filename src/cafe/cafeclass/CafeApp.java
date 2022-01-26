package cafe.cafeclass;

import java.util.Arrays;
import java.util.List;

public class CafeApp {
    public static void main(String[] args) {
        Barista barista = new Employee1("공유");
        Customer customer = new Employee2("홍길동");

        List<MenuItem> menuItem = Arrays.asList(
                new MenuItem("아메리카노", 1500),
                new MenuItem("카푸치노", 2000),
                new MenuItem("바닐라라떼", 2300),
                new MenuItem("에스프레소", 1700));

        Menu menu = new Menu(menuItem);
        customer.order("아메리카노", menu, barista);
        customer.order("카푸치노", menu, barista);
        customer.order("바닐라라떼", menu, barista);
        customer.order("에스프레소", menu, barista);
    }
}
