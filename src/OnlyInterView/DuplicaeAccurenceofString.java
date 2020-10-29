package OnlyInterView;

import java.util.HashMap;
import java.util.Iterator;

public class DuplicaeAccurenceofString {	
	
	public static void main(String[] args) {
		findDuplicateWords("I am bixapathi I am selenium java and java I i ");
	}
	private static void findDuplicateWords(String str) {
		String[] ss = str.split(" ");
		
		HashMap<String, Integer> hm = new HashMap<>();
		for (String tempstring : ss) {
			if(hm.get(tempstring)!=null) {
				hm.put(tempstring, hm.get(tempstring)+ 1);
			}else			{
			hm.put(tempstring, 1);
			}
		}
		//System.out.println(hm);
		Iterator<String> tempString = hm.keySet().iterator();
		while(tempString.hasNext())
		{
			String temp= tempString.next();
			if(hm.get(temp) > 1)
			{
				System.out.println("the word  " + temp + " appered " + hm.get(temp) + " no.of times.");
			}
		}
	}	
}
