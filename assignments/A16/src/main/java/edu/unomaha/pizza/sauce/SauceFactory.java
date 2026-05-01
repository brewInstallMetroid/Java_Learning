package edu.unomaha.pizza.sauce;
import edu.unomaha.pizza.sauce.*;

public class SauceFactory {
	public static PizzaSauce getSauce(String sauceName) {
		if (sauceName.equalsIgnoreCase("ALFREDO")) {
			return new AlfredoSauce();
		} else if (sauceName.equalsIgnoreCase("TOMATO")) {
			return new TomatoSauce();
		} else {
			return null;
		}
	}
}
