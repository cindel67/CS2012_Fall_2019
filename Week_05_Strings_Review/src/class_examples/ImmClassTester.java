package class_examples;

public class ImmClassTester {
	public static void main(String[] args) {
		ImmutableClass im1 = new ImmutableClass(10, 
				"hello", new char[] {'a', 'b', 'c'});
		
		ImmutableClass im2 = im1;
		
		im2 = im2.addToX(10);
		
		System.out.println(im1.getX());
		System.out.println(im2.getX());
	}
}
