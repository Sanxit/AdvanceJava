package Chapter2_Swing;

import javax.swing.JFrame;

public class TestExtends extends JFrame{
	
	public TestExtends() 
	{
		
	}
	
	public static void main(String[] args) {
		
//		JFrame jf = new JFrame();
		
		TestExtends te = new TestExtends ();
		
		te.setVisible(true);
		te.setSize(500, 500);
		
	}

}
