package Chapter2_Swing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class JTableDemo {
	
	public static void main(String[] args) {
		
		JFrame jf = new JFrame();
		
		jf.setTitle("JTable Example");
		
		String[] [] data = {
				{"Sanxit", "24031", "Lalitpur"},
				{"Rabi", "24031", "Kathmandu"}
		};
		
		String[] columnNames = {"Name", "ID", "Address"};
		
		JTable jt = new JTable(data, columnNames);
		jf.setBounds(30, 40, 150, 150);
		JScrollPane sp = new JScrollPane(jt);
		
		jf.add(sp);
		
		jf.setSize(500, 200);
		jf.setVisible(true);
		
	}

}
