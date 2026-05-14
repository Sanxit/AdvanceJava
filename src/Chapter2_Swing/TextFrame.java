package Chapter2_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TextFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField jtf;
	private JPasswordField jpf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TextFrame frame = new TextFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TextFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 699, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel iblUsername = new JLabel("Username");
		iblUsername.setBounds(157, 144, 68, 14);
		contentPane.add(iblUsername);
		
		jtf = new JTextField();
		jtf.setBounds(235, 128, 215, 47);
		contentPane.add(jtf);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(157, 217, 68, 14);
		contentPane.add(lblPassword);
		
		JButton jb = new JButton("Signup");
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = jtf.getText();
				String password = jpf.getText();
				
				JOptionPane.showMessageDialog(null, "The Username is: "+username + " and the password is: "+password);
				
			}
		});
		
		jb.setBounds(295, 267, 94, 47);
		contentPane.add(jb);
		
		jpf = new JPasswordField();
		jpf.setBounds(235, 201, 215, 47);
		contentPane.add(jpf);
		
		JLabel lblSignup = new JLabel("SIGNUP");
		lblSignup.setBounds(319, 41, 47, 14);
		contentPane.add(lblSignup);

	}
}
