package edu.uno.csci2830;

public class ThickCrust extends PizzaCrust {
	private final boolean deepDish;

	public ThickCrust(String ingredient, boolean deepDish) {
		super(ingredient);
		this.deepDish = deepDish;
	}

	public boolean isDeepDish() {
		return deepDish;
	}

	@Override
	public String toString() {
		return "Thick Crust";
	}

	@Override
	public String toNiceString() {
		return "Thick Crust (ingredient: " + getIngredient() + ", deep dish: " + deepDish + ")";
	}
}
