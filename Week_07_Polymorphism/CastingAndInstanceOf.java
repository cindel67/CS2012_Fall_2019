package class_examples;

import java.util.ArrayList;

import book_examples.Circle;
import book_examples.GeometricObject;
import book_examples.Rectangle;

public class CastingAndInstanceOf {
	public static void main(String[] args) {
		ArrayList<GeometricObject> shapes = new ArrayList<>();
		
		shapes.add(new Circle(28.536));
		shapes.add(new Rectangle(5, 3));
		shapes.add(new Circle(98.34));
		shapes.add(new Rectangle(10, 23));
		
		printArea(shapes);
	}
	
	public static void printArea(ArrayList<GeometricObject> shapes) {
		for (int i = 0 ; i < shapes.size() ; i++) {
			GeometricObject nextShape = shapes.get(i);
			
			if(nextShape instanceof Circle) {
				Circle c = (Circle)nextShape;
				
				System.out.println("Radius: " + c.getRadius());
				System.out.println(c.getArea());
			}
			else if (nextShape instanceof Rectangle) {
				Rectangle r = (Rectangle)nextShape;
				
				System.out.println("Width: " + r.getWidth());
				System.out.println("Height: " + r.getHeight());
				System.out.println(r.getArea());
			}
			
			System.out.println();
			
			
		}
	}
	
	
	
	
	
	
}
