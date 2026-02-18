package edu.uno.csci2830;

public abstract class PizzaTopping implements MenuItem {
    @Override
    public abstract String toString();

    public abstract String toNiceString();
}
