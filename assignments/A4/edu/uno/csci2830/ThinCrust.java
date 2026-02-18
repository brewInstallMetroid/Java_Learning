package edu.uno.csci2830;

public class ThinCrust extends PizzaCrust {
	public ThinCrust(String ingredient) {
		super(ingredient);
	}

	@Override
	public String toString() {
		return "Thin Crust";
	}

	@Override
	public String toNiceString() {
		return "Thin Crust (ingredient: " + getIngredient() + ")";
	}
}
