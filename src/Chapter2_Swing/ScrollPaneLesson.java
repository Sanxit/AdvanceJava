package Chapter2_Swing;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ScrollPaneLesson {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		jf.setSize(200, 300);
		
		JButton jb = new JButton("CLICK");
		jb.setBounds(1, 1, 200, 500);
		
		JPanel jp = new JPanel();
		jp.setPreferredSize(new Dimension(200, 600));
		jp.setLayout(null);
		jp.add(jb);
		
		JScrollPane sp = new JScrollPane(jp);
		jf.add(sp);
		jf.setVisible(true);
		
	}

}
