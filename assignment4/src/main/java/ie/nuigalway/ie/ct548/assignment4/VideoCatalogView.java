package ie.nuigalway.ie.ct548.assignment4;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

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
	private JPanel panel;
	private JPanel genre;
	
	public JPanel getGenre() {
		return genre;
	}

	public void setGenre(JPanel genre) {
		this.genre = genre;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	
	
	public JLabel getUserName() {
		return userName;
	}

	public void setUserName(JLabel userName) {
		this.userName = userName;
	}

	public VideoCatalogView(CatalogContainer cc) {
		frame = new JFrame("Video Catalog");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(800, 300);
		frame.setVisible(true);
		frame.setLayout(new BorderLayout());
		
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
		
		frame.add(btnPanel, BorderLayout.WEST);
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(1,3));
		userName = new JLabel();
		JLabel a = new JLabel(" ");
		JLabel b = new JLabel(" ");
		panel.add(a);
		panel.add(b);
		panel.add(userName);
		frame.add(panel, BorderLayout.NORTH);
		
		genre = new JPanel();
		genre.setLayout(new GridLayout(0,3));
		
		frame.add(genre, BorderLayout.CENTER);
		
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

	

