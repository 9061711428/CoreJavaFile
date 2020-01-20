package sets;

import java.util.Map;
import java.util.TreeMap;

public class MapExample1 {
	public static void main(String args[])
	{
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();//create TreeMap
		map.put(1,"Amit");//add to map using put()
		map.put(5,"Rahul");
		map.put(2,"jai");
		map.put(6,"Amit");
		 for(Map.Entry m:map.entrySet()){    
		 System.out.println(m.getKey()+" "+m.getValue());   
		 }
	}
		 

}
