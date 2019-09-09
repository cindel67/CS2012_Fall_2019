package class_examples;

import java.util.ArrayList;

public class WrapperClasses {
	public static void main(String[] args) {
		
		String stringInt = "43274";
		
		int x = Integer.parseInt(stringInt);
		
		//auto-boxing / auto-unboxing
		
		Integer a = 50;
		
		myMethod1(a);
		
		int b = 20;
		
		myMethod2(b);
		
	}
	
	public static void myMethod1(int x) {
		
	}
	
	public static void myMethod2(Integer x) {
		
	}
}
