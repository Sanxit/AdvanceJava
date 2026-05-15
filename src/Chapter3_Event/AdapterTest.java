package Chapter3_Event;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class AdapterTest {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("My Frame");
		
		frame.addMouseListener(new MouseAdapter() {
			
			public void mousePressed(MouseEvent e) {
				System.out.println("Mouse being Pressed");
			}
			
			public void mouseReleased(MouseEvent e) {
				System.out.println("Mouse being Released");
			}
			
		});
		
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(300, 300);
		frame.setLayout(null);
		frame.setVisible(true);
		
	}

}
