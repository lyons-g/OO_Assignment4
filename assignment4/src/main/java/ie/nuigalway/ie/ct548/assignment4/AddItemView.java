package ie.nuigalway.ie.ct548.assignment4;

import java.awt.Checkbox;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class AddItemView {

	private JFrame frame;
	private JCheckBox checkbox;
	private JButton Save;
	private JTextField titleText;
	private JTextField descriptionText;
	private JTextField yearText;
	private JTextField genreText;
	private JTextField directorText;
	private JTextField castText;

	public AddItemView() {
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
		titleText.setEditable(true);
		p.add(titleText);


		JLabel Description = new JLabel("Description");
		p.add(Description);

		descriptionText = new JTextField();
		descriptionText.setText(" ");
		descriptionText.setEditable(true);
		p.add(descriptionText);

		JLabel Year = new JLabel("Year");
		p.add(Year);

		yearText = new JTextField();
		yearText.setEditable(true);
		p.add(yearText);

		
		JLabel Genre = new JLabel("Genre");
		p.add(Genre);

		genreText = new JTextField();
		genreText.setEditable(true);
		p.add(genreText);

		frame.add(p);

		JLabel Director = new JLabel("Director");
		p.add(Director);

		directorText = new JTextField();
		directorText.setEditable(true);
		p.add(directorText);
		
		JLabel Cast = new JLabel("Cast");
		p.add(Cast);

		castText = new JTextField();
		castText.setEditable(true);
		p.add(castText);
		
		checkbox = new JCheckBox("Tv Series");
		checkbox.setSelected(false);
		p.add(checkbox);
		
		Save = new JButton("Save");
		p.add(Save);
	}
	
	
	void saveButtonListener(ActionListener listenForSave) {
		Save.addActionListener(listenForSave);
	
	}
	
//	public String getTitle() {
	//	return titleText.getText();
	//}
		
	void checkBoxListener(ItemListener listenForCheckBox) {
		checkbox.addItemListener(listenForCheckBox);
	}
	
	public JTextField getTitleText() {
		return titleText;
	}


	public void setTitleText(JTextField titleText) {
		this.titleText = titleText;
	}


	public JCheckBox getCheckbox() {
		return checkbox;
	}


	public void setCheckbox(JCheckBox checkbox) {
		this.checkbox = checkbox;
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
