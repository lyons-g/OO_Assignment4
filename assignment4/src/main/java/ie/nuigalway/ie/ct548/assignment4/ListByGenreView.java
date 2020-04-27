package ie.nuigalway.ie.ct548.assignment4;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ListByGenreView {
	

	private JFrame byGenre;
	private JPanel titlePanel;
	private JPanel genrePanel;

	public ListByGenreView() {
		
	byGenre = new JFrame();
	byGenre.setSize(500, 300);
	byGenre.setVisible(true);
	byGenre.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
	byGenre.setLayout(new BorderLayout()); 
	
	//titlePanel = new JPanel(new GridLayout(0,1));
	
	genrePanel = new JPanel(new GridLayout(0,2));
	
	
	//byGenre.add(titlePanel, BorderLayout.CENTER);
	byGenre.add(genrePanel, BorderLayout.CENTER);
}

	
	public JFrame getByGenre() {
		return byGenre;
	}

	public void setByGenre(JFrame byGenre) {
		this.byGenre = byGenre;
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