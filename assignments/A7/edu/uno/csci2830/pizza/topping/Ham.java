package edu.uno.csci2830.pizza.topping;

public class Ham extends MeatTopping {
	@Override
	public String toString() {
		return "Ham";
	}

	@Override
	public String toNiceString() {
		return "Ham (meat)";
	}
}
