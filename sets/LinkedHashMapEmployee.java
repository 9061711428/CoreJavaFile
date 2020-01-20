package sets;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;//Example of linked map

public class LinkedHashMapEmployee {
	public static void main(String args[])
	{
		int n,i;
		String name;
		int age;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		LinkedHashMap<Integer,Employee> map=new LinkedHashMap<Integer,Employee>();//create a HashMap
		Employee[] emp=new Employee[n];
		for(i=0;i<n;i++)
		{
		name=sc.next();
		age=sc.nextInt();
		emp[i]=new Employee();
		emp[i].setAge(age);
		emp[i].setName(name);
		map.put(i,emp[i]);//add values into  hashmap
		}
		for(Map.Entry<Integer,Employee> m:map.entrySet()){ 
		Employee c=m.getValue();
		System.out.println(m.getKey()+" "+c.getName()+" "+c.getAge());   
		}
		sc.close();	
	}


}
