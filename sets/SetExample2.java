package sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample2 {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Set<String> PopularCities=new HashSet<String>();
		if(PopularCities.isEmpty())
		{
			System.out.println("Is PopularCities set empty?:true");
			
		}
		for(int i=0;i<5;i++)
		{
			PopularCities.add(sc.next());
		}
		System.out.println("Number of cities in the HashSet "+PopularCities.size());
		if(PopularCities.contains("paris"))
		System.out.println("paris is in the popular cities set");
		
	}

}
