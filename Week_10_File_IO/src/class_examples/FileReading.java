package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReading {

	public static void main(String[] args) {
		File inFile = new File("input_files/rand_numbers.txt");
		
		try {
			Scanner fReader = new Scanner(inFile);
			
			int sum = 0;
			
			while(fReader.hasNextInt()) {
				sum += fReader.nextInt();
			}
			
			fReader.close();
			
			System.out.println(sum);
			
			
		} catch (FileNotFoundException e) {
			
			System.out.println("FILE NOT FOUND.");
		}

	}

}
