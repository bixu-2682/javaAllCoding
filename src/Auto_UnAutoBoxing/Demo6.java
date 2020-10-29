package Auto_UnAutoBoxing;

public class Demo6 {
	static Integer i=50;
	static int j;
	static void print(int i)
	{
		j =i;
		System.out.println(j);
	}
	public static void main(String[] args) {
		print(i);
		System.out.println(j);
	}	
}
