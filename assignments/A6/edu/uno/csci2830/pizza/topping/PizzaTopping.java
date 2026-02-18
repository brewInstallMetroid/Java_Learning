package edu.uno.csci2830.pizza.topping;
import edu.uno.csci2830.pizza.MenuItem;

public abstract class PizzaTopping implements MenuItem {
    @Override
    public abstract String toString();

    public abstract String toNiceString();
}
