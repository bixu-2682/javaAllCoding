package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;


public class MapDemo {

	public static void main(String[] args) {
		LinkedHashMap map=new LinkedHashMap();  
		    //Adding elements to map  
		  map.put("Chiru", 700);
		  map.put("balaiah", 900);
		  map.put("venki", 500);
		  map.put("nagi", 600);
		    
		   System.out.println(map);
	System.out.println(map.put("Chiru", 5000));
	
	Set s = map.keySet();
	System.out.println(s);
	
	Collection c = map.values();
	System.out.println(c);
	
	Set s5 = map.entrySet();
	System.out.println(s5);
	
	
	Iterator iter  = s5.iterator();
	while(iter.hasNext()) {
		Map.Entry m5 = (Map.Entry)iter.next();
		//System.out.println(m5.getKey() + "....." + m5.getValue());
		if(m5.getKey().equals("nagi"))
		{
			m5.setValue(5000);
		}
		System.out.println(map);
	}
	}
}
