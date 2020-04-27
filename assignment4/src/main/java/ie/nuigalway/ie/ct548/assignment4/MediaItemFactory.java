package ie.nuigalway.ie.ct548.assignment4;

public class MediaItemFactory {

	public MediaItem createMediaItem(String type) {

		MediaItem newMediaItem = null;

		if(type.equals("F")){
		
			return new Film();
		}
		else if(type.equals("T")) {
			return new TvSeries();
		}

		else return null;
	}
	
	public MediaItem setDirectorOrCreator(MediaItem theMedia, String type) {
		
		if(type.contentEquals("F")) {
			
		Film film = (Film) theMedia;
		film.setDirector(new Person());
		return film;
		}
		else {
			TvSeries tvSeries = (TvSeries) theMedia;
			tvSeries.setCreator(new Person());
			return tvSeries;
		}
	}
	
	
}


