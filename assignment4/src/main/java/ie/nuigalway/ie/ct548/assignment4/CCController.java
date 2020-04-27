package ie.nuigalway.ie.ct548.assignment4;

import java.awt.GridLayout;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.time.Year;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class CCController {

	private CatalogContainer model;
	private ProfileSelectionView view;
	private AddItemView itemView;
	private String typeOfMedia;
	private ListByYearView ByYearView;
	private VideoCatalogView vcView;
	private ListByGenreView ByGenreView;



	public CCController(CatalogContainer model, VideoCatalogView vcView) { 
		this.model = model;
		this.vcView = vcView;

		this.vcView.switchProfileListener(new switchProfileListener());
		this.vcView.addNewListener(new addNewListener());
		this.vcView.listByYearListener(new listByYearListener());
		this.vcView.listByGenre(new listByGenre());
	}



	class switchProfileListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			view = new ProfileSelectionView();
			view.getFirstProfile().setText(model.getProfiles().get(0).getName().toString());
			view.getSecondProfile().setText(model.getProfiles().get(1).getName().toString());
			view.getThirdProfile().setText(model.getProfiles().get(2).getName().toString());
			view.getFourthProfile().setText(model.getProfiles().get(3).getName().toString());	
			view.addFirstProfileListener(new firstProfileListener());
			view.secondProfilerListener(new secondProfileListener());
			view.thirdProfileListener(new thirdProfileListener());
			view.fourthProfileListener(new fourthProfileListener());
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
			ListByYear();
			/*	HashMap<Year, MediaItem> map = model.sortByYear();
			for(Map.Entry m:map.entrySet()) {
				JLabel year1 = new JLabel(m.getKey().toString());

				System.out.println(m.getKey() + " " + m.getValue());
			}*/
			System.out.println("test byYear button");
		}
	}


	public void ListByYear() {
		System.out.println("ListByYear() called");
		
		TreeMap<Year, MediaItem>maping = model.sortby();
		for(MediaItem m : maping.values()) {
			System.out.println(m.getYear());
			System.out.println(m.getTitle());
		}
	
		ByYearView = new ListByYearView();

		TreeMap<Year, MediaItem> map = model.sortby();
		for(MediaItem m:map.values()) {

			JLabel l = new JLabel(m.getYear().toString());
			JLabel title = new JLabel(m.getTitle());
			ByYearView.getTitlePanel().add(l);
			ByYearView.getTitlePanel().add(title);

			JLabel blank = new JLabel(" ");
			JLabel genreLabel = new JLabel(m.getGenre().toString());
			ByYearView.getGenrePanel().add(blank);
			ByYearView.getGenrePanel().add(genreLabel);
		}
	}


	class listByGenre implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			listByGenre();
			System.out.println("test byGenre button");
		}

	}

	public void listByGenre() {
		
		ByGenreView = new ListByGenreView();
		
		HashMap<String, ArrayList<MediaItem>> sbg= model.sortByG();
		for(Entry<String, ArrayList<MediaItem>> m: sbg.entrySet()) {
			System.out.println(m.getKey());
			String key = m.getKey();
			JLabel keyLabel = new JLabel(key, SwingConstants.CENTER);
			ByGenreView.getGenrePanel().add(keyLabel);
			JLabel blank = new JLabel(" ");
			ByGenreView.getGenrePanel().add(blank);
			
		for(MediaItem item : m.getValue()) {
		
			String title = item.getTitle();
			JLabel titleLabel = new JLabel(title, SwingConstants.CENTER);
			ByGenreView.getGenrePanel().add(titleLabel);
			String year = item.getYear().toString();
			JLabel yearLabel = new JLabel(year);
			ByGenreView.getGenrePanel().add(yearLabel);
			System.out.println(item.getTitle());
			
		}
		
		}
	
	}
	

	class firstProfileListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			switchUser(model.getProfiles().get(0));
		}
	}

	class secondProfileListener implements ActionListener{


		public void actionPerformed(ActionEvent arg0) {
			switchUser(model.getProfiles().get(1));
		}

	}

	 
	
	public void switchUser(Profile profile) {
		VideoCatalogView view = new VideoCatalogView(model);
		view.getUserName().setText(profile.getName());
		Genre preferred = profile.getPreferredGenre();
		System.out.println(preferred);
		
		for(MediaItem m : model.getMediaitems()) {
			if(m.getGenre().contains(preferred)){
				System.out.println(m.getTitle() + m.getGenre() + m.getYear());
				JLabel title = new JLabel(m.getTitle());
				JLabel year = new JLabel(m.getYear().toString());
				JLabel genre = new JLabel(m.getGenre().toString());
				
				view.getGenre().add(title);
				view.getGenre().add(year);
				view.getGenre().add(genre);
			}
		}
		
	}


	class thirdProfileListener implements ActionListener{	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			switchUser(model.getProfiles().get(2));
			
			/*
			VideoCatalogView view = new VideoCatalogView(model);
			view.getUserName().setText("User Profile: " + model.getProfiles().get(3).getName());
			Genre preferred = model.getProfiles().get(0).getPreferredGenre();
			System.out.println(preferred);
			
			
			for(MediaItem m : model.getMediaitems())
			{
				if(m.getGenre().contains(preferred)) {
				System.out.println(m.getTitle() + m.getGenre() + m.getYear());
				JLabel title = new JLabel(m.getTitle());
				JLabel year = new JLabel(m.getYear().toString());
				JLabel genre = new JLabel(m.getGenre().toString());
			
				
			view.getGenre().add(title);
			view.getGenre().add(year);
			view.getGenre().add(genre);
			
				}
				
			}*/
			
		}

	}

	class fourthProfileListener implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			switchUser(model.getProfiles().get(3));

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
			
			
			String genre = itemView.getGenreText().getText();
			ArrayList <Genre>genreList = new ArrayList<Genre>();
			genreList.add(new Genre(genre));


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
			theMedia.setGenre(genreList);
			theMedia.setCast(null);
			model.addMediaItem(theMedia);
		//	mediaFactory.setDirectorOrCreator(theMedia, typeOfMedia);
			System.out.println(theMedia);
			



		}

	}

	public void CreateMedia() {

		System.out.println("Open add item View"); 
		itemView  = new AddItemView();
		itemView.saveButtonListener(new saveButtonListener()); 
		itemView.checkBoxListener(new checkBoxListener());
		System.out.println("Create new media");
		

	}







	public void updateView() {
		view.printProfile(model.getProfiles().toString());


	}
}


