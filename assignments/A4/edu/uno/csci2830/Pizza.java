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

	// Must return an unmodifiable list
	public List<PizzaTopping> getToppings() {
		return Collections.unmodifiableList(toppings);
	}

	// Must limit to 4 toppings
	public boolean addTopping(PizzaTopping t) {
		if (t == null)
			return false;
		if (toppings.size() >= 4)
			return false;
		toppings.add(t);
		return true;
	}
}
