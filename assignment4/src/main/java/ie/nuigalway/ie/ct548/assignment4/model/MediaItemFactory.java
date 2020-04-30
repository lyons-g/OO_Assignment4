package ie.nuigalway.ie.ct548.assignment4.model;


/*
 * the MediaItemFactory is called when we need to create a new media item
 * based on user input either a new TvSeries or Film is created
 */

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

	public MediaItem setDirectorOrCreator(MediaItem theMedia, String type, String name) {

		if(type.contentEquals("F")) {

			Film film = (Film) theMedia;
			film.setDirector(new Person(name));
			return film;
		}
		else {
			TvSeries tvSeries = (TvSeries) theMedia;
			tvSeries.setCreator(new Person(name));
			return tvSeries;
		}
	}


}


