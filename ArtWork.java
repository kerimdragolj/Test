public class ArtWork extends Showpiece implements Comparable<Showpiece> {
	
	
	public enum Age {
		RENESANS, NEOCLASSICAL, MODERN, CONTEMPORARY;
	};

	//3 other variables
	private int id;
	private String author;
	private Age age;

	//constructor which extends parent class(Showpiece)
	public ArtWork(String name, String description, String author,
			Age age) {
		super(name, description);
		this.id = ID;
		this.author = author;
		this.age = age;
	}
	
	//getters for every atribude, and setters for every except ID
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
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
	public boolean equals(ArtWork other) {
		if (this.name.equals(other.name) && this.author.equals(other.author)
				&& this.age.equals(other.toString())
				&& this.description.equals(other.description)) {
			return true;
		} else {
			return false;
		}
	}

	public String toString() {
		return "Name: " + name + "\nAuthor: " + author + "\nAge: " + age
				+ "\nID: " + id + "\nDescription: " + description + "\n";
	}

}
