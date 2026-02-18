package edu.uno.csci2830;

public class Bacon extends MeatTopping {
    @Override public String toString() { return "Bacon"; }
    @Override public String toNiceString() { return "Bacon (meat)"; }
    @Override public double getPrice() { return 1.50; }
}
