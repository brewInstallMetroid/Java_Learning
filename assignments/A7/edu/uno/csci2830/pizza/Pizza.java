package edu.uno.csci2830.pizza;

import edu.uno.csci2830.pizza.crust.PizzaCrust;
import edu.uno.csci2830.pizza.sauce.PizzaSauce;
import edu.uno.csci2830.pizza.topping.PizzaTopping;
import edu.uno.csci2830.pizza.MenuItemPriceComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pizza implements MenuItem {
    private final PizzaCrust crust;
    private final PizzaSauce sauce;
    private final ArrayList<PizzaTopping> toppings = new ArrayList<>();

    // REQUIRED: track all components as MenuItems
    private final ArrayList<MenuItem> items = new ArrayList<>();

    public Pizza(PizzaCrust crust, PizzaSauce sauce) {
        this.crust = crust;
        this.sauce = sauce;

        // REQUIRED: add crust + sauce into items
        items.add(crust);
        items.add(sauce);
    }

    public PizzaCrust getCrust() { return crust; }
    public PizzaSauce getSauce() { return sauce; }

    public List<PizzaTopping> getToppings() {
        return Collections.unmodifiableList(toppings);
    }

    // REQUIRED (autograder calls this)
    public List<MenuItem> getMenuItems() {
        return Collections.unmodifiableList(items);
    }

	public List<MenuItem> getMenuItemsSortedByPrice() {
		ArrayList<MenuItem> sortedMenuItemsCopy = new ArrayList<>(items);
		Collections.sort(sortedMenuItemsCopy, new MenuItemPriceComparator());

		return sortedMenuItemsCopy;
	}

    public boolean addTopping(PizzaTopping t) {
        if (t == null) return false;
        if (toppings.size() >= 4) return false;

        toppings.add(t);

        // REQUIRED: add topping into items
        items.add(t);

        return true;
    }

    // REQUIRED: sum the prices of all MenuItems
    @Override
    public double getPrice() {
        double total = 0.0;
        for (MenuItem mi : items) total += mi.getPrice();
        return total;
    }


}
