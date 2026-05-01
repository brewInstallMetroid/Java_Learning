package edu.unomaha.pizza;

import edu.unomaha.pizza.Pizza;
import edu.unomaha.pizza.topping.*;
import edu.unomaha.pizza.crust.*;
import edu.unomaha.pizza.sauce.*;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AssembledPizzaTest {
	@Test
	void testAssembledPizza() {
		Pizza pz = new Pizza(); 
		double initialPrice = pz.getPrice();
		List<MenuItem> order = new ArrayList<>();

		ThinCrust crust = new ThinCrust();
		pz.setCrust(crust);
		TomatoSauce sauce = new TomatoSauce();
		pz.setSauce(sauce);
		PepperoniTopping pep = new PepperoniTopping();
		pz.addTopping(pep);
		MozzarellaTopping mozz = new MozzarellaTopping();
		pz.addTopping(mozz);

		order.add(pz);
		double newPrice = order.get(0).getPrice();
		assertEquals(initialPrice + crust.getPrice() + sauce.getPrice() + pep.getPrice() + mozz.getPrice(), newPrice, 0.0001); 

	}
}

/*
 * ARRANGE:
 * Pizza pizza = new Pizza();
 * double initialPrice = pizza.getPrice();
 * Topping pepperoni = new Pepperoni();
 *
 * ACT:
 * pizza.addTopping(pepperoni);
 * double newPrice = pizza.getPrice();
 *
 * ASSERT:
 * asserEquals(initialPrice + pepperoni.getPrice(), newPrice, 0.0001);
 */
