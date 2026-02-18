package edu.uno.csci2830;

public abstract class PizzaCrust {
	private final String ingredient;

	public PizzaCrust(String ingredient) {
		this.ingredient = ingredient;
	}

	public String getIngredient() {
		return ingredient;
	}

	@Override
	public abstract String toString();

	public abstract String toNiceString();
}
