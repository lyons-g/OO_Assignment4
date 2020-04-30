package ie.nuigalway.ie.ct548.assignment4.model;

import java.time.Year;
import java.util.Set;
import java.util.TreeSet;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;


@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "fid", scope = Film.class)
public class Film extends MediaItem {

	private int fid;
	
	public Film() {
		
	}
	
	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	@Override
	public String toString() {
		return "\n" + "Film [fid=" + fid + ", director=" + getDirector() + "Title= " + getTitle() + ", Year= " + getYear() + ", Genre="
				+ getGenre() + ", Cast= " + getCast() + ", Description= " + getDescription() + "]";
	}

}

