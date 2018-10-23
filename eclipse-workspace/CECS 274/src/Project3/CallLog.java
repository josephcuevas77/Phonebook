package Project3;

import java.util.ArrayList;

public class CallLog {

	private ArrayList<Contact> calls = new ArrayList<Contact>(); 

	public CallLog() {
		calls = new ArrayList<Contact>();
	}

	public void logCall(Contact c) {
		calls.add(c);
	}

	public void editLog(int index, Contact c) {
		calls.set(index, c);
	}

	public Contact getContactAtIndex(int index) {
		Contact c = calls.get(index);
		return c;
	}

	public int getSize() {
		return calls.size();
	}

	public String toString() {
		String info = "";
		for (Contact i: calls) {
			info += i.calledInfo() + "\n";
		}
		return info;
	}

}
