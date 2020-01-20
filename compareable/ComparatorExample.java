-package compareable;

import java.util.*;

public class ComparatorExample {
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		List<Employee1> list=new LinkedList<Employee1>();//create a TreeMap
		Employee1[] emp=new Employee1[n];
		for(i=0;i<n;i++)
		{
		name=sc.next();
		age=sc.nextInt();
		emp[i]=new Employee1();
		emp[i].setAge(age);
		emp[i].setName(name);
		list.add(emp[i]);//add values into  hashmap
		}
		
		System.out.println("Name wise comparison");
		Collections.sort(list,new NameComparator());
		for(Employee1 e:list)
		System.out.println(e.getName()+" "+e.getAge());
		System.out.println("Age wise comparison");
		Collections.sort(list,new AgeComparator());
		for(Employee1 e:list)
		System.out.println(e.getName()+" "+e.getAge());
		
		sc.close();	
	}

}
class AgeComparator implements Comparator
{
	public int compare(Object o1,Object o2) 
	{
		Employee1 e1=(Employee1)o1;
		Employee1 e2=(Employee1)o2;
		if(e1.getAge()==e2.getAge())
		return 0;
		else if(e1.getAge()>e2.getAge())
			return 1;
		else
			return -1;
	}
	
}
class NameComparator implements Comparator<Employee1>
{
	public int compare(Employee1 o1,Employee1 o2)
	{
	Employee1 e1=(Employee1)o1;
	Employee1 e2=(Employee1)o2;
	return e1.getName().compareTo(e2.getName());
	}
}