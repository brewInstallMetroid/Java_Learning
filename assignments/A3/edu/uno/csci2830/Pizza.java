package edu.uno.csci2830;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza {
	private final PizzaCrust crust;
	private final PizzaSauce sauce;
	private final ArrayList<PizzaTopping> toppings = new ArrayList<>();

	public Pizza(PizzaCrust crust, PizzaSauce sauce) {
		this.crust = crust;
		this.sauce = sauce;
	}

	public PizzaCrust getCrust() {
		return crust;
	}

	public PizzaSauce getSauce() {
		return sauce;
	}

	public List<PizzaTopping> getToppings() {
		return Collections.unmodifiableList(toppings);
	}

	// Add topping if fewer than 4; return true if added
	public boolean addTopping(PizzaTopping t) {

		// TODO: enforce max of 4 toppings
		if (toppings.size() < 4) {
			toppings.add(t);
			return true;
		}

		return false;
	}
}
