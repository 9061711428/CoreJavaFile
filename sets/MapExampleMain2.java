package sets;

import java.util.Scanner;
import java.util.TreeSet;

public class MapExampleMain2 {
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		TreeSet<Employee> hashset=new TreeSet<Employee>();//create a TreeSet
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
		name=sc.next();
		age=sc.nextInt();
		emp[i]=new Employee();
		emp[i].setAge(age);
		emp[i].setName(name);
		hashset.add(emp[i]);//add values into  hashset
		}
		for(Employee e:hashset)
		System.out.println(e.getName()+" "+e.getAge());
		sc.close();	
	}

}
