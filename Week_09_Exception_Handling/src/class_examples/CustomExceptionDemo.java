package class_examples;


public class CustomExceptionDemo {

	public static void main(String[] args) {
		try {
			myMethod();
		} catch (RadiusCannotBeNegativeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void myMethod() throws RadiusCannotBeNegativeException {
		throw new RadiusCannotBeNegativeException("Radius cannot be negative");
	}

}
