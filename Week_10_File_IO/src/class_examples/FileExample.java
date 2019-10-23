package class_examples;

import java.io.File;

public class FileExample {

	public static void main(String[] args) {
		
		//DON'T USE THIS EVER!!!
		String absolutePath = "C:\\Users\\Keenan\\Dropbox\\Courses\\CS2012_Programming_II\\CS2012_Fall_2019_Examples\\Week_10_File_IO\\input.txt";

		String relPath = "input_files/input.txt";
		
		
	
		File inFile = new File("input_files/input.txt");
		
		System.out.println("exists: " + inFile.exists());
		System.out.println("directory?: " + inFile.isDirectory());
		System.out.println("length: " + inFile.length());
		
		
	}

}
