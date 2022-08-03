package ArrayListChallenge;

import java.util.Scanner;

public class Main {
	private static Scanner s = new Scanner(System.in);
	private static MobilePhone mobilePhone = new MobilePhone();

	public static void main(String[] args) {

		printMenu();

		boolean quit = false;

		while (!quit) {
			int menuInput = s.nextInt();
			s.nextLine();

			switch (menuInput) {
			case 1:
				printMenu();
				break;
			case 2:
				addContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				findContactByName();
				break;
			case 6:
				printContactList();
				break;
			case 0:
				quit = true;
				s.close();
				break;
			}

		}

	}

	public static void printMsg() {
		System.out.println("What else would you like to do? Press 1 to see the menu.");
	}

	public static void printMenu() {
		System.out.println("Welcome, please Select from menu. \n" + "	Press \n" + "		1 - show menu. \n"
				+ "		2 - add new contact. \n" + "		3 - update an existing contact. \n"
				+ "		4 - remove a contact. \n" + "		5 - find a contact by name. \n"
				+ "		6 - print list of contacts.\n" + "		0 - to quit the application.");
	}

	public static void addContact() {
		System.out.println("Enter contacts name :");
		String name = s.nextLine();

		System.out.println("Enter contacts phone number :");
		int phoneNumber = s.nextInt();
		s.nextLine();

		mobilePhone.addContact(name, phoneNumber);
		printMsg();
	}

	public static void updateContact() {
		System.out.println("What is the name of the contact you want to update?");
		String name = s.nextLine();
		System.out.println("Enter new name:");
		String newName = s.nextLine();
		System.out.println("Enter new phone number:");
		int phoneNumber = s.nextInt();
		mobilePhone.modifyContact(name, newName, phoneNumber);
		printMsg();
	}

	public static void removeContact() {
		System.out.println("Enter the name of the contact you want to delete.");
		String name = s.nextLine();
		mobilePhone.removeContact(name);
		printMsg();
	}

	public static void findContactByName() {
		System.out.println("Enter the name of the contact you want to see.");
		String name = s.nextLine();

		mobilePhone.findContactByName(name);;
		printMsg();
	}

	public static void printContactList() {
		mobilePhone.printContactList();
		printMsg();
	}

}
