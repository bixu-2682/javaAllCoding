package practicesDemo;


public class removeDuplicates {

	public static void main(String[] args) {
		String str = "bixaapaathi";
		System.out.println("The Given String is: " + str);
		System.out.println("After removing duplicate character the new String is: " + removeDuplicatesDemo(str));
	}
	
	public static String removeDuplicatesDemo(String str)
	{
		char[] arr1 = str.toCharArray();
		String tragetStr = "";
		
		for(char value: arr1) {
			if(tragetStr.indexOf(value)== -1)
			{
				tragetStr = tragetStr + value;
			}			
		}		
		return tragetStr;
	}		
}
