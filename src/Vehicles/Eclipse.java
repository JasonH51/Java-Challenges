package Vehicles;

public class Eclipse extends Car {
	private String color;
	private boolean hasTrunk;
	private String engine;
	
	public Eclipse() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Eclipse(String color, boolean hasTrunk, String engine) {
		super("MType", 4, "Eclipse");
		this.color = color;
		this.hasTrunk = hasTrunk;
		this.engine = engine;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isHasTrunk() {
		return hasTrunk;
	}
	public void setHasTrunk(boolean hasTrunk) {
		this.hasTrunk = hasTrunk;
	}
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	
	
}
