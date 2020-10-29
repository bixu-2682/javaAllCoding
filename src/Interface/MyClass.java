package Interface;

public class MyClass implements MyInterface{
	public static void main(String[] args) {
		MyInterface obj = new MyClass();
		obj.myMethodOne();
	}
	@Override
	public void myMethodOne() {
		System.out.println("Implementation of myMethodOne");	
	}
}
