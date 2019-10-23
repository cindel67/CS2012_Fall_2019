package class_examples;


public class ExceptionObjectProcessing {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch(RuntimeException ex) {
			System.out.println(ex.getMessage());
			System.out.println();
			
			StackTraceElement[] stack = ex.getStackTrace();
			
			for (int i = 0 ; i < stack.length ; i++) {
				System.out.print(stack[i].getLineNumber() + ":\t");
				System.out.println(stack[i].getMethodName());
			}
			
		}
	}

	public static void method1() {
		method2();
	}

	public static void method2() {
		method3();
	}

	public static void method3() {
		throw new RuntimeException("ERROR: Something went wrong.");
	}

}
