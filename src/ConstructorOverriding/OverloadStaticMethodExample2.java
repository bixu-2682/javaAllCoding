package ConstructorOverriding;

public class OverloadStaticMethodExample2 {
	//static method  
	public static void sum(int a, int b)   
	{   
	int c=a+b;  
	System.out.println("The sum is: "+c);   
	}   
	
	//non-static method   
	public void sum(int a, int b)   
	{   
	int c=a+b;  
	System.out.println("The sum is: "+c);   
	} 
	//main method
	public static void main(String[] args) {
		//calling static method by using the class name  
		OverloadStaticMethodExample2.sum(12, 90);   
	}
}
