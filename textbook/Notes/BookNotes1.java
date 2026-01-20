/* These are my notes for the first part of my textbook, Core Java
 * Many basic concepts should be covered here along with quirks I see/
 * encounter along the way.
 * */

// Lots of the syntax, with some small differences, is similar to C in Java (or C++ in the case of classes, inheritance, etc.
// Using Java, you can make applets: any Java program that runs inside a web browser
// Java is case sensitive throughout!  Pay attention to caps
//

public class BookNotes1 {
	// public is an ACCESS MODIFIER.
	// These control the level of access other parts of a program have to the code
	// within.
	// The class keyword is basically a reminder that the code inside of the {}
	// lives inside a class, as does all code in Java

	// static final variables are class constants
	// ALSO... since this is a public constant, other classes can use the variable.
	// This also means if the variable had been declared as private, other classes
	// would NOT be able to use it with different syntax:: BookNotes1.CCONSTANT
	public static final float CCONSTANT = 3.5f;

	public static void main() {
		// main is a method inside the BookNotes1 class.
		// you MUST have a main method in each project
		// the main method MUST be public

		Integer /* int */ one = 1;// Integers are 4 bytes, with variations short (2b), long (8b), and btye (1b)
		// each of these has its own limitations in terms of range
		Float /* float */ two = 2.0F;// Floats are 4 bytes, just like integers, with doubles (8b) allowing more
										// accuracy/digits
		// Floats need an "f" or "F" to not be cast to a double
		// There are 3 special float values to denote overflows/errors:
		// 1. Positive infinity
		// 2. Negative infinity
		// 3. NaN (Not a Number)
		// NOTE: the constants Double.POSITIVE_INFINITY, and its obviously named
		// brothers
		if (Double.isNaN(two)) {
			System.out.println(two + "Is NOT a Number!");
		} // this is a valid check, and will probably come in handylater.

		Character /* char */ three = "Three";// In Java, strings using '' are character constants with number values
												// associated with them
		// strings using "" on the other hand are conventional strings
		// it is best to treat chars as abstract data types

		Boolean /* boolean */ yes = true;// Booleans are just booleans, but 0 and 1 CANNOT be used in place of true or
											// false

		// to denote constants, you can use the keyword final in declaration:
		final int FOUR = 5;

		// strictfp can be placed in between static and void in a method to denote that
		// the method will only use strict floating-point computations
		// NOTE: the Math class contains::
		// Math.sqrt(x);
		// Math.pow(x, a);
		// Math.abs(<exp>);
		// Math.max(x, y);
		// Math.min(x, y);
		// Math.signum(x); RETURNS THE SIGN OF THE NUMBER
		// Math.floor(x);
		// Math.ceil(x);
		// Math.PI; //final pi
		// Math.E; //final e (2.aevrasef or whatever e is)
		// Most of these are obvious in their usage

		// To avoid the Math prefix, place:
		// import static java.lang.Math.*;
		// if predictable results are more important than performance::
		// import static java.lang.StrictMath.*;

		// consult LegalConversions.png for type conversions in Java

		// Casting is possible in java with the following syntax:
		// int nx = (int) x; so, it is the same as casting in C
		// casting to an int floors a float, it does not ceil or round it
		// if rounding is desired,
		// int nx = (int) Math.round(x); this may look strange, but the default type for
		// .round is a long, so we still need to cast the var to get an integer

		// java DOES support the ternary operator!
		// condition ? exp1 (T) : exp2 (F)

		enum Size {
			SMALL,
			MEDIUM,
			LARGE,
			EXTRA_LARGE
		}
		// enums are like structs... kinda. They hold a finite set of named values
		Size s = Size.MEDIUM;

		String e = "";
		String greeting = "Hello!";

		// You can slice strings in java!!! Just use .substring(start, end);
		String slice = greeting.substring(0, 3);
		System.out.println(slice); // prints "Hel"

		// Strings are IMMUTABLE in java!!! This SUCKS! But it's ok, we can do this
		// instead?
		greeting = greeting.substring(0, 3) + "p!";
		// so you can still reassign strings, you just can't swap out characters without
		// slicing like you can in Python

		// you can use .equals(); to check strings for equality!
		if (slice.equals(greeting))
			; // this will return false, the strings are NOT equal
		// to ignore case:
		if (slice.equalsIgnoreCase(greeting))
			;

		// find length of strings like JS with .length();
		int lenStr = greeting.length();

		// to test if a string is either null or empty::
		if (greeting != null && greeting.length() != 0)
			;

		// to build a string from a ton of small pieces (keystrokes?)
		StringBuilder builder = new StringBuilder();
		builder.append(greeting); // append to add a char or string to the builder
		String compGreeting = builder.toString(); // when done, just call toString() on the builder to retrieve the full
													// string

		// NOTE:: INPUT AND OUTPUT!
		// INPUT!
		/*
		 * to read from input, you need to construct a scanner:
		 * Scanner in = new Scanner(System.in);
		 * to grab a line from stdin::
		 * String name = in.nextLine();
		 * to grab just a word::
		 * String first = in.next();
		 *
		 * import java.util.*; if you need to use these!
		 *
		 * to read a string that is supposed to be secret:
		 * Console cons = System.console();
		 * String username = cons.readLine("Username: ");
		 * char[] username = cons.readPassword("Password: ");
		 *
		 */

		// OUTPUT!
		float printedFloat = 1.23456F;
		System.out.printf("%8.2f", printedFloat);
		// Just like C, baby!
		// printf("%width.accf", var);
		// see JavaFormatSecif for format specifiers
		// see FormatPrintf for output formatting Python-style

		// FILE IO!
		// Scanner in = new Scanner(Paths.get("myfile.txt"), "UTF-8");
		// ^^ to scan from a file
		// PrintWriter out = new PrintWriter("myfile.txt", "UTF-8");
		// ^^ to write to a file

		// FOR LOOPS!
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		} // NOTE:: i ONLY EXTENDS to this curly brace. You can reuse it

