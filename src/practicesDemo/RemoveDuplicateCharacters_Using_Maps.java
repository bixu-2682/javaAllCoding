package practicesDemo;



public class RemoveDuplicateCharacters_Using_Maps {
	public static void main(String args[]) 
    { 
     
	 String str = "#GeeKs01fOr@gEEks07"; 
     int upper = 0;
     int lower = 0;
     int number = 0;
     int special = 0; 

     for(int i = 0; i < str.length(); i++) 
     { 
         char ch = str.charAt(i); 
         if (ch >= 'A' && ch <= 'Z') 
             upper++; 
         else if (ch >= 'a' && ch <= 'z') 
             lower++; 
         else if (ch >= '0' && ch <= '9') 
             number++; 
         else
             special++; 
     } 

     System.out.println("Lower case letters : " + lower); 
     System.out.println("Upper case letters : " + upper); 
     System.out.println("Number : " + number); 
     System.out.println("Special characters : " + special); 
 } 

}
