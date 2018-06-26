package JiFa.View.Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class VCreateProject extends JFrame implements ActionListener{
	
	private JButton cancel, finish;
	private JTextField name, description, date, creator
	private JLabel name, owner, description, deadline;
	
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == finish) {
			
		}
		
		if (ae.getSource() == cancel) {
			
		}
		
	}
	
	public VCreateProject() {
		
	}
}

