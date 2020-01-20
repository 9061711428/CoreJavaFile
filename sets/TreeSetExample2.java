package sets;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TreeSetExample2 {//example of hashmap using employee details
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		HashMap<Integer,Employee> map=new HashMap<Integer,Employee>();//create a TreeSet
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
		name=sc.next();
		age=sc.nextInt();
		emp[i]=new Employee();
		emp[i].setAge(age);
		emp[i].setName(name);
		map.put(i,emp[i]);//add values into  hashset
		}
		for(Map.Entry<Integer,Employee> m:map.entrySet()){ 
		Employee c=m.getValue();
		System.out.println(m.getKey()+" "+c.getName()+" "+c.getAge());   
		}
		sc.close();	
	}

}
