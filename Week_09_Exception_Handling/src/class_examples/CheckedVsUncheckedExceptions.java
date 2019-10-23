package class_examples;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedVsUncheckedExceptions {

	public static void main(String[] args) {
		File inFile = new File("input.txt");
		
		try {
			Scanner in = new Scanner(inFile);
		}
		catch(FileNotFoundException ex) {
			
		}
	
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//		try {
//			System.out.print(arr[100]);
//		}
//		catch(ArrayIndexOutOfBoundsException ex) {
//			System.out.println("ERROR");
//		}
		
		System.out.println("PROGRAM CONTINUES...");
	}
}
