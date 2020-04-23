package ie.nuigalway.ie.ct548.assignment4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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
	private AddItemView itemView;
	private String typeOfMedia;
	//private ListByYearView view2;



	public CCController(CatalogContainer model, ProfileSelectionView view ) {
		this.model = model;
		this.view = view;

		this.view.addFirstProfileListener(new firstProfileListener());
		this.view.secondProfilerListener(new secondProfileListener());
		this.view.thirdProfileListener(new thirdProfileListener());
		
	//	this.itemView.saveButton(new saveButtonListener());

	}

	class firstProfileListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			System.out.println("Test");


			// TODO Find actual profile here. implement filter on profiles
			Profile firstProfile = model.getProfiles().iterator().next();
			view.openFirstProfile(firstProfile);
		}
	}


	class secondProfileListener implements ActionListener{

		
		public void actionPerformed(ActionEvent arg0) {
			ListByYearView lb = new ListByYearView();
			System.out.println("Test2");
		}
		
	}

	class thirdProfileListener implements ActionListener{	
		public void actionPerformed(ActionEvent arg0) {
			//AddItemView av = new AddItemView();
			//av.saveButtonListener(new saveButtonListener());
			//System.out.println("Test3");
			openAddItemView();
		}
			
	}
	
	class saveButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("NewTest");
			CreateMedia();
			
		}
		
	}
	
	public void CreateMedia() {
		System.out.println("Create new media");
		MediaItemFactory mediaFactory = new MediaItemFactory();
		MediaItem theMedia = null;
		theMedia = mediaFactory.createMediaItem("F");
	
	}
	
	public void openAddItemView() {
		
		System.out.println("Open add item View"); 
		AddItemView ad = new AddItemView();
		ad.saveButtonListener(new saveButtonListener()); 
		
	}
	
	
	class checkboxListener implements ItemListener{

		
		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				 typeOfMedia = "T";
			}
			else {
				 typeOfMedia = "F";
			
			}	
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