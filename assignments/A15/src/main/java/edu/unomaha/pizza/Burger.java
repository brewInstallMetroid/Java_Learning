package edu.unomaha.pizza;

import java.util.List;
import java.util.ArrayList;

public class Burger extends AbstractMenuItem {
	private final Bun bun;
	private final List<Patty> patties;
	private final List<Cheese> cheeses;
	private final List<Garnish> garnishes;

	public Burger (Bun bun) {
		this.bun = bun;
		this.patties = new ArrayList<>();
		this.garnishes = new ArrayList<>();
		this.cheeses = new ArrayList<>();
	}
	
	public String toNiceString() {
		return "Burger is: " + toString();
	}
	public String toString(Burger burger) {
		return bun + ", patties = " + patties + ", cheeses = " + ", garnishes = " + garnishes;
	}

	public Double getPrice() {
		Double total = 0.0;
		total += this.bun.getPrice();
		for (Patty patty : this.patties) {
			total += patty.getPrice();
		}
		for (Garnish garnish : this.garnishes) {
			total += garnish.getPrice();
		}
		for (Cheese cheese : this.cheeses) {
			total += cheese.getPrice();
		}
		return total;
	}

	public void addPatty(Patty p) {
		this.patties.add(p);
	}
	public void addGarnish(Garnish g) {
		this.garnishes.add(g);
	}
	public void addCheese(Cheese c) {
		this.cheeses.add(c);
	}
}
