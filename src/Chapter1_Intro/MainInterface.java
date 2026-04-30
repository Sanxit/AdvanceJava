package Chapter1_Intro;

interface AdderInterface{
	int add (int a, int b);
}

class AdvancedAdderInterface implements AdderInterface{
	public int add(int a, int b) {
		
	return a + b;
	}
}

public class MainInterface {
	public static void main(String[] args) {
		AdvancedAdderInterface myAdvancedAdderInterface = new AdvancedAdderInterface();
		
		int result = myAdvancedAdderInterface.add(2, 4);
		
		System.out.println("Sum of numbers: " +result);
	}

}
