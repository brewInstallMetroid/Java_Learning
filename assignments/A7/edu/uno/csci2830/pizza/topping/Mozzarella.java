package edu.uno.csci2830.pizza.topping;

public class Mozzarella extends CheeseTopping {
    @Override public String toString() { return "Mozzarella"; }
    @Override public String toNiceString() { return "Mozzarella (cheese)"; }
    @Override public double getPrice() { return 1.00; }
}
