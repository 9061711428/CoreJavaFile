package abstraction;
import java.util.Scanner;
public class MainClassprgm {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b;
		a=sc.nextInt();
		b=sc.nextInt();
		Abstractclass obj=new Inheritclass();
		obj.add(a, b);
		obj.sub(a, b);
		sc.close();
	}
	

}
