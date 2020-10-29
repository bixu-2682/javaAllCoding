package UstGLobal;

public class StringDemo {

	public static void main(String[] args) {
	
	String ss= "Selenium";
	ss.concat(" WebDriver");//concat() method appends the string at the end  
	System.out.println(ss); //will print Sachin because strings are immutable objects  
	// that two objects are created but s reference variable still refers to "Selenium" not to "Selenium WebDriver".
	//Here Selenium is not changed but a new object is created with Selenium WebDriver. That is why string is known as immutable.
	
	String ss9 = "Selenium";
	ss9 = ss9.concat(" WebDriver");//new object is created
	System.out.println(ss9);//
	}
}