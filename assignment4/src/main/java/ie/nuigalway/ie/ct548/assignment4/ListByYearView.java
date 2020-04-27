package ie.nuigalway.ie.ct548.assignment4;

import java.awt.GridLayout;
import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ListByYearView extends JFrame {

	private JFrame byYear;
	private JButton test;
	private JPanel titlePanel;
	private JPanel genrePanel;

	public ListByYearView(){

		byYear = new JFrame();
		byYear.setSize(500, 300);
		byYear.setVisible(true);
		byYear.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		byYear.setLayout(new GridLayout(0,2));

		titlePanel = new JPanel(new GridLayout(0,1));
		//JButton one = new JButton("Click");
		//titlePanel.add(one);
		
		genrePanel = new JPanel(new GridLayout(0,1));
		
		byYear.add(titlePanel);
		byYear.add(genrePanel);


	}




	public JPanel getTitlePanel() {
		return titlePanel;
	}




	public void setTitlePanel(JPanel titlePanel) {
		this.titlePanel = titlePanel;
	}




	public JPanel getGenrePanel() {
		return genrePanel;
	}

	public void setGenrePanel(JPanel genrePanel) {
		this.genrePanel = genrePanel;
	}


}

