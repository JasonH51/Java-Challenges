package Bank;

import java.util.ArrayList;

public class Customer {
	private String name;
	private ArrayList<Double> transations;
	private double total;

	public Customer(String name, double initalTransation) {
		this.name = name;
		this.transations.add(initalTransation);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<Double> getTransations() {
		return transations;
	}
	
	public void addTransation(double tran) {
		transations.add(Double.valueOf(tran));
	}
	
	public double getTotal() {
		for(int i = 0; i<transations.size(); i++) {
			total += transations.get(i).doubleValue();
		}
		return total;
	}
	
	
}
