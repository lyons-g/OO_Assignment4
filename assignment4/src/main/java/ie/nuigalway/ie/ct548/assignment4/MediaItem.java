package ie.nuigalway.ie.ct548.assignment4;

import java.awt.List;
import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


/*
 * abstract as do not want to create an instance of mediaItem 
 */
public abstract class MediaItem implements Comparable<MediaItem>{

	private String title;
	private Year year;
	private Set<Genre> genre = new TreeSet<Genre>(); 
	private Set<Person> cast = new TreeSet<Person>();
	private String description;
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Year getYear() {
		return year;
	}
	public void setYear(Year year) {
		this.year = year;
	}
	public Set<Genre> getGenre() {
		return genre;
	}
	public void setGenre(Set<Genre> genre) {
		this.genre = genre;
	}
	public Set<Person> getCast() {
		return cast;
	}
	public void setCast(Set<Person> cast) {
		this.cast = cast;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
public int compareTo(MediaItem o) {
		int yearMatch = o.getYear().compareTo(this.getYear());  //this.getYear().compareTo(o.getYear());
		if(yearMatch == 0)
		return this.getTitle().compareTo(o.getTitle());
		return yearMatch;
	}

	
	

	
}

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

