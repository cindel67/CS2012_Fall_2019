package class_examples;

import java.util.HashSet;
import java.util.Set;

public class ToStringMethodExample {
	
	public static void main(String[] args) {
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(2);
		mySet.add(2);
		
		double[] data = new double[] {10.8, 9.25, 6.77, 100.92};
		
		MyClassWithToString mc1 = 
				new MyClassWithToString();
		
		MyClassWithToString mc2 = 
				new MyClassWithToString(17, data, "red");
		
		System.out.println(mc1);
		mc1.setColor("brown");
		System.out.println();
		System.out.println(mc1);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
