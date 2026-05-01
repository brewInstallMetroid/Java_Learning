package edu.unomaha.pizza;

import edu.unomaha.pizza.Pizza;
import edu.unomaha.pizza.topping.*;
import edu.unomaha.pizza.crust.*;
import edu.unomaha.pizza.sauce.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PizzaTest{
	@Test
	void testAssembledPizza() {
		Pizza pz = new Pizza(); 
		double initialPrice = pz.getPrice();

		ThinCrust crust = new ThinCrust();
		pz.setCrust(crust);
		TomatoSauce sauce = new TomatoSauce();
		pz.setSauce(sauce);
		PepperoniTopping pep = new PepperoniTopping();
		pz.addTopping(pep);
		MozzarellaTopping mozz = new MozzarellaTopping();
		pz.addTopping(mozz);

		assertEquals(initialPrice + crust.getPrice() + sauce.getPrice() + pep.getPrice() + mozz.getPrice(), pz.getPrice(), 0.0001); 

	}
}
