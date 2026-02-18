
public class Notes3 {
	public static void main(String[] args) {
	}
}

public class PizzaTopping {
	public String toString() {
		return "Pizza Topping";

	}
}

public class MeatTopping extends PizzaTopping {
	@Override
	public String toString() {
		return "Meat Topping";
	}
}

public class PizzaMain {

	public static void main(String[] args) {
		MeatTopping topping = new MeatTopping();
		System.out.println(topping.toString());
	}

}

// NOTE:: Overloading: reuse a method name for another funcitonality within the
// same class (WITH DIFFERENT PARAMETERS)
// NOTE:: Overriding: replacing a superclass' method implementation

public abstract class PizzaTopping2 {
	public abstract String toString();

	public String toNiceString() {
		return "Pizza Topping: " + this.toString();
	}
}

// NOTE:: Class variables can be either public, private, or protected
// NOTE:: Inheritance does more than just override methods, it enhances
// functionality of a class by expanding it
// ex: use super.method(); or super.var() to retrieve the var or method from the
// class one degree of abstraction above the current class
