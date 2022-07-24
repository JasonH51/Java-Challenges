package Vehicles;

public class Vehicle {
	private String make;
	private int numOfWheels;
	private String type;
	
	public Vehicle() {
		this("Honda", 4, "Car");
	}
	
	public Vehicle(String make, int wheels, String type) {
		this.make = make;
		this.numOfWheels = wheels;
		this.type = type;
	}
	
	public void steering() {
		System.out.println("Steering");
	}
	
	public void changeGear() {
		System.out.println("Change gear");
	}
	
	public void increaseSpeed(int num) {
		System.out.println("speed up "+num+" mph");
	}
	
	public void decreaseSpeed(int num) {
		System.out.println("decrease speed "+num+" mph");
	}
	
	public void move(int num) {
		if(num > 0) {
			increaseSpeed(num);
		} else {
			decreaseSpeed(num);
		}
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getNumOfWheels() {
		return numOfWheels;
	}

	public void setNumOfWheels(int numOfWheels) {
		this.numOfWheels = numOfWheels;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
}
