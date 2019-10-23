package class_examples;


public class CustomExceptions {

	public static void main(String[] args) {
		try {
			unchecked();
		}
		catch(UncheckedCustomException ex) {
			
		}
		try {
			checked();
		}
		catch(CheckedCustomException ex) {
			
		}
		
		System.out.println("END OF PROGRAM");
	}
	
	public static void unchecked() {
		throw new UncheckedCustomException("unchecked");
	}
	
	public static void checked() throws CheckedCustomException  {
		throw new CheckedCustomException("checked");
	}

}
