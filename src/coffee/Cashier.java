package coffee;

import java.util.ArrayList;
import java.util.List;

public class Cashier {

	List<String> orderList = new ArrayList<>();

	public Coffee completeOrder(String menuItem, Barista barista) {
		orderList.add(menuItem);

		Coffee coffee = barista.makeCoffee(menuItem);

		return coffee;
	}
}
