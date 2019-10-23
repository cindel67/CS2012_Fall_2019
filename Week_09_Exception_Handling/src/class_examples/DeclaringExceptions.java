package class_examples;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.sun.media.sound.InvalidDataException;

public class DeclaringExceptions  {
	public static void main(String[] args) {

		try {
			readData1();
		}
		catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			
			StackTraceElement[] stack = ex.getStackTrace();
			
			for (int i = 0 ; i < stack.length ; i++) {
				System.out.println(stack[i]);
			}
		}
		










		
	}
	public static void readData1() 
			throws FileNotFoundException {
		readData2();
	}
	
	
	public static void readData2() 
			throws FileNotFoundException {
		readData3();
	}

	public static ArrayList<Integer> readData3() 
			throws FileNotFoundException {
		ArrayList<Integer> list = new ArrayList<>();
		File inFile = new File("something.txt");
		
		if(!inFile.exists()) {
			throw new FileNotFoundException("Something.txt was not found");
		}
			
		
		return list;	
	}


}

