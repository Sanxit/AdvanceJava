package Chapter2_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestFrame {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame("BUTTON");
		JButton jb = new JButton("CLICK HERE");
		
		jb.setBounds(70,122,125,30);
		
		jf.getContentPane().add(jb);
		jf.setSize(300,200);
		jf.getContentPane().setLayout(null);
		jf.setVisible(true);
		
	}

}
