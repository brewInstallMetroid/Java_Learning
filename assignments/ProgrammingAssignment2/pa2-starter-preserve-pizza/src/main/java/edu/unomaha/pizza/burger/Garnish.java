package edu.unomaha.pizza.burger;

public enum Garnish {
	RELISH(0.25),
	KETCHUP(0.15),
	PICKLES(0.15),
	TOMATO(0.00),
	ONION(0.00);

	private final double price;
	private Garnish(double price){
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}
