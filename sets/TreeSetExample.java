package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TreeSetExample {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<5;i++)
		{
			list.add(sc.nextInt());
			
		}
		Set<Integer> set1=new HashSet<Integer>();
		set1.addAll(list);
		System.out.println(set1);
	}

}
