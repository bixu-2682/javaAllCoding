 package OnlyInterView;

import java.util.HashMap;

public class StringExample {
	//input : bikshapathi
	//output: i, a (print duplicate characters)

	public static void main(String[] args) {
	
		duplicatecharactes("bixapathi");
	}
private static void duplicatecharactes(String str)
	{
	   HashMap<String, Integer> hm = new HashMap<>();
		String[] ss = str.split("");
		for (String tempS : ss) {
			if(hm.get(tempS)!=null) {
				hm.put(tempS, hm.get(tempS)+1);
			}else {
				hm.put(tempS, 1);
			}
		}
		System.out.println(hm);
	}
}
	