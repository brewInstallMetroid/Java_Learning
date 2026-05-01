package edu.unomaha.pizza.topping;
import edu.unomaha.pizza.topping.*;

public class ToppingFactory {
	public static PizzaTopping getTopping(String toppingName) {

		if (toppingName.equalsIgnoreCase("PEPPERONI")) {
			return new PepperoniTopping();
		} else if (toppingName.equalsIgnoreCase("ASIAGO")) {
			return new AsiagoTopping();
		} else if (toppingName.equalsIgnoreCase("CHEESE")) { 
			return new CheeseTopping();
		} else if (toppingName.equalsIgnoreCase("MEAT")) { 
			return new MeatTopping();
		} else if (toppingName.equalsIgnoreCase("MOZZARELLA")) {
			return new MozzarellaTopping();
		} else if (toppingName.equalsIgnoreCase("MUSHROOM")) { 
			return new MushroomTopping();
		} else if (toppingName.equalsIgnoreCase("PEPPER")) { 
			return new PepperTopping();
		} else if (toppingName.equalsIgnoreCase("SAUSAGE")) { 
			return new SausageTopping();
		} else if (toppingName.equalsIgnoreCase("VEGGIE")) { 
			return new VeggieTopping();
		} else {
			return null;
		}
	}
}
