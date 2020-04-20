package ie.nuigalway.ie.ct548.assignment4;

import java.util.HashSet;
import java.util.Set;


/*
 * abstract as do not want to create an instance of mediaItem 
 */
public abstract class MediaItem {

	private int Id;
	private People person;
	private String title;
	private int year;
	private Set<Genre> genre = new HashSet<Genre>(); 
	private Set<People> cast = new HashSet<People>();
	private String description;
	
/*	mediaItem(int Id, People person, String title, int year, TreeSet<Genre> genre, TreeSet<People> cast, String description){
		this.Id = Id;
		this.person = person;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.cast = cast;
		this.description = description; 
	}
	*/
	
	
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}


	public People getPerson() {
		return person;
	}


	public void setPerson(People person) {
		this.person = person;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Set<Genre> getGenre() {
		return genre;
	}
	public void setGenre(Set<Genre> genre) {
		this.genre = genre;
	}
	public Set<People> getCast() {
		return cast;
	}
	public void setCast(Set<People> cast) {
		this.cast = cast;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}


	public void TestTitle() {
		System.out.println(getTitle() + " is the title of mediaItem");
		
	}
	
	public void TestDescription() {
		System.out.println(getDescription() + " is description of mediaItem");

	}

	public void TestYear() {
		System.out.println(getYear() + " is the year of mediaItem");
	

	}
}
