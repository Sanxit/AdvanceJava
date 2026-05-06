package Chapter2_Swing;

import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class CheckBox extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox frame = new CheckBox();
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
	public CheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 599, 405);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(128, 255, 128));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNewLabel = new JLabel("SELECT A COUNTRY");
		lblNewLabel.setBounds(234, 14, 116, 38);
		contentPane.add(lblNewLabel);

		JCheckBox CheckBox1 = new JCheckBox("Nepal");
		CheckBox1.setBounds(243, 60, 99, 23);
		contentPane.add(CheckBox1);

		JCheckBox CheckBox2 = new JCheckBox("China");
		CheckBox2.setBounds(243, 86, 99, 23);
		contentPane.add(CheckBox2);

		JCheckBox CheckBox3 = new JCheckBox("Canada");
		CheckBox3.setBounds(243, 112, 99, 23);
		contentPane.add(CheckBox3);

		JCheckBox CheckBox4 = new JCheckBox("USA");
		CheckBox4.setBounds(243, 138, 99, 23);
		contentPane.add(CheckBox4);

		// Button Group
		ButtonGroup bg = new ButtonGroup();
		bg.add(CheckBox1);
		bg.add(CheckBox2);
		bg.add(CheckBox3);
		bg.add(CheckBox4);

		JButton jb = new JButton("Select");
		jb.setBackground(new Color(0, 0, 255));
		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (CheckBox1.isSelected()) {
					JOptionPane.showMessageDialog(null, CheckBox1.getText());
				}

				if (CheckBox2.isSelected()) {
					JOptionPane.showMessageDialog(null, CheckBox2.getText());
				}

				if (CheckBox3.isSelected()) {
					JOptionPane.showMessageDialog(null, CheckBox3.getText());
				}

				if (CheckBox4.isSelected()) {
					JOptionPane.showMessageDialog(null, CheckBox4.getText());
				}
			}
		});

		jb.setBounds(217, 168, 150, 71);
		contentPane.add(jb);

	}
}