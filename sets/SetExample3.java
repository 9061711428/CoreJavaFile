package sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetExample3
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Set<Integer> hashlist = new HashSet<Integer>();//create a set

		for (int i = 0; i < n; i++)
		{
			hashlist.add(sc.nextInt());//add elements to HashSet
		}
		
		System.out.println("numbers :" + hashlist);
		int n1 = sc.nextInt();
		hashlist.remove(n1);//remove a element
		System.out.println("After remove() :" + hashlist);
		Set<Integer> hashlist1 = new HashSet<Integer>();
		for (int i : hashlist) 
		{
			int num = i;
			int sqrt = (int) Math.sqrt(num);//find perfect numbers
			if ((sqrt * sqrt) == num) {
				hashlist1.add(num);
			}
		}
		hashlist.removeAll(hashlist1);//remove all perfect numbers                                                                                                                                                                                                                                                      
		System.out.println("Remove all perfect squares" + hashlist);
		hashlist.clear();
		System.out.println("After clear():" + hashlist);

	}

}
