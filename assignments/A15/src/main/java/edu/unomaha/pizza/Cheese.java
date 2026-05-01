package edu.unomaha.pizza;

public enum Cheese {
	AMERICAN(0.75),
	SWISS(1.00),
	CHEDDAR(0.75),
	PEPPERJACK(1.25);

	private final double price;
	private Cheese(double price){
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}
