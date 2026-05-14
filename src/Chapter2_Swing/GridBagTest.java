package Chapter2_Swing;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagTest {
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("GridBagLayoutExample");
		frame.setSize(400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setLayout(new GridBagLayout());
		
		JButton button1 = new JButton("Button 1");
		JButton button2 = new JButton("Button 2");
		JButton button3 = new JButton("Button 3");
		JButton button4 = new JButton("Button 4");
		
		GridBagConstraints gbc1 = new GridBagConstraints();
		gbc1.gridx = 0;
		gbc1.gridy = 0;
		
		GridBagConstraints gbc2 = new GridBagConstraints();
		gbc2.gridx = 1;
		gbc2.gridy = 0;
		
		GridBagConstraints gbc3 = new GridBagConstraints();
		gbc3.gridx = 0; // Column 0
		gbc3.gridy = 1; // Row 1 
		
		gbc3.gridwidth = 2; // Span 2 columns
		// gbc3.gridheight = 2;
		
		GridBagConstraints gbc4 = new GridBagConstraints();
		gbc4.gridx = 2;
		gbc4.gridy = 0;
		
		frame.add(button1, gbc1);
		frame.add(button2, gbc2);
		frame.add(button3, gbc3);
		frame.add(button4, gbc4);
		
		frame.setVisible(true);
	}

}
