package ie.nuigalway.ie.ct548.assignment4;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class VideoCatalogView extends JFrame {
	
	private JFrame frame;
	private JButton SwitchProfile;
	private JButton AddNew;
	private JButton ListByYear;
	private JButton ListByGenre;
	private JLabel title1;
	private JLabel title2;
	private JLabel title3;
	private JLabel title4;
	private JLabel title5;
	private JLabel year1;
	private JLabel year2;
	private JLabel year3;
	private JLabel year4;
	private JLabel year5;
	private JLabel userName;
	
	public VideoCatalogView(CatalogContainer cc) {
		JFrame frame = new JFrame("Video Catalog");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(500, 300);
		frame.setVisible(true);
		frame.setLayout(new GridLayout(0,4));
		
		JPanel btnPanel = new JPanel();
		btnPanel.setLayout(new GridLayout(4,1));
		
		AddNew = new JButton("Add New");
		ListByYear = new JButton("List by Year");
		ListByGenre = new JButton("List by Genre");
		
		
		//button Panel
		SwitchProfile = new JButton("Switch Profile");
		btnPanel.add(SwitchProfile);
		
		AddNew = new JButton ("Add New");
		btnPanel.add(AddNew);
		
		ListByYear = new JButton("List by Year");
		btnPanel.add(ListByYear);		

		ListByGenre = new JButton("List by Genre");
		btnPanel.add(ListByGenre);
		
		frame.add(btnPanel);
		
		
		JPanel titlePanel = new JPanel();
		titlePanel.setLayout(new GridLayout(6,1));
		
		JLabel space = new JLabel(" ");
		titlePanel.add(space);
		
		title1 = new JLabel("title1");
		titlePanel.add(title1);
		title2 = new JLabel("title2");
		titlePanel.add(title2);
		title3 = new JLabel("title3");
		titlePanel.add(title3);
		title4 = new JLabel("title4");
		titlePanel.add(title4);
		title5 = new JLabel("title5");
		titlePanel.add(title5);
		
		frame.add(titlePanel);
		
		
		JPanel yearPanel = new JPanel();
		yearPanel.setLayout(new GridLayout(6,1));
		JLabel space2 = new JLabel(" ");
		yearPanel.add(space2);
		year1 = new JLabel("year1");
		yearPanel.add(year1);
		year2 = new JLabel("year2");
		yearPanel.add(year2);
		year3 = new JLabel("year3");
		yearPanel.add(year3);
		year4 = new JLabel("year4");
		yearPanel.add(year4);
		year5 = new JLabel("year5");
		yearPanel.add(year5);
		
		frame.add(yearPanel);
		
		
		JPanel genrePanel = new JPanel();
		genrePanel.setLayout(new GridLayout(6,3));
		
		JLabel blank = new JLabel(" ");
		JLabel user = new JLabel("User Profile");
		userName = new JLabel(" ");
		genrePanel.add(blank);
		genrePanel.add(user);
		genrePanel.add(userName);
		
		JLabel genre1a = new JLabel("1a");
		genrePanel.add(genre1a);
		JLabel genre1b = new JLabel("1b");
		genrePanel.add(genre1b);
		JLabel genre1c = new JLabel("1c");
		genrePanel.add(genre1c);
		
		JLabel genre2a = new JLabel("2a");
		genrePanel.add(genre2a);
		JLabel genre2b = new JLabel("2b");
		genrePanel.add(genre2b);
		JLabel genre2c = new JLabel("2c");
		genrePanel.add(genre2c);
		
		JLabel genre3a = new JLabel("3a");
		genrePanel.add(genre3a);
		JLabel genre3b = new JLabel("3b");
		genrePanel.add(genre3b);
		JLabel genre3c = new JLabel("3c");
		genrePanel.add(genre3c);
		
		JLabel genre4a = new JLabel("4a");
		genrePanel.add(genre4a);
		JLabel genre4b = new JLabel("4b");
		genrePanel.add(genre4b);
		JLabel genre4c = new JLabel("4c");
		genrePanel.add(genre4c);
		
		JLabel genre5a = new JLabel("5a");
		genrePanel.add(genre5a);
		JLabel genre5b = new JLabel("5b");
		genrePanel.add(genre5b);
		JLabel genre5c = new JLabel("5c");
		genrePanel.add(genre5c);
		
		frame.add(genrePanel);
	}
	
		void switchProfileListener(ActionListener listenForSwitch) {
			SwitchProfile.addActionListener(listenForSwitch);
		}
		
		
		void addNewListener(ActionListener listenForAddNew) {
			AddNew.addActionListener(listenForAddNew);
		}
		
		void listByYearListener(ActionListener listenForByYear) {
		ListByYear.addActionListener(listenForByYear);
	}

		void listByGenre(ActionListener listenForByGenre) {
			ListByGenre.addActionListener(listenForByGenre);
		}
}

	

