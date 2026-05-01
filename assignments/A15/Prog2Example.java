//You'll add to the given download to add the burger part

// NOTE:: To compile: mvn clean compile
// NOTE:: To run: mvn javafx:run

// NOTE:: Cheese.java (COMPLETE?)
public enum Cheese {
	AMERICAN(0.75),
	SWISS(0.75),
	CHEDDAR(0.75),
	PEPPERJACK(0.75);

	private final double price;
	private Cheese(double price){
		this.price = price;
	}
	public double getPrice() {
		return price;
	}
}

// NOTE:: Burger.java general idea!
public class Burger extends AbstractMenuItem {
	private final Bun bun;
	private final List<Patty> patties;

	public Burger (Bun bun) {
	this.bun = bun;
	this.patties = new Arraylist<>();
	}
}
