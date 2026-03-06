package edu.uno.csci2830.pizza.crust;
import edu.uno.csci2830.pizza.MenuItem;

public abstract class PizzaCrust implements MenuItem {
    private final String ingredient;

    public PizzaCrust(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    public abstract String toString();

    public abstract String toNiceString();
}
