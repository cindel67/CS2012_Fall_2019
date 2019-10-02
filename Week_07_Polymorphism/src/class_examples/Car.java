package class_examples;

public class Car extends Vehicle {
	private int numDoors;
	
	public Car(long vehicleID, int speed, String color, 
			   int numDoors) {
		super(vehicleID, speed, color);
		
		this.numDoors = numDoors;
	}

	public int getNumDoors() {
		return numDoors;
	}

	public void setNumDoors(int numDoors) {
		this.numDoors = numDoors;
	}
	
	public void powerOnRadio() {
		System.out.println("The radio is now on.");
	}
	
	public void powerOffRadio() {
		System.out.println("The radio is now off.");
	}
	
	@Override
	public void turnLeft() {
		//Code to turn left.
		System.out.println("Car turning left.");
	}
	
	@Override
	public void turnRight() {
		//Code to turn right.
		System.out.println("Car turning right.");
	}
	
//	public String toString() {
//		System.out.println("Car toString()");
//		String formatString = "%-15s";
//		
//		return super.toString() + "\n" + 
//			   String.format(formatString, "num. doors:") + this.numDoors;
//	}
	

	
	
	
}
