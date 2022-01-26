package cafe;

abstract public class Customer {

    public void order(String coffeeName, Menu menu, Barista barista) {

        MenuItem menuItem = menu.choose(coffeeName);

        if (menuItem != null) {
            Coffee coffee = barista.makeCoffe(menuItem);
            notify(coffee, barista);
        } else {
            System.out.println("없는 메뉴입니다.");
        }
    }

    abstract public void notify(Coffee coffee, Barista barista);

    abstract public String getName();

    abstract public void setName(String name);
}
