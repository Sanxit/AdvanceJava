package Chapter1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReader {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("Output.txt");
			String Message = "Hello, Character Streams!";
			fw.write(Message);
			fw.close();
			
			BufferedReader br = new BufferedReader(new FileReader("Output.txt"));
			String line;
			
			while ((line = br.readLine()) != null) {
				System.out.println(line);				
			}
			
			br.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}