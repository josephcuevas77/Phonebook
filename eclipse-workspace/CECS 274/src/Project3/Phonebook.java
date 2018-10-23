package Project3;

import java.util.ArrayList;
import java.util.Collections;

public class Phonebook {
	private ArrayList<Contact> contacts;

	// Constructor
	public Phonebook() {
		contacts = new ArrayList<Contact>();
	}

	/**
	 * 
	 * @param Contact
	 */
	public void addContact(Contact c) {
		contacts.add(c);
	}

	/**
	 * 
	 * @param Contact
	 * @param name
	 * @return
	 */
	public boolean deleteContact(Contact c, String name) {
		for (int i=0; i<contacts.size(); i++) {
			Contact contactInfo = contacts.get(i);
			String contactName = contactInfo.getName();
			if (contactName.equals(name)) {
				contacts.remove(c);
				return true;
			}
		}
		return false;
	}

	/**
	 * 
	 * @param index
	 * @return
	 */
	public Contact getContactAtIndex(int index) {
		Contact c = contacts.get(index);
		return c;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public Contact getContact(String name) {
		for (Contact i: contacts) {
			if (i.getName().equals(name)) {
				return i;
			}
		}
		return null;
	}	

	/**
	 * 
	 * @return size of list contacts
	 */
	public int getSize() {
		return contacts.size();
	}

	/**
	 * 
	 * @param index
	 * @param contact to change
	 */
	public void replaceContact(int index, Contact change) {
		contacts.set(index, change);
	}

	/**
	 * 
	 * @return
	 */
	public String displayName() {
		int count = 0;
		String names = "";
		for (Contact i: contacts) {
			count++;
			names += (count + ". " + i.getName() + "\n");
		}
		return names;
	}

	/**
	 * sort contact list by name
	 */
	public void sortContacts() {
		Collections.sort(contacts, (a, b) -> a.getName().compareTo(b.getName()));
	}

	/**
	 * Convert phonebook memory to String
	 */
	public String toString() {
		String info = "";
		for (Contact i: contacts) {
			info += i.toString() + "\n";
		}
		return info;
	}

}
