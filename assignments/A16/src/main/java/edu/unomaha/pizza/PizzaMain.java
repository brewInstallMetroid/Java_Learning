package edu.unomaha.pizza;

import edu.unomaha.pizza.crust.*;
import edu.unomaha.pizza.topping.*;
import edu.unomaha.pizza.sauce.*;


import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class PizzaMain {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();

        PizzaCrust crust = CrustFactory.getCrust("THIN");
        crust.setIngredient("Flour");
        pizza.setCrust(crust);
		
		PizzaSauce sauce = SauceFactory.getSauce("TOMATO");
		pizza.setSauce(sauce);

        PizzaTopping pepperoni = ToppingFactory.getTopping("PEPPERONI");
        pepperoni.setSpiciness(4);
        pizza.addTopping(pepperoni);
        pizza.addTopping(new MozzarellaTopping());

        pizza.displaySorted();

		List<MenuItem> order = new ArrayList<>();
		order.add(pizza);


        System.out.println("----");
        System.out.printf("%s $%.2f\n", pizza.toNiceString(), pizza.getPrice());

		Burger burger = new Burger(Bun.POPPYSEED);
		burger.addPatty(Patty.CHICKEN);
		burger.addPatty(Patty.BEEF);
		burger.addPatty(Patty.VEGGIE);
		burger.addGarnish(Garnish.KETCHUP);
		burger.addGarnish(Garnish.RELISH);
		burger.addGarnish(Garnish.TOMATO);
		burger.addCheese(Cheese.PEPPERJACK);
		burger.addCheese(Cheese.AMERICAN);
		burger.addCheese(Cheese.SWISS);

		order.add(burger);
		order.sort(Comparator.comparingDouble(MenuItem::getPrice));

		Double total = 0.0;
		System.out.println("Receipt::\n");
		for (MenuItem item : order) {
			System.out.printf("%s $%.2f\n", item.toNiceString(), item.getPrice());
			total += item.getPrice();
		}
		System.out.println(total);
		System.out.println("-----");
		System.out.printf("%s $%.2f\n", burger.toNiceString(), burger.getPrice());
	
    }
}
