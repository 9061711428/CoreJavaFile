package exceptionhandling;
class Test extends Exception{}

public class ExceptionHandlingExample2 {
	public static void main(String args[])
	{
		try
		{
			throw new Test();//throw exception using throw keyword
			
		}
		catch(Test t)
		{
			System.out.println("Got the Test Exception");//catch exception
			
		}
		finally
		{
			System.out.println("Inside the finally block");	//finally block code is always executed whether an
															//an exception is occur or not.
		}
	}

}
