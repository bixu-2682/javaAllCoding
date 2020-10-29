package practicesDemo;
 
public class test321
	{
  		 public static void main(String[] args) {
  		
  		 StringBuffer s = new StringBuffer("Sel");
  		 StringBuffer sb = new StringBuffer("Sel");
  		 System.out.println(s==sb);//reference comparison
  		 System.out.println(s.equals(sb)); //content comparison
  		}
  	}