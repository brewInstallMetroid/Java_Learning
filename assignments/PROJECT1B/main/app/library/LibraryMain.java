package main.app.library;

import main.app.library.Library;
import main.app.library.Book;
// TODO:: Add FileUtils class, replace file statements with method calls.
//import main.app.library.FileUtils;
import main.app.library.MenuUtils;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class LibraryMain {

	public static void main(String[] args) throws Exception {
		MenuUtils.printMenus(2);
		do {
			String fileDesc = "main/app/library/LibraryStorage.txt";
			Scanner sc = new Scanner(System.in);
			MenuUtils.printMenus(1);

			if (!sc.hasNextInt()) {
				System.out.println("\nInvalid Input Provided... (Needed Whole Number) Exiting.\n");
				MenuUtils.printMenus(3);
				System.exit(0);
			}
			int choice = sc.nextInt();

			String choiceString;
			sc.nextLine();

			switch (choice) {
				case 1:
					choice = 1;
					choiceString = "You Chose: Store Book(s)";
					break;
				case 2:
					choice = 2;
					choiceString = "You Chose: List Book(s)";
					break;
				case 3:
					choice = 3;
					choiceString = "You Chose: Wipe Catalogue";
					break;
				case 4:
					choice = 4;
					choiceString = "You Chose: EXIT";
					break;
				default:
					choice = 4;
					choiceString = "INVALID CHOICE - EXITING...";
					break;
			}

			System.out.println(choiceString);

			if (choice == 1) {
				System.out.println("\nEnter Book Title Below::");
				String tempTitle = sc.nextLine();

				System.out.println("\nEnter Book Author Below::");
				String tempAuthor = sc.nextLine();

				System.out.println("\nEnter Book Rating (/10) Below::");

				if (!sc.hasNextInt()) {
					System.out.println("\nInvalid Input Provided... (Needed Whole Number) Exiting.\n");
					MenuUtils.printMenus(3);
					System.exit(0);
				}
				int tempRating = sc.nextInt();
				sc.nextLine();

				if (tempRating <= 10 && tempRating >= 1) {
					Book book = new Book(tempTitle, tempAuthor, tempRating);
					Library.addBook(book);
					System.out.println("\nYou entered:\t" + book.getTitle() +
									   ",\nWritten by:\t" + book.getAuthor() +
									   ",\nWith rating:\t" + book.getRating() + "\\10\n"
									   );
					System.out.println("Write to Catalogue? (1: YES, 2: NO)::");

					if (!sc.hasNextInt()) {
						System.out.println("\nInvalid Input Provided... (Needed Whole Number) Exiting.\n");
						MenuUtils.printMenus(3);
						System.exit(0);
					}
					int submitChoice = sc.nextInt();

					sc.nextLine();
					if (submitChoice == 1) {
						File storage = new File(fileDesc);
						FileWriter wr = new FileWriter(storage, true);
						wr.write(book.getTitle() + " | " + book.getAuthor() + " | " + book.getRating() + "\n");
						wr.close();
					}
					System.out.println("\n");
				} else {
					System.out.println("\nCannot store given rating: " + tempRating + "\nRating not in range (1 - 10)\n");
				}

			} else if (choice == 2) {
				File storage = new File(fileDesc);
				Scanner scFile = new Scanner(storage);
				System.out.println("\nFull Current Catalogue:");
				while (scFile.hasNextLine()) {
					String line = scFile.nextLine();
					System.out.printf("%s\n", line);
				}
				System.out.println("\n");
				scFile.close();
				
			} else if (choice == 3) {
				System.out.println("\nYou are about to wipe the WHOLE catalogue... Are you sure? (1: YES, 2: NO)::");

				if (!sc.hasNextInt()) {
					System.out.println("\nInvalid Input Provided... (Needed Whole Number) Exiting.\n");
					MenuUtils.printMenus(3);
					System.exit(0);
				}
				int wipeChoice = sc.nextInt();

				sc.nextLine();
				if (wipeChoice == 1) {
					File wipeFile = new File(fileDesc);
					FileWriter wipeWriter = new FileWriter(wipeFile, false);
					wipeWriter.close();
					System.out.println("\nCatalogue Wiped!\n");
				}

			} else {
				MenuUtils.printMenus(3);
				System.exit(0);
			} // Main if...else if... else termination
			
		} while (true); // Main do...while loop termination
	}
}
