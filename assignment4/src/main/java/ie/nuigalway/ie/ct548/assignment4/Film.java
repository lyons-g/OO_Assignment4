package ie.nuigalway.ie.ct548.assignment4;

import java.time.Year;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "fid", scope = Film.class)
public class Film extends MediaItem {

	private int fid;
	private Person director;
	
	
//	public Film() {
		
	//}

	public Film() {
		System.out.println("Test_Film");
		//this.fid=fid;
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
	
	
	
	
	
	
	
/*	public int compareTo(Film other) {
		int yearMatch = this.getYear().compareTo(other.getYear());
		if(yearMatch == 0)
			return this.getTitle().compareTo(other.getTitle());
		return yearMatch;
	}
*/
	@Override
	public String toString() {
		return "\n" + "Film [fid=" + fid + ", director=" + director + "Title= " + getTitle() + ", Year= " + getYear() + ", Genre="
				+ getGenre() + ", Cast= " + getCast() + ", Description= " + getDescription() + "]";
	}


	
	
	
}

