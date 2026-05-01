package edu.uno.csci2030.pizza;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;



public class PizzaTest {

	@Test
	public void testSorted(){
	  List<MenuItem> items = Arrays.asList(
	   new MenuItem(10), new MenuItem(5), new MenuItem(7)
	  );
	  items.sort(new MenuItemPriceComparator());

		  //verify sorted order using loop + assertTrue
		  MenuItemPriceComparator comp = new MenuItemPriceComparator();
		  for (int i = 0; i < items.size() - 1; i++) {
			assertTrue(comp.compare(items.get(i), items.get(i + 1)) <= 0);
		  }
	 }

	@Test
	public void testBroken(){
	  List<MenuItem> items = Arrays.asList(
	   new MenuItem(10), new MenuItem(5), new MenuItem(7)
	  );
	  items.sort(new BrokenMenuItemPriceComparator());

		  //write test that detects incorrect sorting
		  MenuItemPriceComparator comp = new MenuItemPriceComparator();
		  for (int i = 0; i < items.size() - 1; i++) {
			assertFalse(comp.compare(items.get(i), items.get(i + 1)) <= 0);
		  }
	 }
}
