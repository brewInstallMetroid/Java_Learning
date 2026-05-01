package edu.unomaha.pizza;

public enum Bun {
	POPPYSEED(2.25),
	REGULAR(1.75),
	PRETZEL(2.50);
	
	private final double price;
	private Bun(double price){
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}
