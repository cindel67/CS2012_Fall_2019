package class_examples;


public class UncheckedCustomException extends RuntimeException {
	

	public UncheckedCustomException(String msg) {
		super(msg);
	}
	
	//Exception Chaining
	public UncheckedCustomException(String msg, UncheckedCustomException ex) {
		super(msg, ex);
	}
	

}
