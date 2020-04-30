package ie.nuigalway.ie.ct548.assignment4.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProfileSelectionView extends JFrame {

	private JFrame frame;
	private JButton firstProfile;
	private JButton secondProfile;
	private JButton thirdProfile;
	private JButton fourthProfile;

	
	public ProfileSelectionView(){
		frame = new JFrame("Profile Selection");
	
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 200);
		frame.setVisible(true);
		frame.setLayout(new GridLayout());
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		
		firstProfile = new JButton("First Profile");
		panel.add(firstProfile);
		secondProfile = new JButton("Second Profile");
		panel.add(secondProfile);
		thirdProfile = new JButton("Third Profile");
		panel.add(thirdProfile);
		fourthProfile = new JButton("Fourth Profile");
		panel.add(fourthProfile);
		
		frame.add(panel);
	}
	
	public void addFirstProfileListener(ActionListener listenForFirstProfileButton) {
		firstProfile.addActionListener(listenForFirstProfileButton);
	}
	
	
	public void secondProfilerListener(ActionListener listenForSecond) {
		secondProfile.addActionListener(listenForSecond);
	}
	
	
	public void thirdProfileListener(ActionListener listenForThird) {
		thirdProfile.addActionListener(listenForThird);
	}
	
	public void fourthProfileListener(ActionListener listenForThird) {
		fourthProfile.addActionListener(listenForThird);
	}
		

	
	public JButton getFirstProfile() {
		return firstProfile;
	}

	public void setFirstProfile(JButton firstProfile) {
		this.firstProfile = firstProfile;
	}

	public JButton getSecondProfile() {
		return secondProfile;
	}

	public void setSecondProfile(JButton secondProfile) {
		this.secondProfile = secondProfile;
	}

	public JButton getThirdProfile() {
		return thirdProfile;
	}

	public void setThirdProfile(JButton thirdProfile) {
		this.thirdProfile = thirdProfile;
	}

	public JButton getFourthProfile() {
		return fourthProfile;
	}

	public void setFourthProfile(JButton fourthProfile) {
		this.fourthProfile = fourthProfile;
	}

	public void printProfile(String profileName) {
		System.out.println(profileName);
	}

}



