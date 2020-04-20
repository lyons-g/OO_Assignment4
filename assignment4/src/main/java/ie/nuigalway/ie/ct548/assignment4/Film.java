package ie.nuigalway.ie.ct548.assignment4;

import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "fid", scope = Film.class)
public class Film extends MediaItem {

	private int fid;
	private Person director;
	
/*	public Film() {
		
		setTitle("Toy Story");
		setYear(1995);
		
	}
	*/
	
	public Film() {
		
	}

	public Film(int fid) {
		this.fid=fid;
		//director = getDirector();
	}
	
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public Person getDirector() {
		return director;
	}

	public void setDirector(Person director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "\n" + "Film [fid=" + fid + ", director=" + director + "Title= " + getTitle() + ", Year= " + getYear() + ", Genre="
				+ getGenre() + ", Cast= " + getCast() + ", Description= " + getDescription() + "]";
	}
	
	
	
}

