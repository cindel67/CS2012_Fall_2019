package book_examples;


import java.util.ArrayList;
import java.util.Scanner;

public class QuotientWithException { 

	public static int quotient(int number1, int number2) throws ArithmeticException {
		if (number2 == 0) {
			//ArithmeticException ex = new ArithmeticException("Divisor cannot be zero"); 
			throw new ArithmeticException("Divisor cannot be zero.");
		}
	
		System.out.println("Line 15");
		return number1 / number2;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter two integers
		System.out.print("Enter two integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();

		int result;

		try {
			result = quotient(number1, number2);
			System.out.println(number1 + " / " + number2 + " is " 
					+ result);
			
		}
		catch (ArithmeticException ex) {
			System.out.println(ex.getMessage());
			
//			System.out.println("Exception: an integer " +
//					"cannot be divided by zero ");
		}
		

		System.out.println("Execution continues ...");
	}
}
