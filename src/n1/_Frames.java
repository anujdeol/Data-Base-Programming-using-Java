package n1;

import javax.swing.*;

public class _Frames {

	public static void main(String[] args) {
    JFrame frame = new JFrame("Myframe");
    JPanel panel = new JPanel();
    JButton btOK = new JButton("ok");
    JButton cncl = new JButton("cancel");
    panel.add(cncl);
    panel.add(btOK);
    frame.add(panel);
    
    frame.setSize(250, 350);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLocationRelativeTo(null);
    frame.setVisible(true);
    

	}

}
