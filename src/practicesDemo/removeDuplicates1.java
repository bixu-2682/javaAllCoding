package practicesDemo;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicates1 {
	public static void main(String[] args) {
		String str = "bixapathi";
		System.out.println(removeDuplicatesDemo(str));
	}
	
	public static String removeDuplicatesDemo(String str)
	{
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		
		for(int i=0; i<str.length(); i++) 
		{
			Character c = str.charAt(i);  //str.charAt(0) -->b
			if(!set.contains(c))         //If 'b' is not present in hashSet
			{
				set.add(c);              //Add b to the set
				sf.append(c);			//b
			}
		}		
		return sf.toString();
	}
}
