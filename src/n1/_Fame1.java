package n1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class _Fame1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("New  Display");
		frame.setDefaultCloseOperation(3);
		frame.setSize(300, 250);

		JLabel nameLabel = new JLabel("First name");
		JLabel lastLabel = new JLabel("last name");
		JTextField nameField = new JTextField(20);
		JTextField LastNameField = new JTextField(20);

		JLabel resultLabel = new JLabel("Welcome");
		JButton submitButton = new JButton("submit");

		JPanel panel = new JPanel();
		frame.add(panel);
		panel.add(nameLabel);
		panel.add(nameField);
		panel.add(lastLabel);
		panel.add(LastNameField);
		panel.add(resultLabel);
		panel.add(submitButton);
	
		frame.setVisible(true);
		frame.setResizable(false);
		
		

		
		 ActionListener al=new ActionListener()
	        {
	            public void actionPerformed(ActionEvent ae)
	            {
	                resultLabel.setText("Hello "+ nameField.getText()+ " "+ LastNameField.getText());
	            }
	            
	        };
	        
	        submitButton.addActionListener(al);
	    }
	    
	}
