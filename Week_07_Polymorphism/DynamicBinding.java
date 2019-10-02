package class_examples;

import java.util.ArrayList;

public class DynamicBinding {

	public static void main(String[] args) {
		Bicycle bike1 = new Bicycle(547364575, 5, "green", 2);
		Bicycle bike2 = new Bicycle(432344, 10, "black", 3);
		
		Car car1 = new Car(1234567, 60, "red", 4);
		Car car2 = new Car(8436374, 100, "blue", 2);
		
		//Declared Type		Actual Type
		Vehicle v1 		= 	new Car(346354, 50, "yellow", 2);
	
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		
		vehicles.add(car1);
		vehicles.add(bike1);
		vehicles.add(car2);
		vehicles.add(bike2);
		
		printList(vehicles);

		car1 instanceof Car
		
	}
	
	public static void printList(ArrayList<Vehicle> vehicles) {
		for(int i = 0 ; i < vehicles.size() ; ++i) {
			vehicles.get(i).turnLeft();
			vehicles.get(i).turnRight();
			
			System.out.println();
		}
	}

}
