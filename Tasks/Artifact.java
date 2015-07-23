package Tasks;

public class Artifact extends Showpiece implements Comparable<Showpiece>{

	
	public enum Age {
		CLASSIC, MODERN_AGE, MIDDLE_AGE;
	};

	//and 4 other atributes
	private int id;
	private String author;
	private Age age;
	private String cameFrom;

	//constructor which aslo has atributes extended by super class(Showpiece)
	public Artifact(String name, String description,  String author,
			Age age, String cameFrom) {
		super(name, description);
		this.id =  ID;
		this.author = author;
		this.age = age;
		this.cameFrom = cameFrom;
		ID++;
	}
	
	//getters for every atribute and setters for every except ID
	

	public String getCameFrom() {
		return cameFrom;
	}

	public void setCameFrom(String cameFrom) {
		this.cameFrom = cameFrom;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Age getAge() {
		return age;
	}

	public void setAge(Age age) {
		this.age = age;
	}
	

	/**
	 * equals method which compares all atributes except ID, and all have to be fulfilled
	 * @param other
	 * @return true if all terms are fulfilled and flase if at least one isnt 
	 */
	public boolean equals(Artifact other) {
		if (this.name.equalsIgnoreCase(other.name) && this.author.equalsIgnoreCase(other.author)
				&& this.age.equals(age.toString()) && this.cameFrom.equalsIgnoreCase(other.cameFrom)
				&& this.description.equalsIgnoreCase(other.description)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Name: " + name + "\nAuthor: " + author + "\nAge: " + age
				+ "\nIt came from: " + cameFrom + "\nID: " + id
				+ "\nDescription: " + description + "\n";
	}	
}
