package Collection_Interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
	ArrayList list = new ArrayList();
	for(int i=0; i<=10; i++) {
		list.add(i);
	}
    System.out.println(list);
    
    Iterator iter = list.iterator();
    while(iter.hasNext())
    {
    	Integer n = (Integer) iter.next();
    	if(n%2==0) 
    		System.out.println(n);
    	else
    		iter.remove();
    	    }
    System.out.println(list);
	}
}
