package class_examples;


//extends RuntimeException for unchecked exceptions.
//extends Exception for checked exceptions.
public class RadiusCannotBeNegativeException extends Exception {
	
	public RadiusCannotBeNegativeException(String msg) {
		super(msg);
	}
}
