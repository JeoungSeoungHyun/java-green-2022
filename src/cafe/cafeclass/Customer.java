package cafe.cafeclass;

abstract public class Customer {

    public void order(String coffeeName, Menu menu, Barista barista) {
        MenuItem menuItem = menu.choose(coffeeName);
        Coffee coffee = barista.makeCoffe(menuItem);

        notify(coffee);
    }

    abstract public void notify(Coffee coffee);

    abstract public String getName();
}
