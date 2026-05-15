package Chapter3_Event;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

// Delegated class
// Delegation is the process where one object hands over responsibility to another object to perform a task.

public class ListenerClass implements ActionListener{

	public void actionPerformed(ActionEvent e) {
		
		JOptionPane.showMessageDialog(null, "Button Clicked");
		
	}

}
