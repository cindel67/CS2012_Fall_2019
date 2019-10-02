package class_examples;

public class MyClassTester {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.getSupervisor().getSupervisor();
		
		String s = "hello";
		
		char result = s.concat(" world ")
				.concat(" java ").charAt(0);
		
		System.out.println(result);

	}

}
