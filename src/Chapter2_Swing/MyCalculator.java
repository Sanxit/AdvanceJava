package Chapter2_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MyCalculator extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyCalculator frame = new MyCalculator();
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
	public MyCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 504, 494);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel textPanel = new JPanel();
		textPanel.setBounds(10, 44, 470, 67);
		contentPane.add(textPanel);
		textPanel.setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setBounds(0, 0, 470, 67);
		textPanel.add(txtResult);
		txtResult.setColumns(10);
		
		JLabel lblNew = new JLabel("CALCULATOR");
		lblNew.setBounds(211, 11, 158, 14);
		contentPane.add(lblNew);
		
		JPanel gridPanel = new JPanel();
		gridPanel.setBounds(10, 122, 470, 324);
		contentPane.add(gridPanel);
		gridPanel.setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.setBounds(1, 2, 117, 64);
		gridPanel.add(btnNewButton);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.setBounds(118, 2, 117, 64);
		gridPanel.add(btnNewButton_4);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.setBounds(235, 2, 117, 64);
		gridPanel.add(btnNewButton_8);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.setBounds(352, 2, 117, 64);
		gridPanel.add(btnNewButton_12);
		
		JButton btnNewButton_11 = new JButton("4");
		btnNewButton_11.setBounds(1, 66, 117, 64);
		gridPanel.add(btnNewButton_11);
		
		JButton btnNewButton_10 = new JButton("5");
		btnNewButton_10.setBounds(118, 66, 117, 64);
		gridPanel.add(btnNewButton_10);
		
		JButton btnNewButton_9 = new JButton("6");
		btnNewButton_9.setBounds(235, 66, 117, 64);
		gridPanel.add(btnNewButton_9);
		
		JButton btnNewButton_7 = new JButton("*");
		btnNewButton_7.setBounds(352, 66, 117, 64);
		gridPanel.add(btnNewButton_7);
		
		JButton btnNewButton_6 = new JButton("7");
		btnNewButton_6.setBounds(1, 130, 117, 64);
		gridPanel.add(btnNewButton_6);
		
		JButton btnNewButton_5 = new JButton("8");
		btnNewButton_5.setBounds(118, 130, 117, 64);
		gridPanel.add(btnNewButton_5);
		
		JButton btnNewButton_1 = new JButton("9");
		btnNewButton_1.setBounds(235, 130, 117, 64);
		gridPanel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("-");
		btnNewButton_2.setBounds(352, 130, 117, 64);
		gridPanel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton(".");
		btnNewButton_3.setBounds(1, 194, 117, 64);
		gridPanel.add(btnNewButton_3);
		
		JButton btnNewButton_13 = new JButton("0");
		btnNewButton_13.setBounds(118, 194, 117, 64);
		gridPanel.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("+");
		btnNewButton_14.setBounds(235, 194, 117, 64);
		gridPanel.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.setBounds(352, 194, 117, 64);
		gridPanel.add(btnNewButton_15);
		
		JButton btnClear = new JButton("Clear");
		btnClear.setBounds(1, 258, 468, 64);
		gridPanel.add(btnClear);

	}

}
