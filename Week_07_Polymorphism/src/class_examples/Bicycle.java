package class_examples;

public class Bicycle extends Vehicle {
	private int seatHeight;

	public Bicycle(long vehicleID, int speed, String color, 
			int seatHeight) {
		super(vehicleID, speed, color);
		
		this.seatHeight = seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}
	
	public void ringBell() {
		System.out.println("DING DING!");
	}
	
	public String toString() {
		String formatString = "%-15s";
		
		return super.toString() + "\n" + 
	           String.format(formatString, "seat height:") + this.seatHeight;
	}
}
