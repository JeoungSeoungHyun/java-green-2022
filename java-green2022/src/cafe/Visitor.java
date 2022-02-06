package cafe;

public class Visitor extends Customer {
    private String name;

    public Visitor(String name) {
        this.name = name;
    }

    public void notify(Coffee coffee, Barista barista) {
        System.out.println(name + "이(가) " + barista.getName() + "에게 " + coffee.getPrice() + "원 " + coffee.getName()
                + "를(을) 받았습니다.");
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
