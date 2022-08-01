package ArrayListChallenge;

import java.util.ArrayList;

public class MobilePhone {

	private ArrayList<Contact> contacts;

	public MobilePhone() {
		this.contacts = new ArrayList<Contact>();
	}

	public MobilePhone(ArrayList<Contact> contacts) {
		this.contacts = contacts;
	}

	public void addContact(String name, int phoneNumber) {
		Contact newContact = new Contact(name, phoneNumber);
		boolean exists = contacts.contains(newContact);

		if (!exists) {
			contacts.add(newContact);
		}
	}

	public int findContactIndex(String name) {
		int contactIndex = -1;

		for (int i = 0; i < contacts.size(); i++) {
			String contactName = contacts.get(i).getName();
			if (name.equals(contactName)) {
				contactIndex = i;
				break;
			}
		}

		return contactIndex;

	}

	public int findContactIndex(int phoneNumber) {
		int contactIndex = -1;

		for (int i = 0; i < contacts.size(); i++) {
			int contactPhoneNumber = contacts.get(i).getPhoneNumber();
			if (phoneNumber == contactPhoneNumber) {
				contactIndex = i;
				break;
			}
		}

		return contactIndex;

	}

	public void modifyContact(String name, String newName, int phoneNumber) {
		Contact newContact = new Contact(newName, phoneNumber);
		int index = findContactIndex(name);

		contacts.set(index, newContact);
	}

	public void removeContact(String name) {
		int index = findContactIndex(name);

		if (index >= 0) {
			contacts.remove(index);
			System.out.println("Contact removed.");
		} else {
			System.out.println("Contact not found.");
		}
	}

	private Contact getContact(String name) {
		int index = findContactIndex(name);

		if (index >= 0) {
			return contacts.get(index);
		}
		return null;
	}

	public ArrayList<Contact> getAllContacts() {
		return contacts;
	}

	public void findContactByName(String name) {

		Contact contact = getContact(name);
		System.out.println("Contact name: " + contact.getName() + "\n" + "Phone number: " + contact.getPhoneNumber());

	}

	public void printContactList() {

		for (Contact i : contacts) {
			System.out.println("Contact : " + i.getName() + " - " + i.getPhoneNumber());
		}
	}

}
