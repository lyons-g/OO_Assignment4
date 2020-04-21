package ie.nuigalway.ie.ct548.assignment4;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class CCController {
	
	private CatalogContainer model;
	private ProfileSelectionView view;
	//private ListByYearView view2;
	
	
	
	public CCController(CatalogContainer model, ProfileSelectionView view ) {
		this.model = model;
		this.view = view;
		
	}
	
	public void getProfileName() {
		for(Profile e : model.getProfiles())
	    	System.out.println(e.getName());
		//return model.getName();
	}

	public void updateView() {
	
		view.printProfile(model.getName());
		
	//	view.printProfile(model.getProfiles().toString());
			
		}
}
	
/*	public SortedSet<MediaItem> getMediaItems(){
	return Collections.unmodifiableSortedSet(MediaItems);
	}
	
	public void updateView2() {
		view2.ListByYear(model.getMediaitems().toString());
	}
	
}
*/