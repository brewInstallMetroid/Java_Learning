package edu.uno.csci2830.pizza.crust;

public class ThickCrust extends PizzaCrust {
    private final boolean deepDish;

    public ThickCrust(String ingredient, boolean deepDish) {
        super(ingredient);
        this.deepDish = deepDish;
    }

    public boolean isDeepDish() { return deepDish; }

    @Override public String toString() { return "Thick Crust"; }

    @Override public String toNiceString() {
        return "Thick Crust (ingredient: " + getIngredient() + ", deep dish: " + deepDish + ")";
    }

    @Override public double getPrice() { return 6.00; }
}
