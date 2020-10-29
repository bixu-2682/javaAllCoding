package UstGLobal;

public class equalsOperator_Ddemo {

	public static void main(String[] args) {
		String s= "Hello";
		String r = "hello";
		
		if(s.equalsIgnoreCase(r))
		{
			System.out.println(".equal is used for Content comparision");
		}else {
			System.out.println("Both are not same");
		}	
	}
	
}
