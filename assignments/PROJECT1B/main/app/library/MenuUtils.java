package main.app.library;

public class MenuUtils {

	public static void printMenus(int menuChoice){
			switch (menuChoice) {
				case 1:
					System.out.println("Please Choose an Option from the following...");
					System.out.println("1. Store Book(s)");
					System.out.println("2. List Book(s)");
					System.out.println("3. Wipe Catalogue");
					System.out.println("4. EXIT\n");
					System.out.println("Enter Option Below::");
					break;
				case 2:
					System.out.println("\n\n--------------------------------------");
					System.out.println("Welcome to my Library CLI Program!\n");
					break;
				case 3:
					System.out.println("\nExiting Program!");
					System.out.println("--------------------------------------\n\n");
					break;
				default:
					System.out.println("\nIMPROPER MENU ITEM GIVEN!\nExiting...\n");
					System.exit(0);
			}

			// NOTE:: below is unused old menu code
			//
			/*if (menuChoice == 1) {
				System.out.println("Please Choose an Option from the following...");
				System.out.println("1. Store Book(s)");
				System.out.println("2. List Book(s)");
				System.out.println("3. EXIT\n");
				System.out.println("Enter Option Below::");
			} else if (menuChoice == 2) {
				System.out.println("\n\n--------------------------------------");
				System.out.println("Welcome to my Library CLI Program!\n");
			} else if (menuChoice == 3) {
				System.out.println("\nExiting Program!");
				System.out.println("--------------------------------------\n\n");
			} else {
				System.out.println("\nIMPROPER MENU ITEM GIVEN!\nExiting...\n");
				System.exit(0);
			}*/
		}

}
