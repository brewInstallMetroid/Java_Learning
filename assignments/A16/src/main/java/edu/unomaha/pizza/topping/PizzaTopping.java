package edu.unomaha.pizza.topping;
import edu.unomaha.pizza.AbstractMenuItem;

public abstract class PizzaTopping extends AbstractMenuItem {
	public abstract String toString(); 
	protected int spiciness = 0;
	
    public void setSpiciness(int level) {
        this.spiciness = level;
    }

	public String toNiceString() {
		return "Topping is: " + toString();
	}

	public Double getPrice() {
		return 0.50; // default price for topping
	}
}
