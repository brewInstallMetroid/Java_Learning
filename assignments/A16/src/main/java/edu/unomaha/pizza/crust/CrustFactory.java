package edu.unomaha.pizza.crust;
import edu.unomaha.pizza.crust.*;

public class CrustFactory {
	public static PizzaCrust getCrust(String crustName) {
		if (crustName.equalsIgnoreCase("THICK")) {
			return new ThickCrust();
		} else if (crustName.equalsIgnoreCase("THIN")) {
			return new ThinCrust();
		} else {
			return null;
		}
	}
}
