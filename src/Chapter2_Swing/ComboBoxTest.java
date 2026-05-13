package Chapter2_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ComboBoxTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComboBoxTest frame = new ComboBoxTest();
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
	public ComboBoxTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 675, 400);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 64, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] arrString = {"Nepal", "China", "India"};
		
		JComboBox<String> comboBox = new JComboBox<> (arrString);
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"Test1", "Test2", "Test3"}));
				
		comboBox.setBounds(178, 83, 305, 38);
		contentPane.add(comboBox);
		
		JLabel JLabel = new JLabel("CHOOSE A COUNTRY");
		JLabel.setBounds(277, 34, 206, 14);
		contentPane.add(JLabel);
		
		JButton JButton = new JButton("Confirm");
		JButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(contentPane, comboBox.getSelectedItem());
				
			}
		});
		JButton.setBounds(286, 161, 88, 22);
		contentPane.add(JButton);

	}
}
