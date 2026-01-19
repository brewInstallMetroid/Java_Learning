
/*
Notes for Class 2::
--Java is compiled to bytecode which can run on any JVM (Java Virtual Machine)
--Every object is a noun || every behavior (method) is a verb
--Java is statically typed - NO POINTERS
--Classes and functions can be: public, private, or protected
--You do allocate memory for arrays in Java
--array.add(element, index); is how you add to an array in Java

Primitive Types!!
1. byte		|| Byte
2. short	|| Short
3. int		|| Integer
4. long		|| Long
5. float	|| Float
6. double	|| Double
6. boolean	|| Boolean
7. char		|| Character

Java Class: HashMap<Object, String>; is a way to create key, value pairs in Java
*/
import java.util.Scanner;

public class TempConv { // Classes in Java are CamelCase
	public static void main(string[] args) {
		Double fahr; // Usually variables are lowerCaseFirstCamelCase
		Double cel;
		Scanner input; // Scanners are variables that are really object references ALMOST but NOT QUITE
						// a pointer!

		input = new Scanner(System.in); // System.in = input from stdin
		System.out.println("Enter the temperature in F: ");
		fahr = input.nextDouble();

		cel = (fahr - 32) * 5.0 / 9.0;
		System.out.println("The temperature in C is: " + cel);// System.in = output to stdout
	}
}
