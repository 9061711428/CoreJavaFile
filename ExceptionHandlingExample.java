package exceptionhandling;

public class ExceptionHandlingExample 
{
	static void check() throws ArithmeticException 
	{
		System.out.println("Inside check function");
		throw new ArithmeticException("FACE Kollam");//try block throw arithmetic exception

	}
	public static void main(String args[]) {
		try 
		{
			check();
		} 
		catch (ArithmeticException e) //catch
		{
			System.out.println("caught " + e);
		}
	}
}
