package ie.nuigalway.ie.ct548.assignment4;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "gid", scope = Genre.class)
public class Genre {

	
	private int gid;
	private String genre;
	
	public Genre (int gid, String genre){
		this.gid = gid;
		this.genre = genre;
	}
	
	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}


		
	
	
}
