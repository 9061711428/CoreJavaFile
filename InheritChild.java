package myprogramz;
import java.util.Scanner;
public class InheritChild extends Inheritparent {//child class
	public void add(int a,int b)
	{
		int sum=a+b;
		System.out.println("sum is\t:"+sum);
	}
	public static void main(String args[]) {
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number");
		b=sc.nextInt();
		Inheritparent obj=new InheritChild();
		obj.add(a, b);
		
		
	}

}


class Inheritparent {//parent class
	public void add(int a,int b)
	{
		int sum=a+b+10;
		System.out.println("sum is\t:"+sum);
	}

}



	
	



