package practicesDemo;

public class StringAndStringBuffer {
	public static void main(String[] args) {
		String s1 = "Selenium";
		s1.concat("WebDrvier");
		System.out.println(s1); //Selenium

		StringBuffer sb = new StringBuffer("String");
		sb.append("Buffer");
		System.out.println(sb); //StringBuffer
	}
}
