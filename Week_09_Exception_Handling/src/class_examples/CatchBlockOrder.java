package class_examples;

import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class CatchBlockOrder {

	public static void main(String[] args) {
		try {
			//Some code
		}
		catch(StringIndexOutOfBoundsException | InputMismatchException ex) {
			
		}
		
		
		
		
		
		try {
			//some code
		}
		catch(StringIndexOutOfBoundsException ex) {

		}
		catch(RuntimeException ex) {

		}
		catch(Exception ex) {

		}
		
		

	}

}
