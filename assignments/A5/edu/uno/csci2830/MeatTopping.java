package edu.uno.csci2830;

public class MeatTopping extends PizzaTopping {
    @Override public String toString() { return "Meat Topping"; }
    @Override public String toNiceString() { return "Meat Topping (category)"; }
    @Override public double getPrice() { return 0.0; } // not used directly
}
