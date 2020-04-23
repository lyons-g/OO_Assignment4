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
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class AddItemView {

	private JFrame frame;
	private JCheckBox checkbox;
	private JButton Save;

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

		JTextField titleText = new JTextField(1);
		titleText.setText(" ");
		titleText.setEditable(true);
		p.add(titleText);


		JLabel Description = new JLabel("Description");
		p.add(Description);

		JTextField descriptionText = new JTextField();
		descriptionText.setText(" ");
		descriptionText.setEditable(true);
		p.add(descriptionText);

		JLabel Year = new JLabel("Year");
		p.add(Year);

		JTextField YearText = new JTextField();
		YearText.setText(" ");
		YearText.setEditable(true);
		p.add(YearText);

		
		JLabel Genre = new JLabel("Genre");
		p.add(Genre);

		JTextField GenreText = new JTextField();
		YearText.setText(" ");
		YearText.setEditable(true);
		p.add(GenreText);

		frame.add(p);

		JLabel Director = new JLabel("Director");
		p.add(Director);

		JTextField DirectorText = new JTextField();
		DirectorText.setText(" ");
		DirectorText.setEditable(true);
		p.add(DirectorText);
		
		JLabel Cast = new JLabel("Cast");
		p.add(Cast);

		JTextField CastText = new JTextField();
		CastText.setText(" ");
		CastText.setEditable(true);
		p.add(CastText);
		
		checkbox = new JCheckBox("Tv Series");
		p.add(checkbox);
		
		Save = new JButton("Save");
		p.add(Save);
	}
		
	
	void saveButtonListener(ActionListener listenForSave) {
		Save.addActionListener(listenForSave);
	}
		
	void checkBoxListener(ItemListener listenForCheckBox) {
		checkbox.addItemListener(listenForCheckBox);
	}

}
