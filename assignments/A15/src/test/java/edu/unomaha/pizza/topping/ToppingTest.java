package edu.unomaha.pizza.topping;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ToppingTest {
	@Test
	void testPepperoniPrice() {
		PepperoniTopping t = new PepperoniTopping();
		assertTrue(t.getPrice() > 0);
	}
}
