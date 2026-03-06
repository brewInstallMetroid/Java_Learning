package edu.uno.csci2830.pizza.topping;

public class Pepperoni extends MeatTopping {
    @Override public String toString() { return "Pepperoni"; }
    @Override public String toNiceString() { return "Pepperoni (meat)"; }
    @Override public double getPrice() { return 1.25; }
}
