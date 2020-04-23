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
}
		
		
		/*	if(newMediaType.equals("F")) {
			return new Film();
			
		}else
			if(newMediaType.equals("T")) {
				return new TvSeries();
				
			}else return null;
	}
}
*/