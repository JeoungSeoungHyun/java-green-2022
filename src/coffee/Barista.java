package coffee;

public class Barista {

	public Coffee makeCoffee(String coffeeName) {
		Coffee coffee = new Coffee(coffeeName);
		return coffee;
	}
}
