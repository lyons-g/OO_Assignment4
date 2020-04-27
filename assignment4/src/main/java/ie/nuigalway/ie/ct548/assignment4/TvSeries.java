package ie.nuigalway.ie.ct548.assignment4;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "tid", scope = TvSeries.class)
public class TvSeries extends MediaItem { //implements Comparable<TvSeries>{

	private int tid;

	
	/*private String title;
	private int year;
	private ArrayList<Genre> genre = new ArrayList<Genre>(); 
	private ArrayList<Person> cast = new ArrayList<Person>();
	private String description;
	*/

	public TvSeries() {
		

	}

	public TvSeries(int tid)//, Person creator, String title, int year, ArrayList<Genre> genre, ArrayList<Person> cast, String description) {
	{
		this.tid = tid;

	}

	public Person getCreator() {
		return getDirector();
	}

	public void setCreator(Person creator) {
		setDirector(creator);
	}

	public int getTID() {
		return tid;
	}

	public void setTID(int tID) {
		tid = tID;
	}

	/*public int compareTo(TvSeries other) {
		int yearMatch = this.getYear().compareTo(other.getYear());
		if(yearMatch == 0)
			return this.getTitle().compareTo(other.getTitle());
		return yearMatch;
	}
*/
	@Override
	public String toString() {
		return "\n" + "TvSeries [tid=" + tid + ", creator=" + getDirector() + ", title= " + getTitle() + ", year= " + getYear() + ", genre= " + getGenre() + "Cast= " + getCast() + "Description= " + getDescription();
	}



}
