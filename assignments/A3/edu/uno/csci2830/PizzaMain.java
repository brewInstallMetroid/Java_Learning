package edu.uno.csci2830;

import java.util.Scanner;
import java.util.List;

public class PizzaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO: prompt user for crust choice
		System.out.println("Choose Crust by Number:");
		System.out.println("1 - Thick Crust");
		System.out.println("2 - Thin Crust");
		int crustChoice = Integer.parseInt(sc.nextLine().trim());

		// TODO: prompt user for sauce choice
		System.out.println("Choose Sauce by Number:");
		System.out.println("1 - Tomato Sauce");
		System.out.println("2 - Alfredo Sauce");
		int sauceChoice = Integer.parseInt(sc.nextLine().trim());

		PizzaCrust crust = (crustChoice == 2) ? new ThinCrust() : new ThickCrust();
		PizzaSauce sauce = (sauceChoice == 2) ? new AlfredoSauce() : new TomatoSauce();

		Pizza pizza = new Pizza(crust, sauce);

		// TODO: ask how many toppings (0–4)
		System.out.println("How Many Toppings do you want? (Choose from 0-4):");
		int toppingsNum = Integer.parseInt(sc.nextLine().trim());
		if (toppingsNum < 0)
			toppingsNum = 0;
		if (toppingsNum > 4)
			toppingsNum = 4;

		// TODO: prompt for each topping choice
		System.out.println("Choose toppings by number:");
		System.out.println("1 - Sausage");
		System.out.println("2 - Pepperoni");
		System.out.println("3 - Bacon");
		System.out.println("4 - Ham");
		System.out.println("5 - Olives");
		System.out.println("6 - Onions");
		System.out.println("7 - Green Peppers");
		System.out.println("8 - Mushrooms");
		System.out.println("9 - Mozzerella");
		System.out.println("10 - Parmesan");
		System.out.println("11 - Cheddar");
		System.out.println("12 - Provolone");

		// TODO: build Pizza object
		int i = 0;
		while (i < toppingsNum) {
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
				default -> new PizzaTopping();
			};
			pizza.addTopping(t);
			i++;
		}

		// TODO: print crust, sauce, toppings using toString()
		System.out.println(pizza.getCrust().toString());
		System.out.println(pizza.getSauce().toString());

		List<PizzaTopping> toppings = pizza.getToppings();
		for (PizzaTopping t : toppings) {
			System.out.println(t.toString());
		}

		sc.close();
	}
}
