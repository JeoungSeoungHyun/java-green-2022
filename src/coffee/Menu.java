package coffee;

import java.util.List;

public class Menu {
	private List<String> items;

	public Menu(List<String> items) {
		this.items = items;
	}

	// å��
	public String choose(String coffeeName) {
		for (String item : items) {
			if (item.equals(coffeeName)) {
				return item;
			}
		}
		return null;
	}
}
