package book_examples;

public class Triangle extends GeometricObject {
	private double side1, side2, side3;
	
	public Triangle() {
		
	}
	
	public Triangle(double side1, 
			double side2, double side3) {
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	public Triangle(String color, boolean filled, 
			double side1, double side2, double side3) {
		super(color, filled);
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
	
	

}
