package edu.unomaha.pizza;

import edu.unomaha.pizza.Pizza;
import edu.unomaha.pizza.topping.*;
import edu.unomaha.pizza.crust.*;
import edu.unomaha.pizza.sauce.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoPizzaTest{
	@Test
	void testAssembledPizza() {
		Pizza pz = new Pizza();
		Pizza pz2 = new Pizza();
		double initialPrice = pz.getPrice() + pz2.getPrice();
		List<MenuItem> order = new ArrayList<>();

		ThinCrust crust = new ThinCrust();
		pz.setCrust(crust);
		TomatoSauce sauce = new TomatoSauce();
		pz.setSauce(sauce);
		PepperoniTopping pep = new PepperoniTopping();
		pz.addTopping(pep);
		MozzarellaTopping mozz = new MozzarellaTopping();
		pz.addTopping(mozz);

		ThinCrust crust2 = new ThinCrust();
		pz2.setCrust(crust2);
		TomatoSauce sauce2 = new TomatoSauce();
		pz2.setSauce(sauce2);
		PepperoniTopping pep2 = new PepperoniTopping();
		pz2.addTopping(pep2);
		MozzarellaTopping mozz2 = new MozzarellaTopping();
		pz2.addTopping(mozz2);

		order.add(pz);
		order.add(pz2);

		Double newPrice = 0.0;
		for (MenuItem item : order) {
			newPrice += item.getPrice();
		}
		assertEquals(initialPrice + crust.getPrice() + sauce.getPrice() + pep.getPrice() + mozz.getPrice() + crust2.getPrice() + sauce2.getPrice() + pep2.getPrice() + mozz2.getPrice(), newPrice, 0.0001); 


	}
}
