package Chapter1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int a = 69/0;
//		System.out.println("a");
		
//		int[] arr = {1,2,3};
//		arr[5] = 4;
		
// 1. ArithmeticException
		try
		{
			int a = 69/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Math Error");
		}
		
// 2. NullPointerException
		try
		{
			String s = null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointer Error");
		}
		
// 3. NumberFormatException
		try
		{
			String s = "abc";
			int i = Integer.parseInt(s);
		}
		catch(NumberFormatException e)
		{
			System.out.println("NumberFormat Error");
		}
		
// 4. ArrayException
		try
		{
			int [] a = new int[5];
			a[10] = 50;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array Error");
		}
		
// 5. InputMismatchException
		try
		{
			System.out.println("Enter an integer: ");
			int userInput = sc.nextInt();
			System.out.println("You entred: " +userInput);
		}
		catch(InputMismatchException e)
		{
			System.out.println("InputMismatch Error. Enter valid Integer.");
		}
				
	}

}
