package class_examples;

import java.util.ArrayList;

import book_examples.Circle;
import book_examples.GeometricObject;
import book_examples.Rectangle;

public class PolymorphismExamples {
	public static void main(String[] args) {
		GeometricObject geo1 = new Circle(4.5);
		GeometricObject geo2 = new Rectangle(4, 5);
		
		GeometricObject[] shapeList1 = new GeometricObject[2];
		shapeList1[0] = new Circle();
		shapeList1[1] = new Rectangle();
		
		ArrayList<GeometricObject> shapeList2 = new ArrayList<>();
		
		shapeList2.add(new Circle());
		shapeList2.add(new Rectangle());
		
		myMethod(new Circle());
		myMethod(new Rectangle());
	}
	
	public static void printColors(ArrayList<GeometricObject> list) {
		for (int i = 0 ; i< list.size(); i++) {
			System.out.println(list.get(i).getColor());
		}
	}
	
	public static void printColors(GeometricObject[] list) {
		for (int i = 0 ; i< list.length; i++) {
			System.out.println(list[i].getColor());
		}
	}
	
	
	
	
	
	
	public static void myMethod(GeometricObject geo) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
