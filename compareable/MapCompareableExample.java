package compareable;

import java.util.*;
import compareable.Employee;
public class MapCompareableExample
{
	public static void main(String args[]) {
		
	int n,i;
	String name;
	int age;
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	TreeSet<Employee> set=new TreeSet<Employee>();//create a TreeMap
	Employee[] emp=new Employee[n];
	for(i=0;i<n;i++)
	{
	name=sc.next();
	age=sc.nextInt();
	emp[i]=new Employee();
	emp[i].setAge(age);
	emp[i].setName(name);
	set.add(emp[i]);//add values into  hashmap
	}
	for(Employee e:set) 
	System.out.println(e.getName()+" "+e.getAge());
	sc.close();	
}
}