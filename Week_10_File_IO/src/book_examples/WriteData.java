package book_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteData {
  public static void main(String[] args) {
    File file = new File("student_output.txt");
    
//    if (file.exists()) {
//      System.out.println("File already exists");
//      System.exit(0);
//    }

    // Create a file
    PrintWriter output = null;
	try {
		output = new PrintWriter(file);
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}

    // Write formatted output to the file
    output.print("John T Smith ");
    output.println(90);
    output.print("Eric K Jones ");
    output.println(85);
    
    output.close();
    
    

   
  }
}
