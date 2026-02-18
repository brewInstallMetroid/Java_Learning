package edu.uno.csci2830;

public class CheeseTopping extends PizzaTopping {
    @Override public String toString() { return "Cheese Topping"; }
    @Override public String toNiceString() { return "Cheese Topping (category)"; }
    @Override public double getPrice() { return 0.0; } // not used directly
}
