package edu.uno.csci2830.pizza;

import edu.uno.csci2830.pizza.crust.PizzaCrust;
import edu.uno.csci2830.pizza.sauce.PizzaSauce;
import edu.uno.csci2830.pizza.topping.PizzaTopping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
============================================================
Required Tasks (Autograder Expectations)
============================================================

1) Create an interface:
   interface MenuItem { double getPrice(); }

2) Make these classes implement MenuItem:
   - Pizza
   - PizzaTopping
   - PizzaSauce
   - PizzaCrust

3) Prices (MUST match these exact values):
   ThinCrust:      5.00
   ThickCrust:     6.00
   TomatoSauce:    1.00
   AlfredoSauce:   1.50
   Sausage:        1.25
   Olives:         0.75
   Mozzarella:     1.00
   Pepperoni:      1.25
   Bacon:          1.50

4) In Pizza, create an ArrayList<MenuItem> that tracks components as the pizza is assembled.
   - Add crust and sauce into this list in the Pizza constructor.
   - Add each topping into this list when addTopping(...) succeeds.

5) In Pizza, compute the total pizza price by summing getPrice() over the MenuItem list.
   - Pizza must implement getPrice() and return the total.

6) When displaying pizza components in PizzaMain, also display each component’s price and the total.
   (Your exact prompt/formatting is NOT graded; the autograder checks behavior via methods.)
 */

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
