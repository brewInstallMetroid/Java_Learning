package edu.uno.csci2030.pizza;
import java.util.*;

class MenuItem {
    private double price;
    public MenuItem(double price){ this.price = price; }
    public double getPrice(){ return price; }
}

class MenuItemPriceComparator implements Comparator<MenuItem> {
    public int compare(MenuItem a, MenuItem b){
        return Double.compare(a.getPrice(), b.getPrice());
    }
}

class BrokenMenuItemPriceComparator implements Comparator<MenuItem> {
    public int compare(MenuItem a, MenuItem b){
        return Double.compare(b.getPrice(), a.getPrice());
    }
}
