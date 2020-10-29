package Collection_Interface;

import java.util.ArrayList;
import java.util.*;

public class List {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		System.out.println("initial size of the arraylist:"+al.size());
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"M");
		System.out.println(al);
		al.add("N");
		System.out.println(al);
		System.out.println("ArrayList size:"+al.size());
	}
}
