package JiFa.View.Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import JiFa.View.LogicClient.ViewLogicClient;

public class VCreateTask extends JFrame implements ActionListener {

	private int projectID;
	private JButton cancel, finish;
	private JTextField nametxt, descriptiontxt, deadlinetxt, creatortxt, importancetxt, asigneetxt;
	private JLabel namelbl, descriptionlbl, deadlinelbl, creatorlbl, importancelbl, asigneelbl;

	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == finish) {
			String[] list = { "1", deadlinetxt.getText(), creatortxt.getText(), descriptiontxt.getText(),
					nametxt.getText(), importancetxt.getText(), asigneetxt.getText() };
			ViewLogicClient vlc = new ViewLogicClient();
			vlc.createTask(list, this.projectID);
			this.setVisible(false);
		}

		if (ae.getSource() == cancel) {
			this.setVisible(false);
		}

	}

	public VCreateTask(int projectID) {
		this.projectID = projectID;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 700);
		this.setVisible(true);
		this.setTitle("New Task");
		this.setLayout(null);
		this.setResizable(false);
		
		namelbl = new JLabel();
		namelbl.setBounds(5, 5, 5, 5);
		namelbl.setText("Owner: ");
		this.add(namelbl);
		
		nametxt = new JTextField();
		nametxt.setBounds(10, 10, 10, 10);
		this.add(nametxt);
		
		
		descriptionlbl = new JLabel();
		descriptionlbl.setBounds(5, 5, 5, 5);
		descriptionlbl.setText("Description: ");
		this.add(descriptionlbl);
		
		descriptiontxt = new JTextField();
		descriptiontxt.setBounds(10, 10, 10, 10);
		this.add(descriptiontxt);
		
		
		deadlinelbl = new JLabel();
		deadlinelbl.setBounds(5, 5, 5, 5);
		deadlinelbl.setText("Deadline: ");
		this.add(deadlinelbl);
		
		deadlinetxt = new JTextField();
		deadlinetxt.setBounds(10, 10, 10, 10);
		this.add(deadlinetxt);
		
		
		creatorlbl = new JLabel();
		creatorlbl.setBounds(5, 5, 5, 5);
		creatorlbl.setText("Creator: ");
		this.add(creatorlbl);
		
		creatortxt = new JTextField();
		creatortxt.setBounds(10, 10, 10, 10);
		this.add(creatortxt);
		
		
		importancelbl = new JLabel();
		importancelbl.setBounds(5, 5, 5, 5);
		importancelbl.setText("Importance: ");
		this.add(importancelbl);
		
		importancetxt = new JTextField();
		importancetxt.setBounds(10, 10, 10, 10);
		this.add(importancetxt);
		
		
		asigneelbl = new JLabel();
		asigneelbl.setBounds(5, 5, 5, 5);
		asigneelbl.setText("Asignee: ");
		this.add(asigneelbl);
		
		asigneetxt = new JTextField();
		asigneetxt.setBounds(10, 10, 10, 10);
		this.add(asigneetxt);
		
		
		
		
	}
}