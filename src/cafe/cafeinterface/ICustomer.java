package cafe.cafeinterface;

import cafe.cafeclass.Menu;

public interface ICustomer {
    public void order(String coffeeName, Menu menu, IBarista barista);

    public String getName();

}
