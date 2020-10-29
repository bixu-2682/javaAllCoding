package OnlyInterView;

public class PrintDuplicateElementsInString {
	public static void main(String[] args) {
		DuplicateElementsInString("Seleniumjavaaa");
	}

	private static void DuplicateElementsInString(String str) {
		char chars[] = str.toCharArray();
		System.out.println("The string is:" + str);
	      System.out.print("Duplicate Characters in above string are: ");

		for (int i = 0; i < str.length(); i++) 
		{
			for (int j = i+1; j < str.length(); j++) 
			{
				if(chars[i]==chars[j])
				{
					System.out.println(chars[j]);
					break;
				}
				
			}
			
		}
	}
}
