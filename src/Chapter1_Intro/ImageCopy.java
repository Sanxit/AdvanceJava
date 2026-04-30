package Chapter1_Intro;

// Exam Important
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageCopy {
	
	public static void main(String[] args) {
		
		try 
		{
			FileInputStream fis = new FileInputStream("Everest.jpg");
			byte[] imgBytes = fis.readAllBytes();
			// System.out.println(imgBytes[0]);
			fis.close();
			
			FileOutputStream fos = new FileOutputStream("Everest2.jpg");
			fos.write(imgBytes);
			fos.close();
			
			System.out.println("Copy Done! Refresh!!");
		} 
		
		catch (IOException e) 
		{
			
		}
		
	}

}
