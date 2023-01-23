package n1;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

public class PizzaOrder extends JFrame {
	
	private static final double LARGE = 19.99;
	private static final double MEDIUM = 10.99;
	private static final double SMALL = 6.99;
	
	private static final double PEPORINI = 5.99;
	private static final double VEGGIES = 2.99;
	
	private double price;
	
	private ActionListener listner;
	
	private JPanel radioButtonPanel;
	private JPanel checkBoxPanel;
	
	private JPanel CenterPanel;
	
	private JRadioButton smallButton;
	private JRadioButton mediumButton;
	private JRadioButton largerButton;
	
	private JCheckBox pepperoniCheckCheckinBox;
	private JCheckBox veggiesCheckCheckinBox;
	
	private JTextField priceTextField;
	
	public PizzaOrder() {
		setSize(300,200);
		
		class PizzaSelectionListener implements ActionListener{
			
		
			@Override
			public void actionPerformed(ActionEvent e) {
				calculatePrice();
				
				
			}
			
		}
		PizzaSelectionListener listener = new PizzaSelectionListener();
		
		//radio button
		createRadioButtons();
		
		//check box
		createCheckBoxes();
		
		//design layout
		
		createLayout();
		
	}
	
	public void createRadioButtons()
	{
		radioButtonPanel = new JPanel();
		
		radioButtonPanel.setLayout(new GridLayout(3,1));
		
		radioButtonPanel.setBorder(new TitledBorder(new EtchedBorder(), "size"));
		
		smallButton = new JRadioButton("small");
		mediumButton = new JRadioButton("medium");
		largerButton = new JRadioButton("larger");
		
		ButtonGroup group = new ButtonGroup();
		
		
		group.add(smallButton);
		group.add(mediumButton);
		group.add(largerButton);
		
		smallButton.addActionListener(listner);
		mediumButton.addActionListener(listner);
		largerButton.addActionListener(listner);
		
		
		smallButton.setSelected(true);
		
		
		
		smallButton.addActionListener(listner);
		
		
		
		
		
	}
	
	public void createCheckBoxes()
	{
		checkBoxPanel = new JPanel();
		
		checkBoxPanel.setLayout(new GridLayout(3,1));
		
		checkBoxPanel.setBorder(new TitledBorder(new EtchedBorder(), "size"));
		
	
	
	
	
	

}
