package ie.nuigalway.ie.ct548.assignment4.model;



import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "tid", scope = TvSeries.class)
public class TvSeries extends MediaItem { //implements Comparable<TvSeries>{

	private int tid;
	private ArrayList tvSeries;


	public TvSeries() {


	}

	public TvSeries(int tid)
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


	@Override
	public String toString() {
		return "\n" + "TvSeries [tid=" + tid + ", creator=" + getDirector() + ", title= " + getTitle() + ", year= " + getYear() + ", genre= " + getGenre() + "Cast= " + getCast() + "Description= " + getDescription();
	}



}
