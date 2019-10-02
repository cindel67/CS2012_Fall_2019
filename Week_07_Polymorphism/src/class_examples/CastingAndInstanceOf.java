package class_examples;

import java.util.ArrayList;

import book_examples.Circle;
import book_examples.GeometricObject;
import book_examples.Rectangle;

public class CastingAndInstanceOf {
	public static void main(String[] args) {
		ArrayList<GeometricObject> shapes = new ArrayList<>();
	
		Circle c1 = new Circle(28.536);

		shapes.add(c1);
		shapes.add(new Rectangle(5, 3));
		shapes.add(new Circle(98.34));
		shapes.add(new Rectangle(10, 23));

		printArea(shapes);
	}

	public static void printArea(ArrayList<GeometricObject> list) {
		for (int i = 0 ; i < list.size(); i++) {
			GeometricObject geo = list.get(i);

			if (geo instanceof Circle) {
				Circle c1 = (Circle)geo;
				System.out.println("Radius: " + c1.getRadius());
				System.out.println("Area: " + c1.getArea());
			}
			else if (geo instanceof Rectangle) {
				Rectangle r1 = (Rectangle)geo;
				System.out.println("Height: " + r1.getHeight());
				System.out.println("Width: " + r1.getWidth());
				System.out.println("Area: " + r1.getArea());
			}
			System.out.println();


		}
	}












}
