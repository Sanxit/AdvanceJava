package Chapter1_Intro;

// java.io is Important
import java.io.*;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreams {
	
	public static void main(String[] args) {
		
		try 
		{
			FileWriter fw = new FileWriter("output.txt");
			fw.write("This is output.");
			fw.close();
			
			FileReader fr = new FileReader(new File("output.txt"));
			int data;
			while( (data = fr.read()) != -1)
			{
				System.out.print( (char) data); // Casting
			}
			fr.close();
		} 
		
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

}
