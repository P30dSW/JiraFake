package JiFa.View.Views;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.*;

import JiFa.Logic.Management.AbstractMedium;
import JiFa.View.LogicClient.ViewLogicClient;
import com.sun.glass.events.WindowEvent;

import javax.swing.JFrame;

public class VProject extends JFrame implements ActionListener{

    private String nameProject;
    private String deadlineProject;
    private String descriptionProject;


        JLabel titleLabel;
        JLabel projectNameLabel;
        JLabel projectAsigneeLabel;
        JLabel projectDescriptionLabel;
        JLabel projectDeadlineLabel;
        JLabel projectCreatorLabel;

        JTable taskTable;


        public VProject() {

            private project = vlc.getProject();

            titleLabel = createLabel("FakeJira", true);

            projectNameLabel = createLabel("Name", true);

            projectAsigneeLabel = createLabel("Project", true);

            projectDescriptionLabel = createLabel("Project", true);

            projectDeadlineLabel = createLabel("Project", true);

            projectCreatorLabel = createLabel("Project", true);


            taskTable = new JTable();

            createTaskButton = new JButton("New Task!!");
            createTaskButton.addActionListener(this);


            setLayout(new BorderLayout());

            titlePanel.setLayout(new BorderLayout());
            numberPeoplePanel.setLayout(new GridLayout(2, 1));
            radioPanel.setLayout(new GridLayout(2, 1));
            radioButtonPanel.setLayout(new GridLayout(3, 1));
            weiterPanel.setLayout(new BorderLayout());
            everythingPanel.setLayout(new BorderLayout());

            choicePanel.add(numberPeoplePanel, BorderLayout.NORTH);
            choicePanel.add(radioPanel, BorderLayout.SOUTH);

            titlePanel.add(titleLabel, BorderLayout.CENTER);
            numberPeoplePanel.add(numberPeopleLabel, BorderLayout.CENTER);
            numberPeoplePanel.add(numberPeopleField, BorderLayout.EAST);
            radioPanel.add(radioLabel);
            radioPanel.add(radioButtonPanel);
            radioButtonPanel.add(radioButton1);
            radioButtonPanel.add(radioButton2);
            radioButtonPanel.add(radioButton3);
            weiterPanel.add(weiterButton);

            add(everythingPanel, BorderLayout.CENTER);

            setSize(300,550);
            setTitle("Foodinator");
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }

        public static void main(String[] args) {
            Start s = new Start();
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
            if (e.getSource() == weiterButton){
                Food f = new Food(foodTime, numberPeopleField.getText());
                System.out.println(f.getPeopleNum());
                Ingredients ingredients = new Ingredients(f, f.getPeopleNum()-1);
                numberPeopleField.setText("");
                dispose();
            } else if (e.getSource() == radioButton1) {
                radioButton2.setEnabled(false);
                radioButton3.setEnabled(false);
                this.foodTime = "Breakfast";

            } else if (e.getSource() == radioButton2) {
                radioButton1.setEnabled(false);
                radioButton3.setEnabled(false);
                this.foodTime = "Lunch";

            } else if (e.getSource() == radioButton3) {
                radioButton1.setEnabled(false);
                radioButton2.setEnabled(false);
                this.foodTime = "Dinner";
            }

        }

    }
}
