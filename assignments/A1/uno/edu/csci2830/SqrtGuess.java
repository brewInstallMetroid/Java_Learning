/*
REFERENCE CODE from slides and assignment::
def main():
	epsilon = 0.00001
	x = float(input('Enter a number and I will guess its square root: '))
	guess = 1.0
	while abs(guess * guess - x) > epsilon:
		guess = (guess + x/guess)/2	
	print('I guess the square root of', x , 'is', guess)
main()

public class TempConv {
	public static void main(String[] args) {
		Double fahr;
		Double cel;
		Scanner in;

		in = new Scanner(System.in);
		System.out.println("Enter the temperature in F: ");
		fahr = in.nextDouble();

		cel = (fahr - 32) * 5.0/9.0;
		System.out.println("The temperature in C is: " + cel);
	}
}
*/

package edu.uno.csci2830;

import java.util.Scanner;

public class SqrtGuess {
	public static void main(String[] args) {
		Double epsilon = 0.00001;
		Double userInput;
		Double guess;
		Scanner input;

		input = new Scanner(System.in);
		System.out.print("Enter a number and I will guess its square root: ");
		userInput = input.nextDouble();

		guess = 1.0;

		// testprint
		// System.out.println(Math.abs(guess * guess - userInput));

		while (Math.abs(guess * guess - userInput) > epsilon) {
			guess = (guess + userInput / guess) / 2;
		}
		System.out.println("I guess the square root of " + userInput + " is " + guess);

		// testprints
		// System.out.println("guess: " + guess);
		// System.out.println("user input: " + userInput);

		scanner.close();
	}
}
