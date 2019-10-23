package class_examples;


import java.util.Scanner;

public class ListExceptionExcamples {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

		while(true) {
			System.out.println("Enter start and end: ");
			int start = in.nextInt();
			int end = in.nextInt();

			try {
				for (int i = start ; i <= end ; i++) {
					System.out.println(arr[i]);
				}
				
				break;
			}
			catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("ERROR: start or end was out of bounds.");
			}
		}



	}

}
