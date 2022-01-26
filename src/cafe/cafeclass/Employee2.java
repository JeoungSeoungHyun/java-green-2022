package cafe.cafeclass;

public class Employee2 extends Customer {
    private String name;

    public Employee2(String name) {
        this.name = name;
    }

    public void notify(Coffee coffee) {
        System.out.println(name + "이(가) " + coffee.getPrice() + "원 " + coffee.getName() + "을(를) 받았습니다.");
    };

    public String getName() {
        return name;
    }

}
