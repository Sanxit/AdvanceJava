package Chapter3_Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ListenerObject {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JButton jb = new JButton("Click");
		
		// Listener Object Creation		
		// jb.addActionListener(Listener Object); 
		
		ActionListener alobj = new ActionListener() {
	
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(jf, "Button Clicked");
			}
		};
		
		jb.addActionListener(alobj); // Standard EH
		
		jf.setSize(500, 500);
		jb.setBounds(20, 20, 200, 200);
		
		jf.add(jb);
		
		jf.setLayout(null);
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}