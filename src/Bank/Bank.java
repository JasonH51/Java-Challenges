package Bank;

import java.util.ArrayList;

public class Bank {

	private ArrayList<Branch> branches;

	public void addBranch(Branch branch) {
		if (findBranchIndex(branch) < 0) {
			branches.add(branch);
		}
		System.out.println("Branch already exists.");
	}

	public int findBranchIndex(Branch branch) {
		int index = branches.indexOf(branch);
		if (index < 0) {
			return index;
		}
		return -1;
	}

	public void addNewCustomerToBranch(Branch branch, String name, double transation) {
		if (findBranchIndex(branch) <= 0) {
			branches.get(findBranchIndex(branch)).addCustomer(name, transation);
		}
	}

	public void addTransationToCustomer(Branch branch, Customer customer, double transation) {
		if (findBranchIndex(branch) <= 0) {
			branches.get(findBranchIndex(branch)).addCustomerTransation(customer, transation);
		}
	}

	public void getBranchCustomers(Branch branch) {
		if (findBranchIndex(branch) <= 0) {
			branches.get(findBranchIndex(branch)).showListCustomers();
		}
	}

}
