package ConstructorOverriding;

public class OverloadStaticMethodExample1 {

	//static method
	public static void display()
	{
		System.out.println("Static method called");
	}
	//Overloaded static method
	public static void display(int a)
	{
		System.out.println("An Overloaded static method called");
	}
	//Main method
	public static void main(String[] args) {
		//Calling staic method by using the class name
		OverloadStaticMethodExample1.display();
		OverloadStaticMethodExample1.display(9);
	}
}
