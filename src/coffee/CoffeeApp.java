package coffee;

import java.util.ArrayList;
import java.util.List;

public class CoffeeApp {

	public static void main(String[] args) {
		Customer customer = new Customer();

		Barista barista = new Barista();

		Cashier cashier = new Cashier();

		List<String> items = new ArrayList<>();
		items.add(CoffeeList.AMERICANO);
		items.add(CoffeeList.CAFERATTE);
		items.add(CoffeeList.CAFEMOCA);
		items.add(CoffeeList.MAKIYATTO);

		Menu menu = new Menu(items);

		customer.order(CoffeeList.CAFEMOCA, menu, cashier, barista);
		customer.order(CoffeeList.MAKIYATTO, menu, cashier, barista);
		customer.order(CoffeeList.MAKIYATTO, menu, cashier, barista);
		customer.order(CoffeeList.CAFERATTE, menu, cashier, barista);

		System.out.println("������ �ֹ� ���");
		for (String item : cashier.orderList) {
			System.out.print(item + " ");
		}

	}

}
