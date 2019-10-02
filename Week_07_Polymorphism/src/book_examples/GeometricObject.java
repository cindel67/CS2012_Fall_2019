package book_examples;


public class GeometricObject {
	private String color = "white";
	protected boolean filled;
	protected java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/** Construct a geometric object with color and filled value */
	protected GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/** Return filled. Since filled is boolean,
	 *  the get method is named isFilled */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}


	//geo1.equals(geo2)
	//geo1.equals(new Cat())
	@Override
	public boolean equals(Object o) {
		if ( !(o instanceof GeometricObject) ) {
			return false;
		}
		
		GeometricObject rhs = (GeometricObject)o;
		
		boolean isColorEqual = this.color.equalsIgnoreCase(rhs.color);
		boolean isFilledEqual = this.filled == rhs.filled;
		
		return isColorEqual && isFilledEqual;
	}





	//	@Override
	//	public String toString() {
	//		return "created on " + dateCreated + "\ncolor: " + color +
	//				" and filled: " + filled;
	//	}














	//	@Override
	//	public boolean equals(Object rhs) {
	//		if ( !(rhs instanceof GeometricObject) ) {
	//			return false;
	//		}
	//
	//		GeometricObject temp = (GeometricObject)rhs;
	//		boolean isColorEqual = this.color.equals(temp.color);
	//		boolean isFilledEqual = (this.filled == temp.filled);
	//
	//		return (isColorEqual && isFilledEqual);
	//	}
}