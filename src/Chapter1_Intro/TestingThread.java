package Chapter1_Intro;
import java.lang.Thread;

public class TestingThread extends Thread {
	
//	void aFunction() throws InterruptedException {
//		for(int i = 1; i <= 5; i++)
//		{
//			System.out.println(i);
//			Thread.sleep(1000);
//		}
//	}
	
	@Override // Thread SuperClass
	public void run() // Function in super class overridden
	{
		for(int i = 1; i <= 5; i++)
			{
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println(e.getMessage());
				}
			}
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		TestingThread T1 = new TestingThread();
		TestingThread T2 = new TestingThread();

//		T1.aFunction();
//		T2.aFunction();
		
		T1.start(); // start runs the run() Function
		T2.start();
	}

}
