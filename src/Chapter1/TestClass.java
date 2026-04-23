package Chapter1;

class A
{
	void AFunction()
	{
		System.out.println("I'm A Function");
	}
}

class B
{
	void BFunction()
	{
		System.out.println("I'm B Function");
	}
}

public class TestClass extends A{
	
	@Override // This is Parent Class Function
	void AFunction() {
		super.AFunction(); // Calling Parent Class Method
		System.out.println("I'm child Function of A");
	}
	
	public static void main(String[] args) {
		TestClass T1 = new TestClass();
		
		T1.AFunction();
	}

}
