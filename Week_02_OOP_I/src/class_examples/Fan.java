package class_examples;

//Class declaration
public class Fan {
	//Data fields, properties, data variables
	//member variable, member fields
	private int speed;
	private boolean on;
	private double temperature;
	private boolean oscillating;
	private String color = "black";

	//Default constructor
	public Fan() {
		this.speed = 0;
		this.on = false;
		this.temperature = 0.0;
		this.oscillating = false;
		//this.color = "black";
	}

	public Fan(int speed, boolean on, double temperature,
			boolean oscillating) {

		this.setSpeed(speed);
		this.on = on;
		this.temperature = temperature;
		this.oscillating = oscillating;
		//this.color = "black";
	}

	public Fan(int speed, boolean on, double temperature,
			boolean oscillating, String color) {

		this.setSpeed(speed);
		this.on = on;
		this.temperature = temperature;
		this.oscillating = oscillating;
		this.color = color;
	}

	//getter / setter methods
	//accessors / mutators

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			System.out.println("ERROR: Speed cannot be negative.");
			System.out.println("Speed value unchanged");
		}
		else {
			this.speed = speed;
		}
	}
}