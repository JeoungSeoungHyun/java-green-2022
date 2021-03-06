package cafe;

abstract public class Barista {

    public Coffee makeCoffe(MenuItem menuItem) {
        Coffee coffee = new Coffee(menuItem);
        return coffee;
    }

    abstract public String getName();

    abstract public void setName(String name);
}
