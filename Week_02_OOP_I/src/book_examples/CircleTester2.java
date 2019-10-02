package book_examples;

import java.util.Scanner;

public class CircleTester2 {

	public static void main(String[] args) {
		
	}
	
	public static Circle[] initCircleArray(int numCircles) {
		Circle[] x = new Circle[numCircles];
		
		for (int c = 0 ; c < x.length ; c++) {
			double radius = Math.random() * 101;
			x[c] = new Circle(radius);	
		}
		
		return x;
		
	}
	
	public static void printCircles(Circle[] circles) {
		
		for (int c = 0 ; c < circles.length ; c++) {
			System.out.println("Circle " + (c+1) + 
					": radius = " + circles[c].getRadius() + 
					" area = " +circles[c].getArea());
		}
		
		
	}
	
	
	
	

	
	
	
	
	
	
}
