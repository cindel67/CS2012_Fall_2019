package class_examples;

import java.util.Random;
import java.util.Scanner;

public class ArrayOfCircles {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many circles? ");
		int numCircles = in.nextInt();

		Circle[] circles = initCircleArray(numCircles);
			
		printCircles(circles);
	}
	
	public static Circle[] initCircleArray(int numCircles) {
		Circle[] circles = new Circle[numCircles];
		
		Random r = new Random();
			
		for (int i = 0 ; i < circles.length ; i++) {
			int radius = r.nextInt(101);
			
			circles[i] = new Circle(radius);			
		}
		return circles;
	}

	public static void printCircles(Circle[] circles) {
		Circle c1 = new Circle(10);
		c1.getRadius();
		
		circles[2].getRadius();
	
		for (int i = 0 ; i < circles.length ; i++) {
			System.out.println("Circle #" + (i+1) + ": " );
			System.out.println("\tRadius: " + circles[i].getRadius());
			System.out.println("\tArea: " + circles[i].getArea());
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
