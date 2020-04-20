package ie.nuigalway.ie.ct548.assignment4;

import java.awt.BorderLayout;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ProfileSelectionView {

	// View uses Swing framework to display UI to user
	 private JFrame frame;
	 private JButton Profile1Button;
	 private JButton Profile2Button;
	 private JButton Profile3Button;
	 private JButton Profile4Button;
	 
	 public ProfileSelectionView(String title) {
		  frame = new JFrame(title);
		  frame.getContentPane().setLayout(new BorderLayout());
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setSize(500, 120);
		  frame.setLocationRelativeTo(null);
		  frame.setVisible(true);
		  
		  
		  Profile1Button = new JButton("Profile1");
		  Profile2Button = new JButton("Profile2");
		  Profile3Button = new JButton("Profile3");
		  Profile4Button = new JButton("Profile4");
	 }
		  
		  public JFrame getFrame() {
			  return frame;
		  }
		  
		  public void serFrame(JFrame frame) {
			  this.frame = frame;
		  }
		  
		  public JButton getProfile1Button() {
			  return Profile1Button;
		  }
		  
		  public void setProfile1Button(JButton Profile1Button) {
			  this.Profile1Button = Profile1Button;
		  }
		  
		  public JButton getProfile2Button() {
			  return Profile2Button;
		  }
		  
		  public void setProfile2Button(JButton Profile2Button) {
			  this.Profile2Button = Profile2Button;
		  }
		  
		  public JButton getProfile3Button() {
			  return Profile3Button;
		  }
		  
		  public void setProfile3Button(JButton Profile3Button) {
			  this.Profile3Button = Profile3Button;
		  }
		  
		  public JButton getProfile4Button() {
			  return Profile4Button;
		  }
		  
		  public void setProfile4Button(JButton Profile4Button) {
			  this.Profile4Button = Profile4Button;
		  }
		  
		  
}
	 
	 
