package Tasks;
import java.util.ArrayList;

/**
 * This class represents main class of showpieces in museum, its extendsed by
 * Artwork and Artifact class
 * 
 * @author kerim.dragolj
 *
 */
public class Showpiece implements Comparable<Showpiece>, Searchable {

	// Initializing 1 static variable which is ID thats given to every
	// showpiece, artwork or artifact
	protected static int ID = 0;

	private int id;
	protected String name;
	protected String description;

	public Showpiece(String name, String description) {

		this.id = ID;
		this.name = name;
		this.description = description;
		ID++;
	}

	// getters for every variable and setter for every variable except ID
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

	/**
	 * equals method which compares all atributes except ID, and all have to be fulfilled
	 * @param other
	 * @return true if all terms are fulfilled and flase if at least one isnt 
	 */
	public boolean equals(Showpiece other) {
		if (this.name.equalsIgnoreCase(other.name)
				&& this.description.equalsIgnoreCase(other.description)) {
			return true;
		} else {
			return false;
		}

	}

	public String toString() {
		return "Name: " + name + "\nID: " + id + "\nDescription: "
				+ description;
	}

	// Implemented method from Comparable
	@Override
	public int compareTo(Showpiece o) {
		return this.name.compareTo(o.name);
	}

	// implemented method from Searchable
	public boolean fiitsSearch(String s) {
		if (this.name.contains(s)) {
			return true;
		} else {
			if (description.contains(s)) {
				return true;
			} else if (s.equalsIgnoreCase("" + this.id)) {
				return true;
			}
		}
		return false;
	}
}
