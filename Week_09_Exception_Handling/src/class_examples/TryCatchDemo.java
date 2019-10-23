package class_examples;


public class TryCatchDemo {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		
		try {
			int x = arr[10];
			System.out.println(x);
		}
		catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println("Index out of bounds.");
		}
		
		System.out.println("END OF PROGRAM");
	}
}
