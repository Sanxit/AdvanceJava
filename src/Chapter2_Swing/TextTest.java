package Chapter2_Swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class TextTest {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		JTextField jtf = new JTextField();
		JPasswordField jpf = new JPasswordField();
		JButton jb = new JButton("Signup");
		
		jtf.setBounds(135, 47, 215, 47);
		jpf.setBounds(135, 121, 215, 47);
		jb.setBounds(196, 186, 94, 47);
		
		jf.getContentPane().add(jtf);
		jf.getContentPane().add(jpf);
		jf.getContentPane().add(jb);
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		
		jf.setSize(500, 500);
		jf.getContentPane().setLayout(null);
		
		JLabel iblUsername = new JLabel("Username");
		iblUsername.setBounds(75, 63, 50, 14);
		jf.getContentPane().add(iblUsername);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(75, 137, 47, 14);
		jf.getContentPane().add(lblPassword);
		jf.setVisible(true);
		
	}
}
