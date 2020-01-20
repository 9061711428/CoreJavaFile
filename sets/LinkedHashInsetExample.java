package sets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;


public class LinkedHashInsetExample {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		LinkedHashMap<Integer,String> map = new LinkedHashMap<Integer,String>();// create TreeMap
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
		int num = Integer.parseInt(br.readLine());
		String value = br.readLine();
		map.put(num,value);
		}
		int num1 = Integer.parseInt(br.readLine());
		//String value = br.readLine();
		map.remove(num1);
		System.out.println(map);
		System.out.println(map.size());
		
		}

}
