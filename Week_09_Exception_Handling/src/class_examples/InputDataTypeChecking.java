package class_examples;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDataTypeChecking {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean continueInput = true;
		
		do {
			try {
				System.out.println("Enter an integer: ");
				int x = in.nextInt();
				
				System.out.println("x is: " + x);
				
				continueInput = false;
			}
			catch(InputMismatchException ex) {
				System.out.println("Incorrect input, try again.");
				in.nextLine();
			}
			
		}while(continueInput);
	
		
		
		System.out.println("END OF PROGRAM");
	}

}
