package sets;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
	public static void main(String args[])
	{
		LinkedHashMap<String,Integer> map=new LinkedHashMap<String,Integer>();//create LinkedHashMap
		map.put("ONE",1);//add value to map
		map.put("TWO",2);
		map.put("THREE",3);
		map.put("FOUR",4);
		 for(Map.Entry m:map.entrySet()){    
		 System.out.println(m.getKey()+" "+m.getValue());   
		 }
	}

}
