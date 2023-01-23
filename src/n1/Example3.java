package n1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame("Calculator");
		frame.setSize(350, 300);
		frame.setDefaultCloseOperation(3);

		JLabel number1Label = new JLabel("Enter first number");
		JLabel number2Label = new JLabel("Enter second number");
		JTextField number1Field = new JTextField(10);
		JTextField number2Field = new JTextField(10);

		JLabel resultLabel = new JLabel();

		JButton addButton = new JButton("Add");
		JButton subtractButton = new JButton("Subtract");
		JButton divideButton = new JButton("Divide");
		JButton multiplyButton = new JButton("Multiply");

		JPanel number1Panel = new JPanel();
		JPanel number2Panel = new JPanel();
		JPanel buttonsPanel = new JPanel();
		JPanel resultPanel = new JPanel();
		JPanel mainPanel = new JPanel();

		
		BoxLayout box1Lyout1 = new BoxLayout(number1Panel, BoxLayout.X_AXIS);
		BoxLayout box1Lyout2 = new BoxLayout(number2Panel, BoxLayout.X_AXIS);
		BoxLayout buttonsLyout1 = new BoxLayout(buttonsPanel, BoxLayout.X_AXIS);
		
		number1Panel.setLayout(box1Lyout1);
		number2Panel.setLayout(box1Lyout2);
		buttonsPanel.setLayout(buttonsLyout1);
	
			
		number1Panel.add(number1Label);
		number1Panel.add(number1Field);

		number2Panel.add(number2Label);
		number2Panel.add(number2Field);

		buttonsPanel.add(addButton);
		buttonsPanel.add(subtractButton);
		buttonsPanel.add(divideButton);
		buttonsPanel.add(multiplyButton);

		resultPanel.add(resultLabel);

		mainPanel.add(number1Panel);
		mainPanel.add(number2Panel);
		mainPanel.add(buttonsPanel);
		mainPanel.add(resultPanel);

		frame.add(mainPanel);

		frame.setVisible(true);

		ActionListener a1 = new ActionListener()

		{
			public void actionPerformed(ActionEvent ae) {
				if (ae.getSource() == addButton) {
					double result = Double.parseDouble(number1Field.getText())
							+ Double.parseDouble(number2Field.getText());

					resultLabel.setText("the result is " + result);
				}

				else if (ae.getSource() == subtractButton) {
					double result = Double.parseDouble(number1Field.getText())
							- Double.parseDouble(number2Field.getText());

					resultLabel.setText("the result is " + result);

				}

				else if (ae.getSource() == multiplyButton) {

					double result = Double.parseDouble(number1Field.getText())
							* Double.parseDouble(number2Field.getText());

					resultLabel.setText("the result is " + result);
				} else if (ae.getSource() == divideButton)

				{

					double result = Double.parseDouble(number1Field.getText())
							/ Double.parseDouble(number2Field.getText());

					resultLabel.setText("the result is " + String.format("%.2f", result));
				}

			}
		};

		addButton.addActionListener(a1);
		subtractButton.addActionListener(a1);
		multiplyButton.addActionListener(a1);
		divideButton.addActionListener(a1);

	}

}
