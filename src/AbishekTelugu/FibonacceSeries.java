package AbishekTelugu;

import java.util.Scanner;

//1  2 	3  5 8 13
class FibonacceSeries {
	static int n1 =0 , n2=1 ,  n3=0;
 
	 static void fibonacci(int num) {	
		if(num>0) {
			n3= n1 +n2; 
			n1 = n2;
			n2 = n3;			
			System.out.print(" " + n3);
			fibonacci(num-1);
     }
 }	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int a= sc.nextInt();
				
		System.out.print(n1+" " + n2);
		fibonacci(a-2);
	}
}
