package ie.nuigalway.ie.ct548.assignment4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.Year;
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
	private ListByYearView ByYearView;
	private VideoCatalogView vcView;



	public CCController(CatalogContainer model, VideoCatalogView vcView) { //ProfileSelectionView view ) {
		this.model = model;
		this.vcView = vcView;

		this.vcView.switchProfileListener(new switchProfileListener());
		this.vcView.addNewListener(new addNewListener());
		this.vcView.listByYearListener(new listByYearListener());
		this.vcView.listByGenre(new listByGenre());
		/*this.view.addFirstProfileListener(new firstProfileListener());
		this.view.secondProfilerListener(new secondProfileListener());
		this.view.thirdProfileListener(new thirdProfileListener());
		this.view.fourthProfileListener(new fourthProfileListener());
		*/

	}
	
	class switchProfileListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			//ProfileSelectionView ps = new ProfileSelectionView();
			System.out.println("Test Profile Switch");
		}
		
	}
	
	class addNewListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Add Item Window open and Create New Media Called");
			CreateMedia();
			
		}
		
	}
	
	class listByYearListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
	//	ListByYearView lb = new ListByYearView();
		System.out.println("test byYear button");
		}
		
	}
	
	
	class listByGenre implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("test byGenre button");
		}
		
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
			System.out.println("Add Item Window open and Create New Media Called");
			CreateMedia();
		}

	}
	
	class fourthProfileListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
		System.out.println("4th button pressed");
		ListByYear();
			
		}
}

	class checkBoxListener implements ItemListener{

		@Override
		public void itemStateChanged(ItemEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == itemView.getCheckbox()) {
				if(e.getStateChange() == 1);
				
			}
		}
		
	}
	
	class saveButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("NewTest");
			
		
			String title = itemView.getTitleText().getText();
			System.out.println(title + "saveButton");
			
			String description = itemView.getDescriptionText().getText();
			
			String year = itemView.getYearText().getText();
			int y = Integer.parseInt(year);
			
			
			
			//String cast = itemView.getCastText().getText();
			//String [] elements = cast.split(",");
			
			if(itemView.getCheckbox().isSelected()) {
				typeOfMedia = "T";
			}else
				typeOfMedia = "F";
		
			
			MediaItemFactory mediaFactory = new MediaItemFactory();
			MediaItem theMedia = null;
			theMedia = mediaFactory.createMediaItem(typeOfMedia);

			theMedia.setTitle(title);
			theMedia.setYear(Year.of(y));
			theMedia.setDescription(description);
			theMedia.setGenre(null);
			theMedia.setCast(null);
			model.addMediaItem(theMedia);
			
			System.out.println(model.getMediaitems());

		}

	}
	
	

	public void CreateMedia() {
		
		System.out.println("Open add item View"); 
		itemView  = new AddItemView();
		itemView.saveButtonListener(new saveButtonListener()); 
		itemView.checkBoxListener(new checkBoxListener());
		System.out.println("Create new media");

	}


	public void ListByYear() {
		System.out.println("ListByYear() called");
		//ByYearView = new ListByYearView();
		/* VideoCatalogView view1 = new VideoCatalogView();
		view1.switchProfileListener(new switchProfileListener());
		view1.addNewListener(new addNewListener());
		view1.listByYearListener(new listByYearListener());
		view1.listByGenre(new listByGenre());
			
		*/
	}

	public void updateView() {
		view.printProfile(model.getProfiles().toString());


	}
}

