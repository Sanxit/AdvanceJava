package Chapter2_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TestButton {
	
	public static void main(String[] args) {
		
		JFrame jf=new JFrame("TestFrame");
		JButton jb = new JButton("Press Here");
		
        // Set action to Button
		
//		jb.setAction(new Ac);
		jf.add(jb);
		
		jb.setBounds(20, 30, 100, 100);
		
		jf.setVisible(true);
		jf.setSize(500, 500);
		jf.setLayout(null);
		
		}

}
