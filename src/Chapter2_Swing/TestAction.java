package Chapter2_Swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;

public class TestAction {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		JButton jb = new JButton("Click Here");
		
		jb.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			
				// Operation to be done
				
				JOptionPane.showMessageDialog(jf, "Button is clicked !");
				
			}
		} );
		
		jb.setBounds(143, 20, 200, 200);
		
		jf.getContentPane().add(jb);		
		jf.setSize(500, 500);
		jf.getContentPane().setLayout(null); // Absolute Layout 
		
		JCheckBox checkBox1 = new JCheckBox("Nepal");
		checkBox1.setBounds(20, 260, 98, 22);
		jf.getContentPane().add(checkBox1);
		
		JCheckBox checkBox2 = new JCheckBox("India");
		checkBox2.setBounds(20, 288, 98, 22);
		jf.getContentPane().add(checkBox2);
		
		JCheckBox checkBox3 = new JCheckBox("Canada");
		checkBox3.setBounds(20, 313, 98, 22);
		
		jf.getContentPane().add(checkBox3);
		
		JCheckBox checkBox4 = new JCheckBox("USA");
		checkBox4.setBounds(20, 338, 98, 22);
		jf.getContentPane().add(checkBox4);
		jf.setVisible(true); // Always in last
		
	}
}
