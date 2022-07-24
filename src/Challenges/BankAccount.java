package Challenges;

public class BankAccount {
	
	int accountNumber;
	double balance;
	String customerName;
	String email;
	int phoneNumber;
	
	public BankAccount() {
		accountNumber = 0;
		balance = 0d;
		customerName = "";
		email = "";
		phoneNumber = 0;
	}
	
	public BankAccount(int accountNumber, double balance, String customerName, String email, int phoneNumber) {
		this.accountNumber = accountNumber;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}
	
	public void setAccountNumber(int num) {
		this.accountNumber = num;
	}
	public void setBalance(double num) {
		this.balance = num;
	}
	public void setCustomerName(String name) {
		this.customerName = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPhoneNumber(int num) {
		this.phoneNumber = num;
	}
	public int getAccountNumber() {
		return this.accountNumber;
	}
	public double getBalance() {
		return this.balance;
	}
	public String getCustomerName() {
		return this.customerName;
	}
	public String getEmail() {
		return this.email;
	}
	public int getPhoneNumber() {
		return this.phoneNumber;
	}
	
	public void deposit(double num) {
		if(num > 0){
			balance += num;
			System.out.println("your current balance is now " + balance);
		} else {
			System.out.println("issue with depositing please check the number is correct.");
		}
	}
	public double withdraw(double num) {
		if(balance < num) {
			System.out.println("Insufficient funds.");
			return 0d;
		} else {
			balance -= num;
			System.out.println("You're new balance is " + balance);
			return num;
		}
	}
}














