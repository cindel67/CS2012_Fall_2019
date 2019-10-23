package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;

public class RandomNumberFileOutput {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		randomGen(20);
		long end = System.currentTimeMillis();
		
		System.out.println("time: " + (end - start) + " ms");
	}
	
	public static void randomGen(int n) {
		File inFile = new File("input_files/rand_numbers.txt");
		
		try {
			PrintWriter pw = new PrintWriter(inFile);
			Random r = new Random();
			
			for (int i = 1  ; i <= n ; i++) {
				pw.println(r.nextInt(11));
			}
			pw.flush();
			pw.close();
		}
		catch (FileNotFoundException ex) {
			System.out.println("File Not Found");
		}
	}
}
