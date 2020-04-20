package ie.nuigalway.ie.ct548.assignment4;

import java.util.Set;
import java.util.TreeSet;

public class TvSeries extends MediaItem {

private int TID;
private People creator;




/*	public TvSeries() {

		setTitle("Simpsons");
		setYear(2000);
	}
*/
	
	public People getCreator() {
		return creator;
	}

	public void setCreator(People creator) {
		this.creator = creator;
	}

	public int getTID() {
		return TID;
	}

	public void setTID(int tID) {
		TID = tID;
	}

	

}
