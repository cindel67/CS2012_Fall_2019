package class_examples;

import java.util.ArrayList;

import book_examples.Circle;
import book_examples.GeometricObject;
import book_examples.Rectangle;

public class PolymorphismExamples {
	public static void main(String[] args) {
		GeometricObject geo1 = new Circle(10.8);
		GeometricObject geo2 = new Rectangle(10, 3);
		
		Circle c1 = new Circle(56.3);
		
		GeometricObject[] shapeArr = new GeometricObject[2];
		shapeArr[0] = new Circle(49.3);
		shapeArr[1] = new Rectangle(54, 23);
		
		ArrayList<GeometricObject> shapes = new ArrayList<>();
		
		shapes.add(new Circle(28.536));
		shapes.add(new Rectangle(5, 3));
		
		for (int i = 0 ; i < shapes.size() ; i++) {
			System.out.println(shapes.get(i).getColor());
		}
		
		
		
		printShapeColors(geo1);
		printShapeColors(c1);
	}
	
	public static void printShapeColors(GeometricObject geo) {
		System.out.println(geo.getColor());
	}
	
	
	
}
