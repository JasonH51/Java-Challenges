package Challenges;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount bank = new BankAccount();
		
		bank.setAccountNumber(542343);
		bank.setBalance(1000d);
		bank.setCustomerName("Jason Horton");
		bank.setEmail("jasonh5151@gmail.com");
		bank.setPhoneNumber(456345765);
		
		
		System.out.println(bank.getAccountNumber());
		System.out.println(bank.getBalance());
		System.out.println(bank.getCustomerName());
		System.out.println(bank.getEmail());
		System.out.println(bank.getPhoneNumber());
		
		System.out.println("Setters and getters working.");
		
		bank.deposit(300);
		bank.withdraw(1000);
		
	}

}
