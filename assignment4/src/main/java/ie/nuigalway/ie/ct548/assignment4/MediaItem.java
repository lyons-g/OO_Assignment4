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
	private ArrayList<Genre> genre = new ArrayList<Genre>(); 
	private ArrayList<Person> cast = new ArrayList<Person>();
	private String description;
	private Person director;


	public MediaItem(){

	}
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
	
	
	public ArrayList<Genre> getGenre() {
		return genre;
	}
	
	public void setGenre(ArrayList<Genre> genre) {
		this.genre = genre;
	}
	
	
	
	public ArrayList<Person> getCast() {
		return cast;
	}

	public void setCast(ArrayList<Person> Cast){
		this.cast = Cast;
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
	

	public Person getDirector() {
		return director;
	}
	public void setDirector(Person director) {
		this.director = director;
	}

	
}