		// SWITCH STATEMENTS!
		int switchedInt = 3;
		switch (switchedInt) {
			case 1:
				System.out.printf("%1d is the value!", switchedInt);
				break;
			case 2:
				System.out.printf("%1d is the value!", switchedInt);
				break;
			case 3:
				System.out.printf("%1d is the value!", switchedInt);
				break;
			default:
				break;
		}

		// ARRAYS!
		// stores vars of the same type
		// int[] a = new int[100];
		int[] a = { 2, 3, 5, 6, 11 };
		// OR for variable length:
		int[] ab = new int[n];

		// arrays are initialized with the special value null, meaning they ahve no
		// values yet
		String[] names = new String[10];
		// ^^creates an array of 10 strings, NOT a 10 length string like C
		int arraylen = a.length;

		// The FOR EACH loop!!
		for (int element : a) {
			System.out.println(element);
		}

		// It seems that arrays in Java are really just pointers to an array,
		// just like C. That being said, if you do the following:
		int[] smallPrimes = { 2, 3, 5, 7, 11 };
		int[] luckyNumbers = smallPrimes;
		luckyNumbers[5] = 12;
		// BOTH smallPrimes[5] is 12 AND luckyNumbers[5];
		// If you really want to make a copy of another array, do this:
		int[] copiedLuckyNumbers = Arrays.copyOf(luckyNumbers, luckyNumbers.length);

		// Command Line Parameters
		// Every java program has a main method wiht a String[] args parameter. This
		// parameter indicates that the main method receives an array of strings,
		// namely, the arguments specified on the command line
		if (args.length == 0 || args[0].equals("-h"))
			System.out.print("Hello,");
		else if (args[0].equals("-g"))
			System.out.print("Goodbye,");
		// print the other command-line arguments
		for (int i = 1; i < args.length; i++)
			System.out.print(" " + args[i]);
		System.out.println("!");
		// ^^This program takes in command-line arguments and prints messages and echos
		// arguments back to the user

		// Sorting
		int[] as = new int[10000];
		Arrays.sort(as);
		// ^^this sorts the list using a tuned version of quick sort
		// Random
		int n = luckyNumbers.length;
		int r = (int) (Math.random() * n); // returns a random numberbetween 0 and n-1.
		System.out.println(luckyNumbers[r]);
		// ^^prints a random element from the given array

	}
}
