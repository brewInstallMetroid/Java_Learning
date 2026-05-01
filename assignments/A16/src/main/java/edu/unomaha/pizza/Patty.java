package edu.unomaha.pizza;

public enum Patty {
	BEEF(3.0),
    CHICKEN(2.5),
    VEGGIE(2.0);

    private double price;
    Patty(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}
