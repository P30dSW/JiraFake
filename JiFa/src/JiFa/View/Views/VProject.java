package JiFa.View.Views;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import JiFa.View.LogicClient.ViewLogicClient;
import javax.swing.JFrame;

public class VProject extends JFrame implements ActionListener{

    private String nameProject, deadlineProject, descriptionProject, asigneeProject;


        JLabel titleLabel, projectNameLabel,  projectAssigneeLabel, projectDescriptionLabel,  projectDeadlineLabel, projectCreatorLabel;

        JTable taskTable;

        JButton createTaskButton;


        public VProject() {

            ViewLogicClient vlc = new ViewLogicClient();
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setSize(2000, 1500);
            this.setVisible(true);
            this.setTitle("FakeJira");
            this.setLayout(null);
            this.setResizable(false);

            titleLabel = createLabel("FakeJira", true);
            titleLabel.setBounds(5, 5, 5, 5);


            projectNameLabel = createLabel(nameProject, true);
            projectNameLabel.setBounds(5, 5, 5, 5);
            projectNameLabel.setText("Project: ");
            this.add(projectNameLabel);


            projectAssigneeLabel = createLabel(asigneeProject, true);
            projectAssigneeLabel.setBounds(5, 5, 5, 5);
            projectAssigneeLabel.setText("Assignee: ");
            this.add(projectAssigneeLabel);

            projectDescriptionLabel = createLabel("Project", true);
            projectDescriptionLabel.setBounds(5, 5, 5, 5);
            projectDescriptionLabel.setText("Description: ");
            this.add(projectDescriptionLabel);

            projectDeadlineLabel = createLabel("Project", true);
            projectDeadlineLabel.setBounds(5, 5, 5, 5);
            projectDeadlineLabel.setText("Deadline: ");
            this.add(projectDeadlineLabel);

            projectCreatorLabel = createLabel("Project", true);
            projectCreatorLabel.setBounds(5, 5, 5, 5);
            projectCreatorLabel.setText("Creator: ");
            this.add(projectCreatorLabel);


            taskTable = new JTable();
            JScrollPane scrollpane = new JScrollPane(taskTable);


            createTaskButton = new JButton("New Task!!");
            createTaskButton.addActionListener(this);

            setLayout(new BorderLayout());


        }

        private static JLabel createLabel(String caption, boolean isTitle) {
        JLabel label = new JLabel(caption);
        if(isTitle) {
            label.setFont(new Font("Garamond", Font.ITALIC+Font.BOLD, 16));
        }
        return label;
    }

        @Override
        public void actionPerformed(ActionEvent e) {
            // TODO Auto-generated method stub
        	
        	
        	
            if (e.getSource() == createTaskButton){
                VCreateTask ntask = new VCreateTask(1);
                 dispose();
            }

        }

    }
}
