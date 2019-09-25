package book_examples;

public class Circle extends GeometricObject {
	
	private double radius;

	public Circle() {
		super();
		this.radius = 1.0;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public Circle(String color, boolean isFilled,
			double radius) {
		
		super(color, isFilled);
		
		this.radius = radius;
	}

	/** Return radius */
	public double getRadius() {
		return radius;
	}

	/** Set a new radius */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/** Return area */
	public double getArea() {
		return radius * radius * Math.PI;
	}

	/** Return diameter */
	public double getDiameter() {
		return 2 * radius;
	}

	/** Return perimeter */
	public double getPerimeter() {
		return 2 * radius * Math.PI;
	}
	
	@Override
	public String toString() {
		String result = super.toString() + "\n" + 
				"radius:\t" + this.radius;
		
		return result;
	}

	
	
	
	
	
	
	
	
	
}