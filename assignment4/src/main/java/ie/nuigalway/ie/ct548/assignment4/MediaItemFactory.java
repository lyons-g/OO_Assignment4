package ie.nuigalway.ie.ct548.assignment4;

public class MediaItemFactory {

	public MediaItem createMediaItem(String newMediaType) {
		
		MediaItem newMediaItem = null;
		
		if(newMediaType.equals("F")) {
			return new Film();
			
		}else
			if(newMediaType.equals("T")) {
				return new TvSeries();
				
			}else return null;
	}
}
