package Project3;

public class Contact {
	private String name;
	private String number;
	private String email;
	private String notes;
	private String date;

	/**
	 * Default Constructor
	 */
	public Contact() {
		name = "N/A";
		number = "N/A";
		email = "N/A";
		notes = "N/A";	
	}

	/**
	 * Overloaded Contstructor
	 * @param name
	 * @param number
	 * @param email
	 * @param notes
	 */
	public Contact(String name, String number, String email, String notes) {
		this.name = name;
		this.number = number;
		this.email = email;
		this.notes = notes;	
	}

	/**
	 * 
	 * @param name
	 * @param number
	 * @param email
	 * @param notes
	 * @param day
	 * @param type
	 */
	public Contact(String name, String number, String date) {
		this.name = name;
		this.number = number;
		this.date = date;
	}	
	/**
	 * 
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return name
	 */
	public String getName() {return name;}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(String number) {
		this.number = number;
	}

	/**
	 * 
	 * @return number
	 */
	public String getNumber() {return number;}

	/**
	 * 
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * 
	 * @return email
	 */
	public String getEmail() {return email;}

	/**
	 * 
	 * @param notes
	 */
	public void setNotes(String notes) {
		this.notes = notes;
	}

	/**
	 * 
	 * @return notes
	 */
	public String getNotes() {return notes;}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDate() {return date;}

	/**
	 * Convert contact memory to string
	 */
	public String toString() {
		String info = String.format("Contact Info: %nName: %s %nNumber: %s %nEmail: %s %nNotes: %s%n", name, number, email, notes);
		return info;
	}

	public String calledInfo() {
		String info = String.format("–Call Log– %nName: %s %nNumber: %s %n%s%n", name, number, date);
		return info;
	}

}
