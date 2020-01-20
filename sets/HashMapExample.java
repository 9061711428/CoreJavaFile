package sets;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExample {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,String> map=new HashMap<Integer,String>();//create LinkedHashMap
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		int roll=sc.nextInt();
		String value=sc.next();
		map.put(roll, value);
		}
		System.out.println(map);
		System.out.println("enter the value to be search");
		String a=sc.next();
		if(map.containsValue(a))//search value is present or not
		System.out.println("the value is present");
		System.out.println("enter the key to be search");
		int b=sc.nextInt();
		if(map.containsKey(b))
			System.out.println("the key is present");
		/*for(Map.Entry m:map.entrySet()){    
		System.out.println(m.getKey()+" "+m.getValue());   
		 }*/
	}

}
