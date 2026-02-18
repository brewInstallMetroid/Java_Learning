package edu.uno.csci2830.pizza.sauce;

public class AlfredoSauce extends PizzaSauce {
    @Override public String toString() { return "Alfredo Sauce"; }
    @Override public String toNiceString() { return "Alfredo Sauce (creamy)"; }
    @Override public double getPrice() { return 1.50; }
}
