package edu.uno.csci2830;

public class TomatoSauce extends PizzaSauce {
    @Override public String toString() { return "Tomato Sauce"; }
    @Override public String toNiceString() { return "Tomato Sauce (classic)"; }
    @Override public double getPrice() { return 1.00; }
}
