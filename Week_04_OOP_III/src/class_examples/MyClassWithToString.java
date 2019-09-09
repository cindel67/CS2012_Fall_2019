package class_examples;

public class MyClassWithToString {
	private int x;
	private double[] data;
	private String color;
	
	public MyClassWithToString() {
		this.x = 1;
		this.data = 
				new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		this.color = "blue";
	}
	
	public MyClassWithToString(int x, 
			double[] data, String color) {
		
		this.x = x;
		this.data = data;
		this.color = color;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public double[] getData() {
		return data;
	}

	public void setData(double[] data) {
		this.data = data;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String toString() {
		String result = "";
		
		result += "x:\t" + this.x + "\n";
		result += "data:\t";
		
		for (int i = 0 ; i < this.data.length ; i++) {
			result += this.data[i] + " ";
		}

		result += "\ncolor:\t" + this.color;

		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
