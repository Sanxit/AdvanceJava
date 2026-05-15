package Chapter3_Event;

import javax.swing.JButton;
import javax.swing.JFrame;

// Imp
public class ButtonCheck {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		JButton jb = new JButton("Click Me");
		
		// Add Action to Button using Delegated class.
		jb.addActionListener(new ListenerClass());
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		jf.add(jb);
		
		jf.setSize(300, 300);
		jb.setBounds(20, 20, 100, 100);
		jf.setLayout(null);
		jf.setVisible(true);
		
	}

}
