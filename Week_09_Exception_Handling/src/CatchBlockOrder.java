

public class CatchBlockOrder {

	public static void main(String[] args) {
		try {
			throw new StringIndexOutOfBoundsException();
		}
		catch(IndexOutOfBoundsException | FileNotFoundException | InputMismatchException ex) {
			
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
