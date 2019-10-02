package book_examples;


public class Circle extends GeometricObject {
	private double radius;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color, boolean isFilled) {
		super(color, isFilled);
		this.radius = radius;
	}

	/** Return radius */
	public double getRadius() {
		return this.radius;
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
	public boolean equals(Object o) {
		if (!(o instanceof Circle) ) {
			return false;
		}
		
		Circle rhs = (Circle)o;
		
		boolean parentFieldsEqual = super.equals(o);
		boolean isRadiusEqual = this.radius == rhs.radius;
		
		return (parentFieldsEqual && isRadiusEqual);
	}
	
	
	/* Print the circle info */
//	@Override
//	public String toString() {
//		String s = "";
//
//		s += super.toString() + "\n";
//		s += "radius: " + this.radius;
//
//		return s;
//	}
}