package Bank;

import java.util.ArrayList;

public class Branch {
	private int branchId;
	private ArrayList<Customer> customers;
	
	public Branch(int branchId) {
		this.branchId = branchId;
	}

	public void addCustomer(Customer customer) {
		if (findCustomerIndex(customer) < 0) {
			customers.add(customer);
		}
	}

	private int findCustomerIndex(Customer customer) {
		int index = customers.indexOf(customer);
		if (index >= 0) {
			return index;
		}
		return -1;
	}

	public void addCustomerTransation(Customer customer, double transation) {
		if (findCustomerIndex(customer) > 0) {
			customers.get(findCustomerIndex(customer)).addTransation(transation);
		}
	}

	public void addCustomer(String name, double deposit) {
		if (deposit >= 0) {
			Customer newCustomer = new Customer(name, deposit);
			customers.add(newCustomer);
		}
	}

	public void showListCustomers() {
		if (customers.size() > 0) {
			for (int i = 0; i < customers.size(); i++) {
				Customer current = customers.get(i);
				System.out
						.println("Customer number " + i + ": " + current.getName() + "\n Balance" + current.getTotal() + "\n");
			}
		}

		System.out.println("There are no customers at this branch.");
	}

}
