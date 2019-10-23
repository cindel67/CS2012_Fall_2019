package book_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadData {
  public static void main(String[] args) {
    // Create a Scanner for the file
    Scanner input;
	try {
		input = new Scanner(new File("scores.txt"));
		
		// Read data from a file
	    while (input.hasNext()) {
	      String firstName = input.next();
	      String mi = input.next();
	      String lastName = input.next();
	      int score = input.nextInt();

	      System.out.println(
	        firstName + " " + mi + " " + lastName + " " + score);
	    }
		// Close the file
	    input.close();
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

    

    
  }
}
