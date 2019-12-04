package myprogramz;
interface Example
{	
	void method1();
	void method2();
	void method3();
}

public class ExampleINterface implements Example{ 
	public void method1()
	{
	System.out.println("It is Method 1");
	}
	public void method2()
	{
	System.out.println("It is Method 2");
	}
	public void method3()
	{
	System.out.println("It is Method 3");
	}
	public static void main(String args[])
	
	{
		Example obj=new ExampleINterface();
		obj.method1();
		obj.method2();
		obj.method3();
		
	}
	
	

}
