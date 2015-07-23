import java.util.ArrayList;

public class Museum {

	private ArrayList<Showpiece> showpieces;
	private ArrayList<ArtWork> artworks;
	private ArrayList<Artifact> artifacts;
	private ArrayList<Employee> employees;

	public Museum(ArrayList<Showpiece> showpieces, ArrayList<ArtWork> artworks,
			ArrayList<Artifact> artifacts, ArrayList<Employee> employees) {
		
		this.showpieces = showpieces;
		this.artworks = artworks;
		this.artifacts = artifacts;
		this.employees = employees;

	}

	public ArrayList<Showpiece> getShowpieces() {
		return showpieces;
	}

	public void setShowpieces(ArrayList<Showpiece> showpieces) {
		this.showpieces = showpieces;
	}

	public ArrayList<ArtWork> getArtworks() {
		return artworks;
	}

	public void setArtworks(ArrayList<ArtWork> artworks) {
		this.artworks = artworks;
	}

	public ArrayList<Artifact> getArtifacts() {
		return artifacts;
	}

	public void setArtifacts(ArrayList<Artifact> artifacts) {
		this.artifacts = artifacts;
	}

	public ArrayList<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	
	public String toString() {
		String s = "Showpieces: ";
		for(int i = 0; i < this.showpieces.size(); i++) {
			s += showpieces.get(i).getName() + ", ";
		}
		s += "\nArtworks: ";
		for(int i = 0; i < this.artworks.size(); i++) {
			s += artworks.get(i).getName() + ", ";
		}
		s += "\nArtifacts: ";
		for(int i = 0; i < this.artifacts.size(); i++) {
			s += artifacts.get(i).getName() + ", ";
		}
		s += "\nEmployees: ";
		for(int i = 0; i < this.employees.size(); i++) {
			s += employees.get(i).getName() + ", ";
		}
		s += "\n";
		return s;
	}
}
