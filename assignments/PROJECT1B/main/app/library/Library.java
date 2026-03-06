package main.app.library;

import java.util.ArrayList;
import main.app.library.Book;

public class Library {
	private static ArrayList<Book> libraryCatalogue = new ArrayList<>();
	
	public static void addBook(Book book) {
		libraryCatalogue.add(book);
	}

	public ArrayList<Book> getCatalogue() { return libraryCatalogue; }

}
