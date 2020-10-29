package OnlyInterView;

public class Boxing {

	public static void main(String[] args) {
		
		//AutoBoxing
		int a=100;
		Integer b =a;
		System.out.println("AutoBoxing " + b);

		//Boxing
		int x =900;
		Integer y = Integer.valueOf(x);
		System.out.println("Boxing " + y);
		
		//UnBoxing
		Integer result = 100;
		int newResult = result.intValue();
		System.out.println("UnBoxing " +newResult);
		
		//AutoUnBoxing
		Integer marks = 78;
		int newMarks = marks;
		System.out.println("AutoUnBoxing " + newMarks);
	}

}
