package sets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MapValueInsertExample {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();// create TreeMap
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String value = br.readLine();
			int num = Integer.parseInt(br.readLine());
			map.put(value,num);
		}
		/*System.out.println("before remove");
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
			}*/
		System.out.println("before remove");
		System.out.println(map);
		System.out.println("Enter the number of values to be removed");
		String s = br.readLine();
		map.remove(s);
		System.out.println("Enter the number of values to be add");
		String value1 = br.readLine();
		int addkey = Integer.parseInt(br.readLine());
		map.put(value1,addkey);
		System.out.println(map);
		

	}

}
