package JiFa.View.Views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import JiFa.View.LogicClient.ViewLogicClient;

/**
 * In dieser Klasse werden neue Projekte erstellt.
 * @author winkler, szeszak, grigoletti
 *
 */

public class VCreateProject extends JFrame implements ActionListener {

	private JButton cancel, finish;
	private JTextField nametxt, descriptiontxt, deadlinetxt, creatortxt, importancetxt, assigneetxt;
	private JLabel namelbl, descriptionlbl, deadlinelbl, creatorlbl, importancelbl, assigneelbl;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VCreateProject vct = new VCreateProject();
	}

	/**
	 * Buttonaktionen werden definiert. Finish: neues Projekt wird angelegt. cancel:
	 * erstellung wird abgebrochen.
	 */
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == finish) {
			String[] list = { "1", deadlinetxt.getText(), creatortxt.getText(), descriptiontxt.getText(),
					nametxt.getText(), importancetxt.getText(), assigneetxt.getText() };
			ViewLogicClient vlc = new ViewLogicClient();
			vlc.createProject(list);
			this.setVisible(false);
		}

		if (ae.getSource() == cancel) {
			this.setVisible(false);
		}

	}

	/**
	 * Designerstellung
	 */
	public VCreateProject() {

		finish = new JButton("Finish");
		finish.addActionListener(this);
		finish.setBounds(30, 250, 80, 30);
		this.add(finish);

		cancel = new JButton("Cancel");
		cancel.addActionListener(this);
		cancel.setBounds(130, 250, 80, 30);
		this.add(cancel);

		namelbl = new JLabel();
		namelbl.setBounds(5, 5, 100, 30);
		namelbl.setText("Projectname: ");
		this.add(namelbl);

		nametxt = new JTextField();
		nametxt.setBounds(110, 5, 100, 30);
		this.add(nametxt);

		descriptionlbl = new JLabel();
		descriptionlbl.setBounds(5, 45, 100, 30);
		descriptionlbl.setText("Description: ");
		this.add(descriptionlbl);

		descriptiontxt = new JTextField();
		descriptiontxt.setBounds(110, 45, 100, 30);
		this.add(descriptiontxt);

		deadlinelbl = new JLabel();
		deadlinelbl.setBounds(5, 85, 100, 30);
		deadlinelbl.setText("Deadline: ");
		this.add(deadlinelbl);

		deadlinetxt = new JTextField();
		deadlinetxt.setBounds(110, 85, 100, 30);
		this.add(deadlinetxt);

		creatorlbl = new JLabel();
		creatorlbl.setBounds(5, 125, 100, 30);
		creatorlbl.setText("Creator: ");
		this.add(creatorlbl);

		creatortxt = new JTextField();
		creatortxt.setBounds(110, 125, 100, 30);
		this.add(creatortxt);

		importancelbl = new JLabel();
		importancelbl.setBounds(5, 165, 100, 30);
		importancelbl.setText("Importance: ");
		this.add(importancelbl);

		importancetxt = new JTextField();
		importancetxt.setBounds(110, 165, 100, 30);
		this.add(importancetxt);

		assigneelbl = new JLabel();
		assigneelbl.setBounds(5, 205, 100, 30);
		assigneelbl.setText("Asignee: ");
		this.add(assigneelbl);

		assigneetxt = new JTextField();
		assigneetxt.setBounds(110, 205, 100, 30);
		this.add(assigneetxt);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(300, 400);
		this.setVisible(true);
		this.setTitle("New Project");
		this.setLayout(null);
		this.setResizable(false);
	}
}
