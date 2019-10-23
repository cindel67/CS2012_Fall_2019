package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriting {

	public static void main(String[] args) {
		File inFile = new File("input_files/numbers.txt");
		
		PrintWriter pw = null;
		
		try {
			pw = new PrintWriter(inFile);
			
			pw.println(7);
			pw.println(45);
			pw.println(102);
			pw.println(63);
			pw.println(90);
			
			pw.flush();
			
			
		}
		catch(FileNotFoundException ex) {
			System.out.println("FILE NOT FOUND");
		}

		
		pw.close();
		
	}
}