package hackerRank;

import java.util.ArrayList;

public class FirstOccurLastOccurList {

	public static void main(String[] args) {
		ArrayList<String>valuePresent=new ArrayList<String>();
		valuePresent.add("Siva");
//		valuePresent.add("Siva");
//		valuePresent.add("Siva");
//		valuePresent.add("Siva");
		
// 		 note  :  IF THERE ARE LESS THAN ONE OCCURENCES THEN THE LAST INDEX WILL BE THE FIRST OCCURING INDEX
System.out.println(valuePresent.indexOf("Siva"));
System.out.println(valuePresent.lastIndexOf("Siva"));
	}

}
