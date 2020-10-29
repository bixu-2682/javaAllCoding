package UstGLobal;

public class finalFinallyFinalize {
public static void main(String[] args) {
	try
	{
	System.out.println("durga");
	System.out.println(10/0);
	}
	catch (ArithmeticException ae)
	{
	System.out.println("u r getting ae:"+ae);
	}
	finally
	{
	System.out.println("finally block is always executed");
	}
	System.out.println("rest of the code");
	}
}
