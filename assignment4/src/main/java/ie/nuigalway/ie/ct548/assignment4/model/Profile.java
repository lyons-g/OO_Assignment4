package ie.nuigalway.ie.ct548.assignment4.model;

public class Profile {

	private String name;
	private Genre preferredGenre;

	public Profile() {

	}

	public Profile(String name, Genre preferredGenre) {
		this.name = name;
		this.preferredGenre = preferredGenre;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Genre getPreferredGenre() {
		return preferredGenre;
	};

	public void setPreferredGenre(Genre preferredGenre) {
		this.preferredGenre = preferredGenre;
	}

	@Override
	public String toString() {
		return "\n"+ "Profile [name= " + getName() + ", preferredGenre= " + getPreferredGenre() + "]";
	}



}
