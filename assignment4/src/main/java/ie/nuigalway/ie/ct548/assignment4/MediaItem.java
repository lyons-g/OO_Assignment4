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
	private ArrayList<Person> cast = new ArrayList<Person>();
	private String description;


	public MediaItem()
	{


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
	public Set<Genre> getGenre() {
		return genre;
	}
	public void setGenre(Set<Genre> genre) {
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

}
