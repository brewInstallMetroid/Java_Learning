package edu.uno.csci2830.pizza.sauce;
import edu.uno.csci2830.pizza.MenuItem;

public abstract class PizzaSauce implements MenuItem {
    @Override
    public abstract String toString();

    public abstract String toNiceString();
}
