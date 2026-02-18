package edu.uno.csci2830;

public class Sausage extends MeatTopping {
    @Override public String toString() { return "Sausage"; }
    @Override public String toNiceString() { return "Sausage (meat)"; }
    @Override public double getPrice() { return 1.25; }
}
