package Chapter2_Swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class GridTest extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridTest frame = new GridTest();
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
	public GridTest() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 705, 401);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel border_panel = new JPanel();
		border_panel.setBounds(0, 0, 321, 257);
		contentPane.add(border_panel);
		border_panel.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("New button");
		border_panel.add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("New button");
		border_panel.add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("New button");
		border_panel.add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("New button");
		border_panel.add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("New button");
		border_panel.add(btnNewButton_4, BorderLayout.SOUTH);
		
		JPanel grid_panel = new JPanel();
		grid_panel.setBounds(370, 0, 321, 257);
		contentPane.add(grid_panel);
		grid_panel.setLayout(new GridLayout(3, 2));
		
		JButton btnNewButton_7 = new JButton("New button");
		grid_panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("New button");
		grid_panel.add(btnNewButton_8);
		
		JButton btnNewButton_6 = new JButton("New button");
		grid_panel.add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("New button");
		grid_panel.add(btnNewButton_9);
		
		JButton btnNewButton_5 = new JButton("New button");
		grid_panel.add(btnNewButton_5);
		
		JButton btnNewButton_10 = new JButton("New button");
		grid_panel.add(btnNewButton_10);

	}
}
