package class_examples;

public class Vehicle {
	private long vehicleID;
	private int speed;
	private String color;
	
	public Vehicle(long vehicleID, int speed, String color) {
		super();
		this.vehicleID = vehicleID;
		this.speed = speed;
		this.color = color;
	}


	public long getVehicleID() {
		return vehicleID;
	}


	public void setVehicleID(long vehicleID) {
		this.vehicleID = vehicleID;
	}


	public int getSpeed() {
		return speed;
	}


	public void setSpeed(int speed) {
		this.speed = speed;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
	
	public void turnLeft() {
		//Code to turn left.
		System.out.println("Vehicle turning left.");
	}
	
	public void turnRight() {
		//Code to turn right.
		System.out.println("Vehicle turning right.");
	}
	
	public String toString() {
		String formatString = "%-15s";
		
		
		String result = String.format(formatString, "vehicle id:") + this.vehicleID + "\n" +
						String.format(formatString, "speed:") + this.speed + "\n" +
						String.format(formatString, "color:") + this.color;
		
		return result;
	}
	
	
	
	
}
