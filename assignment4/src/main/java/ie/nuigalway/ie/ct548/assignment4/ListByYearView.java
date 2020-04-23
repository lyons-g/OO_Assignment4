package ie.nuigalway.ie.ct548.assignment4;

import java.awt.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ListByYearView extends JFrame {

	private JFrame byYear;
	private JButton test;
	private JPanel cp;


	ListByYearView(){
		
		byYear = new JFrame();
		byYear.setSize(300, 300);
		byYear.setVisible(true);
		byYear.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		
		//CatalogContainer cc = new CatalogContainer();
		cp = new JPanel();
		test = new JButton("Test");
		
		cp.add(test);
		byYear.add(cp);
		
		

	}
	

}

