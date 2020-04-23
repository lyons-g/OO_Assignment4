package ie.nuigalway.ie.ct548.assignment4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.JFrame;

public class CCController {
	
	private CatalogContainer model;
	private ProfileSelectionView view;
	//private ListByYearView view2;
	
	
	
	public CCController(CatalogContainer model, ProfileSelectionView view ) {
		this.model = model;
		this.view = view;
		
		this.view.addFirstProfileListener(new firstProfileListener());
		
	}
	
	class firstProfileListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//JFrame.DISPOSE_ON_CLOSE();
			//new ProfileSelectionView(CatalogContainer);
			System.out.println("Test");
			
			
			// TODO Find actual profile here. implement filter on profiles
			Profile firstProfile = model.getProfiles().iterator().next();
			view.openFirstProfile(firstProfile);
		}
		
	}
	
	public void switchProfile() {
		//ProfileSelectionView psv = new ProfileSelectionView();
		
	//	psv.getFirstProfile().setText(model.getProfiles())
	}
	
	public void intiController() {
		
	}
	/*public String getProfileName() {
		for(Profile e : model.getProfiles())	
	    return e.getName();
	
		
		
		//return model.getName();
	}*/

	public void updateView() {
	view.printProfile(model.getProfiles().toString());
	
		
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