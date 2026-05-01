package edu.unomaha.pizza;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import edu.unomaha.pizza.Bun;
import edu.unomaha.pizza.Burger;
import edu.unomaha.pizza.Garnish;

public class BurgerTest {
	@Test
	void testBurgerPrice() {
		Burger bg = new Burger(Bun.POPPYSEED);
		double initialPrice = bg.getPrice();

		bg.addGarnish(Garnish.RELISH);
		double newPrice = bg.getPrice();

		assertEquals(initialPrice + Garnish.RELISH.getPrice(), newPrice, 0.0001);
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

