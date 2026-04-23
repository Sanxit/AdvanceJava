package Chapter1;

// Interface is used for Abstraction
// Abstraction is ability to provide same function to multiple different operation

interface C
{
	// Can't create method body inside interface,
	// Only method signature - method title
	
	public void CFunction();
}

interface D
{
	public void DFunction();
}

// Implements -> extends
public class TestInterface implements C,D {
	
	@Override
	public void CFunction()
	{
		
	}
	
	@Override
	public void DFunction()
	{
		
	}
	
}
