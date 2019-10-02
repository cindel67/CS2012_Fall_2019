package class_examples;

import java.util.Random;

import sun.font.CreatedFontTracker;

public class StringExamples {
	public static void main(String[] args) {

		String s1 = "hello world";
		
		String s2 = "abcdabdcbab";
		
		String s3 = "java,python,c++,hello world,c#";
		
		//String.format(format, args);
		//System.out.printf(format, args);
		
		double result = Math.PI;

		
		Random r = new Random();
		
		double x = 42.179476545;
		
		for (int i = 1 ; i <= 50 ; i++) {
			int randInt = r.nextInt(Integer.MAX_VALUE);
			
			char[] randArr = randomCharArray(r.nextInt(50) + 1);
			String randString = new String(randArr);
			
			//System.out.println(randInt + " " + randString + " " + x);
			String result2 = String.format("%-15d%-55s%-1.4f\n", randInt, randString, x);
			System.out.print(result2);
		}
		
		
		
		
		//integer:				%d
		//float/double:			%f
		//boolean:				%b
		//String:				%s
		//character:			%c
		//scientific:			%e
		
		
		
	}
	
	
	
	public static char[] randomCharArray(int x) {
		char[] result = new char[x];
		
		Random r = new Random();
		
		char max = 'z' + 1;
		char min = 'a';
		
		for (int i = 0 ; i < result.length ; i++) {
			result[i] = (char)(r.nextInt(max - min) + min);
		}
		return result;
	}
}