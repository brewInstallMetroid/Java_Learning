package edu.uno.csci2830;

import java.util.Scanner;
import java.util.List;

public class PizzaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// prompt for crust ingredient first
		System.out.println("Please enter an ingredient for your crust.");
		System.out.println("Crust ingredient (e.g., flour, cauliflower):");
		String ingredient = sc.nextLine().trim();

		System.out.println("What kind of crust would you like:");
		System.out.println("1 - Thin crust ($5.00)");
		System.out.println("2 - Thick crust ($6.00)");
		int crustChoice = Integer.parseInt(sc.nextLine().trim());

		boolean deepDish = false;
		if (crustChoice == 2) {
			// prompt for deepDish
			System.out.println("Deep dish? (true/false):");
			deepDish = Boolean.parseBoolean(sc.nextLine().trim());
		}

		System.out.println("What kind of sauce would you like:");
		System.out.println("1 - Tomato sauce ($1.00)");
		System.out.println("2 - Alfredo sauce ($1.50)");
		int sauceChoice = Integer.parseInt(sc.nextLine().trim());

		PizzaCrust crust = (crustChoice == 2)
				? new ThickCrust(ingredient, deepDish)
				: new ThinCrust(ingredient);

		PizzaSauce sauce = (sauceChoice == 2)
				? new AlfredoSauce()
				: new TomatoSauce();

		Pizza pizza = new Pizza(crust, sauce);

		/*
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
		*/

		System.out.println("Choose toppings by number:");
		System.out.println("1 - Sausage ($1.25)");
		System.out.println("2 - Pepperoni ($1.25)");
		System.out.println("3 - Bacon ($1.50)");
		System.out.println("4 - Ham");
		System.out.println("5 - Olives ($0.75)");
		System.out.println("6 - Onions");
		System.out.println("7 - Green Peppers");
		System.out.println("8 - Mushrooms");
		System.out.println("9 - Mozzarella ($1.00)");
		System.out.println("10 - Parmesan");
		System.out.println("11 - Cheddar");
		System.out.println("12 - Provolone");

		//build Pizza object

		int i = 0;
		while (i < 4) {
			int choice = Integer.parseInt(sc.nextLine().trim());
			PizzaTopping t = switch (choice) {
				case 1 -> new Sausage();
				case 2 -> new Pepperoni();
				case 3 -> new Bacon();
				case 4 -> new Ham();
				case 5 -> new Olives();
				case 6 -> new Onions();
				case 7 -> new GreenPeppers();
				case 8 -> new Mushrooms();
				case 9 -> new Mozzarella();
				case 10 -> new Parmesan();
				case 11 -> new Cheddar();
				case 12 -> new Provolone();
				default -> new Sausage();
			};
			pizza.addTopping(t);
			i++;
		}

        //reuse your Exercise 4 menu to assemble a pizza.
        // When displaying components, also display each component’s price,
        // then print TOTAL using pizza.getPrice().

		System.out.println("Crust: " + pizza.getCrust().toNiceString());
		System.out.println("Sauce: " + pizza.getSauce().toNiceString());
		System.out.println("Toppings:");
		for (PizzaTopping t : pizza.getToppings()) {
			System.out.println("- " + t.toNiceString());
		}

		System.out.println("Total Cost of your Pizza: " + pizza.getPrice());

		sc.close();
	}
}
