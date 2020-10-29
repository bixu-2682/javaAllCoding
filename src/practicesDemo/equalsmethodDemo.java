package practicesDemo;

public class equalsmethodDemo {
	public static void main(String[] args) {
		String s1=  new String("Selenium");
		String s2= new String("Selenium");
		
		System.out.println(s1==s2);    //false   
		//Reference wise address wise both are not equal
		System.out.println(s1.equals(s2)); //true 
		//even the object are different but content wise same i.e true
	}
}
