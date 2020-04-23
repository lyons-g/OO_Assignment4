package ie.nuigalway.ie.ct548.assignment4;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProfileSelectionView extends JFrame {

	private JFrame container;
	private JButton firstProfile;
	private JButton secondProfile;
	private JButton thirdProfile;
	private JButton fourthProfile;
	private JPanel containerPanel;
	private JPanel firstPanel;
	
	ProfileSelectionView(CatalogContainer cc){
		container = new JFrame();
	
		container.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		container.setSize(300, 200);
		container.setVisible(true);
		container.setLayout(new FlowLayout());
		
		Profile firstProfileData = cc.getProfiles().iterator().next();
		
		firstProfile = new JButton(firstProfileData.getName());
		secondProfile = new JButton("Second");
		thirdProfile = new JButton("Third Profile");
		fourthProfile = new JButton();
		
		containerPanel = new JPanel();
		containerPanel.add(firstProfile);
		containerPanel.add(secondProfile);
		containerPanel.add(thirdProfile);
		containerPanel.add(fourthProfile);
		
		container.add(containerPanel);
	}
	

	public void openFirstProfile(Profile profile) {
		JLabel first = new JLabel(profile.getName());
		containerPanel.setVisible(false);
		firstPanel = new JPanel();
		firstPanel.add(first);
		container.add(firstPanel);
	}
		
	void addFirstProfileListener(ActionListener listenForFirstProfileButton) {
		firstProfile.addActionListener(listenForFirstProfileButton);
	}
	
	
	void secondProfilerListener(ActionListener listenForSecond) {
		secondProfile.addActionListener(listenForSecond);
	}
	
	
	void thirdProfileListener(ActionListener listenForThird) {
		thirdProfile.addActionListener(listenForThird);
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
		
		
		
	/*	profilePanel.add(firstProfile);
		profilePanel.add(secondProfile);
		this.add(profilePanel);
		*/
	
	
	/*public void setFirstProfile(String Name1) {
		firstProfile.setText();
		
	//	setText("Profile 1");
	}
	
	public void setSecondProfile(String Name2) {
		firstProfile.setText();
	}

	*/
	
	public void printProfile(String profileName) {
		System.out.println(profileName);
	}

}



