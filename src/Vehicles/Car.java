package Vehicles;

public class Car extends Vehicle{
	boolean hasCarParts;

	public Car() {
		super();
		hasCarParts = true;
	}

	public Car(String make, int wheels, String type) {
		super(make, wheels, type);
		hasCarParts = true;
	}

	public boolean isHasCarParts() {
		return hasCarParts;
	}

	public void setHasCarParts(boolean hasCarParts) {
		this.hasCarParts = hasCarParts;
	}
}
