package JiFa.View.Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import JiFa.View.LogicClient.ViewLogicClient;

public class VCreateProject extends JFrame implements ActionListener {

	private JButton cancel, finish;
	private JTextField nametxt, descriptiontxt, deadlinetxt, creatortxt, importancetxt, asigneetxt;
	private JLabel namelbl, descriptionlbl, deadlinelbl, creatorlbl, importancelbl, asigneelbl;

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == finish) {
			String[] list = { "1", deadlinetxt.getText(), creatortxt.getText(), descriptiontxt.getText(),
					nametxt.getText(), importancetxt.getText(), asigneetxt.getText() };
			ViewLogicClient vlc = new ViewLogicClient();
			vlc.createProject(list);
			this.setVisible(false);
		}

		if (ae.getSource() == cancel) {
			this.setVisible(false);
		}

	}

	public VCreateProject() {

	}
}
