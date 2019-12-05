package abstraction;

public class Inheritclass extends Abstractclass {
	public void add(int a,int b)
	{
		System.out.println((a+b));
	}
	public void sub(int a,int b)
	{
		super.sub(a,b);
	}
}
