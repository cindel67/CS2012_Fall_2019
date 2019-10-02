package class_examples;

public class ImmutableClass {
	private int x;
	private String s;
	private char[] arr;
	
	public ImmutableClass(int x, String s, char[] arr) {
		this.x = x;
		this.s = s;
		this.arr = arr;
	}

	public int getX() {
		return x;
	}

	public String getS() {
		return s;
	}
	
	//im2.addToX(10);
	
	public ImmutableClass addToX(int x) {
		char[] temp = new char[this.arr.length];
		
		System.arraycopy(this.arr, 0, temp, 0, this.arr.length);
		
		return new ImmutableClass(this.x + x, this.s, temp);
	}
}
