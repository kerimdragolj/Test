package Tasks;

public class Employee implements Searchable {

	//6 variables which represents 6 positions 
	public static int DIRECTOR = 0;
	public static int SECRETARY = 1;
	public static int CEO = 2;
	public static int MANAGER = 3;
	public static int SENIOR = 4;
	public static int JUNIOR = 5;

	//and 5 other atributes
	private String name;
	private String surename;
	private String gender;
	private int position;
	private int salary;

	public Employee(String name, String surename, String gender, int position,
			int salary) {

		this.name = name;
		this.surename = surename;
		this.gender = gender;
		this.position = position;
		this.salary = salary;
	}

	//getters and setters for all variables
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurename() {
		return surename;
	}

	public void setSurename(String surename) {
		this.surename = surename;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	/**
	 * equals method which compares all atributes except ID, and all have to be fulfilled
	 * @param other
	 * @return true if all terms are fulfilled and flase if at least one isnt 
	 */
	public boolean equals(Employee other) {
		if (this.name.equalsIgnoreCase(other.name)
				&& this.surename.equalsIgnoreCase(other.name)
				&& this.position == other.position
				&& this.gender.equalsIgnoreCase(other.gender)
				&& this.salary == other.salary) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Name: " + name + "\nSurename: " + surename + "\nPosition: "
				+ position + "\nGender: " + gender + "\nSalary: " + salary + "\n";
	}

	/**
	 * method implemented from Searchable which checks is inserted string contained in this object 
	 */
	@Override
	public boolean fiitsSearch(String s) {
		if (this.name.contains(s) || this.surename.contains(s)
				|| this.gender.contains(s) || ("" + salary).contains(s)
				|| ("" + position).contains(s)) {
			return true;
		} else {
			return false;
		}
	}
}
