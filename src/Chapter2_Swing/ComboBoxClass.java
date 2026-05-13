package Chapter2_Swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

// Exam Important

public class ComboBoxClass {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.getContentPane().setBackground(new Color(0, 128, 192));
		
		String[] countryNames = {"Nepal", "China"};
		JComboBox<String> countryComboBox = new JComboBox<>(countryNames);
		
		JLabel jl = new JLabel("CHOOSE A COUNRTY");
		
		countryComboBox.setBounds(83, 120, 120, 39);
		
		jl.setBounds(86, 81, 190, 14);
		jf.getContentPane().add(jl);
		jf.getContentPane().add(countryComboBox);
		
		jf.getContentPane().setLayout(null);
		
		JButton JButton = new JButton("Click");
		JButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jf, countryComboBox.getSelectedItem());
			}
		});
		
		JButton.setBounds(83, 183, 120, 45);
		jf.getContentPane().add(JButton);
		jf.setSize(300, 500);
		jf.setVisible(true);
		
	}

}
