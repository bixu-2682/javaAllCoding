package ConstructorOverriding;

public class ParentClass
{  
	//we cannot override the display() method  
	public static void display()  
	{  
	System.out.printf("display() method of the parent class.");  
	}  
	}  
	//child class  
	class ChildClass extends ParentClass  
	{  
	//the same method also exists in the ParentClass  
	//it does not override, actually it is method hiding  
	public static void display()  
	{  
	System.out.println("Overridden static method in Child Class in Java");  
	}  
	}  