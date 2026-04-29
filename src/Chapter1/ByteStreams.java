package Chapter1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreams {
	
	public static void main(String[] args) {
		
		try 
		{
			FileOutputStream fos = new FileOutputStream("outputBytes.txt");
			byte[] byteData;
			
			String message = "This is bytestram File";
			
			byteData = message.getBytes();
			// System.out.println(byteData[0]);
			
			fos.write(byteData);
			fos.close();
			
			FileInputStream fis = new FileInputStream("outputBytes.txt");
			
			int readData;
			while ((readData = fis.read()) != -1)
			{
				System.out.print((char) readData);
			}
			
			fis.close();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}