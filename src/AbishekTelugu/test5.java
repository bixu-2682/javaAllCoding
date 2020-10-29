package AbishekTelugu;

class test {

	void m1()
	{
	System.out.println("Parent class method");
	}
	}
	class test5 extends test{
	void m2() {
	m1();
	System.out.println("Child class method");
	}
	void m3() {
	m1();
	System.out.println("child class method");
	m2();
	}
	
	
	public static void main(String args[])
	{
		test5 c = new test5();
	c.m3();
	}
}
