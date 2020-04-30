package ie.nuigalway.ie.ct548.assignment4.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class DetailsPageView {

	

	private JFrame frame;
	private JCheckBox checkbox;
	private JButton Save;
	private JTextField titleText;
	private JTextField descriptionText;
	private JTextField yearText;
	private JTextField genreText;
	private JTextField directorText;
	private JTextField castText;

	public DetailsPageView() {
		JFrame frame = new JFrame("Add Item");
		frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		frame.setSize(350, 350);
		frame.setVisible(true);

		JPanel p = new JPanel();
		p.setLayout(new GridLayout(0,2));

		JLabel title = new JLabel();
		title.setText("Title");
		p.add(title);

		titleText = new JTextField();
		titleText.setEditable(false);
		p.add(titleText);


		JLabel Description = new JLabel("Description");
		p.add(Description);

		descriptionText = new JTextField();
		descriptionText.setText(" ");
		descriptionText.setEditable(false);
		p.add(descriptionText);

		JLabel Year = new JLabel("Year");
		p.add(Year);

		yearText = new JTextField();
		yearText.setEditable(false);
		p.add(yearText);

		
		JLabel Genre = new JLabel("Genre");
		p.add(Genre);

		genreText = new JTextField();
		genreText.setEditable(false);
		p.add(genreText);

		frame.add(p);

		JLabel Director = new JLabel("Director");
		p.add(Director);

		directorText = new JTextField();
		directorText.setEditable(false);
		p.add(directorText);
		
		JLabel Cast = new JLabel("Cast");
		p.add(Cast);

		castText = new JTextField();
		castText.setEditable(false);
		p.add(castText);
		
		checkbox = new JCheckBox("Tv Series");
		checkbox.setSelected(false);
		p.add(checkbox);
		
		Save = new JButton("Save");
		p.add(Save);
	}

	
	
	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}

	public JCheckBox getCheckbox() {
		return checkbox;
	}

	public void setCheckbox(JCheckBox checkbox) {
		this.checkbox = checkbox;
	}

	public JButton getSave() {
		return Save;
	}

	public void setSave(JButton save) {
		Save = save;
	}

	public JTextField getTitleText() {
		return titleText;
	}

	public void setTitleText(JTextField titleText) {
		this.titleText = titleText;
	}

	public JTextField getDescriptionText() {
		return descriptionText;
	}

	public void setDescriptionText(JTextField descriptionText) {
		this.descriptionText = descriptionText;
	}

	public JTextField getYearText() {
		return yearText;
	}

	public void setYearText(JTextField yearText) {
		this.yearText = yearText;
	}

	public JTextField getGenreText() {
		return genreText;
	}

	public void setGenreText(JTextField genreText) {
		this.genreText = genreText;
	}

	public JTextField getDirectorText() {
		return directorText;
	}

	public void setDirectorText(JTextField directorText) {
		this.directorText = directorText;
	}

	public JTextField getCastText() {
		return castText;
	}

	public void setCastText(JTextField castText) {
		this.castText = castText;
	}
}
