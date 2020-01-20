package sets;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsExample {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Set <Integer> set1=new HashSet<Integer>();//create set1
		System.out.println("Enter set1 elements");
		for(int i=0;i<5;i++)
		{
		set1.add(sc.nextInt());
		}
		Set <Integer> set2=new HashSet<Integer>();//set2
		System.out.println("Enter set2 elements");
		for(int i=0;i<5;i++)
		{
		set2.add(sc.nextInt());
		}
		Set <Integer> union=new HashSet<Integer>(set1);
		union.addAll(set2);//find union of set1 and set2
		System.out.println("Union of  Sets are :"+union);
		Set <Integer> intersection=new HashSet<Integer>(set1);
		intersection.retainAll(set2);//find intersection of set1 and set2
		System.out.println("intersection of  Sets are :"+intersection);
		Set <Integer> symmetricdif=new HashSet<Integer>(set1);
		symmetricdif.removeAll(set2);//find Symmetic difference of set1 and set2
		System.out.println("Symmetric difference of  Sets are :"+symmetricdif);
	}

}
