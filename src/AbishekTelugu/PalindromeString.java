package AbishekTelugu;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String s = sc.next();
		
		String originalString = s;
		
		String rev ="";
		
		for(int i= s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);

		if(originalString.equals(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not polindrome");
		}
	}

}
