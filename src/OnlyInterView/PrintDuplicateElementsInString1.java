package OnlyInterView;

import java.util.HashMap;

public class PrintDuplicateElementsInString1
{
	public static void main(String[] args)
	{
		PrintDuplicateElements("bixapathia");

	}

	private static void PrintDuplicateElements(String str) 
	{
		HashMap<Character, Integer> hm = new HashMap<>();
	
		for (int i = 0; i < str.length(); i++)
		{
		
			char c = str.charAt(i);
			if(hm.get(c)!= null)
			{
				hm.put(c, hm.get(c) + 1);
			}else
			{
				hm.put(c, 1);
			}
		}
		System.out.println("The Duplicate char are : " + hm);
	}
	
}
