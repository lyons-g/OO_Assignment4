package ie.nuigalway.ie.ct548.assignment4.modelTests;

import static org.junit.Assert.*;

import org.junit.Test;

import ie.nuigalway.ie.ct548.assignment4.model.Film;
import ie.nuigalway.ie.ct548.assignment4.model.MediaItem;
import ie.nuigalway.ie.ct548.assignment4.model.MediaItemFactory;
import ie.nuigalway.ie.ct548.assignment4.model.TvSeries;

public class MediaItemFactoryTest {

	
	
	
	@Test
	public void testCreatingNewFilmFromMediaItemFactory() {
		
		MediaItemFactory mediaFactory = new MediaItemFactory();
		MediaItem newMediaItem = null;
		String type = "F";
		newMediaItem = mediaFactory.createMediaItem(type);
		
		if(type.equals("F")){
		
			 new Film();
		}
		else if(type.equals("T")) {
		 new TvSeries();
		}
		
		else;
		
		
		System.out.println(newMediaItem);
		assertNotNull("A new MediaItem is expected to be retured", newMediaItem);
		assertTrue("MediaItem of type Film Is expected to be returned", newMediaItem.getClass().equals(Film.class));
	}
		
	@Test
	public void testCreatingNewTvSeriesFromMediaItemFactory() {
		
		MediaItemFactory mediaFactory = new MediaItemFactory();
		MediaItem newMediaItem = null;
		String type = "T";
		newMediaItem = mediaFactory.createMediaItem(type);
		
		if(type.equals("F")){
		
			 new Film();
		}
		else if(type.equals("T")) {
		 new TvSeries();
		}
		
		else;
		
		
		System.out.println(newMediaItem);
		assertNotNull("A new MediaItem is expected to be retured", newMediaItem);
		assertTrue("MediaItem of type TvSeries Is expected to be returned", newMediaItem.getClass().equals(TvSeries.class));
	}


}

