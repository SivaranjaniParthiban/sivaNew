package mayil;

import java.util.ArrayList;
import java.util.Arrays;

public class StringAnagram {
	 public static boolean isTwin(String a, String b) {
			
		 
		 ArrayList<Character>characetre = new ArrayList<Character>();
		 ArrayList<Character>characetre2 = new ArrayList<Character>();
		 
		 
		
//		 
//		 if(a.length()!=b.length()) {
//			 return false;
//		 }
//		 else {
			 
		
String s1= a.toLowerCase();
String s2= b.toLowerCase();

		char[] array = s1.toCharArray();
		char[]arrays =s2.toCharArray();
		
		for(int i=0;i<=array.length-1;i++) {
			characetre.add(array[i]);
		}

		for(int i=0;i<=arrays.length-1;i++) {
			characetre2.add(arrays[i]);
		}
		
		
	System.out.println(characetre.equals(characetre2));	
		
//		Arrays.sort(array);
//		Arrays.sort(arrays);
//		
//		 
//	//	 return true;
//System.out.println(Arrays.equals(array, arrays));
		 
		 return (Arrays.equals(array, arrays));
		 }
		

/* Ignore and do not change the code below */
    public static void main(String args[]) {
         String a = "madam";
	  String b = "madam";
        isTwin(a, b);
       
    }
    /* Ignore and do not change the code above */

}
