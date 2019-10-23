package class_examples;


import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatches {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int x = 0;

		do {
			try {
				System.out.println("Enter an integer: ");
				x = in.nextInt();
				break;
			}
			catch(InputMismatchException ex) {
				System.out.println("ERROR: Input incorrect data type");
				in.nextLine();
			}
		}while(true);
		
		
		System.out.println("x = " + x);
		
		System.out.println("END OF PROGRAM");




	}
}