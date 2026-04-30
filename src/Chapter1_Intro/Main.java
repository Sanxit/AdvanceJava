package Chapter1_Intro;

class Adder{
	// Function
	int add(int a, int b) {
		return a + b;
	}
}

class AdvancedAdder extends Adder{
	// Override Function
	@Override
	int add(int a, int b) {
		return super.add(a, b);
	}
	
}

public class Main {
	public static void main(String[] args) {		
		AdvancedAdder myAdvancedAdder = new AdvancedAdder();
		
		int result = myAdvancedAdder.add(2, 4);
		
		System.out.println("Sum of numbers: " +result);		
	}

}
