package class_examples;

public class FanTester {
	public static void main(String[] args) {
		Fan fan1 = new Fan();
		Fan fan2 = new Fan(10, true, 70, true, "green");
	
		System.out.println(fan2.getSpeed());
		
		fan2.setSpeed(34);
		
		System.out.println(fan2.getSpeed());
		
		fan1.addSpeed(fan2);

	}
}
