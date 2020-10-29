package gitDemo;

public class start {

	public static void main(String[] args) {
		String str = "bixapathi";
		
		
		int len = str.length();
		
		for (int i = len-1; i >=0; i--) {
			char chars = str.charAt(i);
			System.out.print(chars);
		}
		
	}

}
