package cafe.cafeclass;

import java.util.List;

public class Menu {
    private List<MenuItem> items;

    public Menu(List<MenuItem> items) {
        this.items = items;
    }

    public MenuItem choose(String name) {
        for (MenuItem Item : items) {
            if (Item.getName().equals(name)) {
                return Item;
            }
        }
        return null;
    }
}
