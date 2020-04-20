package ie.nuigalway.ie.ct548.assignment4;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/*
 * abstract as do not want to create an instance of mediaItem 
 */
public abstract class MediaItem {

	//private int Id;
	//private People person;
	private String title;
	private int year;
	private ArrayList<Genre> genre = new ArrayList<Genre>(); 
	private ArrayList<Person> cast = new ArrayList<Person>();
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
	
	
	/*public int getId() {
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
*/
	
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
	
	
	public ArrayList<Genre> getGenre() {
		return genre;
	}
	
	
	public void setGenre(ArrayList<Genre> genre) {
		this.genre = genre;
	}
	public ArrayList<Person> getCast() {
		return cast;
	}
	public void setCast(ArrayList<Person> cast) {
		this.cast = cast;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
	/*public void TestTitle() {
		System.out.println(getTitle() + " is the title of mediaItem");
		
	}
	
	public void TestDescription() {
		System.out.println(getDescription() + " is description of mediaItem");

	}

	public void TestYear() {
		System.out.println(getYear() + " is the year of mediaItem");
	
}
	}*/

