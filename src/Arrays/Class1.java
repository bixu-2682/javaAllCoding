package Arrays;

import java.util.ArrayList;

import Collection_Interface.Emp;
import Collection_Interface.Student;

public class Class1 {
	
	
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add(new Emp(111, "ratan"));
		al.add(new Student(1, "durga"));
		al.add("ratan");
		al.add(10);
		al.add(null);
		System.out.println(al.toString());
		
	}
}
