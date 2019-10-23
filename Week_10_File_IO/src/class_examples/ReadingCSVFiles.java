package class_examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadingCSVFiles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the file path: ");
		
		String path = in.nextLine();
		
		File inFile = new File(path);
		System.out.println(inFile.exists());
	
		ArrayList<Rectangle> rectangles = readData(inFile);
		
		for(Rectangle r : rectangles) {
			System.out.println(r);
		}
	}
	
	public static ArrayList<Rectangle> readData(File inFile) {
		ArrayList<Rectangle> rectangles = new ArrayList<>();
		
		try {
			Scanner reader = new Scanner(inFile);
			
			while(reader.hasNextLine()) {
				
				String nextLine = reader.nextLine();
				//blue,23.7,45.2
				
				String[] tokens = nextLine.split(",");
				//tokens[0] = "blue";
				//tokens[1] = "23.7";
				//tokens[2] = "45.2";
				
				String color = tokens[0];
				double width = Double.parseDouble(tokens[1]);
				double height = Double.parseDouble(tokens[2]);
				
				Rectangle r = new Rectangle(color, width , height);
				
				rectangles.add(r);
		
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return rectangles;	
	}

	
	
	
	
	
	
	
	
	
	
}
