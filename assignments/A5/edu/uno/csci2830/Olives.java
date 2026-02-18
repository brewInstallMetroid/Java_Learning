package edu.uno.csci2830;

public class Olives extends VeggieTopping {
    @Override public String toString() { return "Olives"; }
    @Override public String toNiceString() { return "Olives (veggie)"; }
    @Override public double getPrice() { return 0.75; }
}
