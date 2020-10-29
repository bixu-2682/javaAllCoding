package Collection_Interface;
import java.util.*;
public class HashSet {

	

	public static void main(String[] args) {
	/*TreeSet t = new TreeSet();
	t.add(new StringBuffer("A"));
	t.add(new StringBuffer("Z"));
	t.add(new StringBuffer("L"));
	t.add(new StringBuffer("B"));
	System.out.println();
	*/
	System.out.println("A".compareTo("Z"));  //-25
	System.out.println("Z".compareTo("B"));  //24
	
	System.out.println("A".compareTo("A"));  //0
	System.out.println("A".compareTo(null)); //NullPointerException
}

}