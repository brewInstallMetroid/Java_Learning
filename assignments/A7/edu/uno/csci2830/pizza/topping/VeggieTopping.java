package edu.uno.csci2830.pizza.topping;

public class VeggieTopping extends PizzaTopping {
    @Override public String toString() { return "Veggie Topping"; }
    @Override public String toNiceString() { return "Veggie Topping (category)"; }
    @Override public double getPrice() { return 0.0; } // not used directly
}
