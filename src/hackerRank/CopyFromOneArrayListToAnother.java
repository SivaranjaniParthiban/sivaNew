package hackerRank;

import java.util.ArrayList;
import java.util.Collections;

public class CopyFromOneArrayListToAnother {

	public static void main(String[] args) {
		ArrayList<Integer>valuePresent=new ArrayList<Integer>();
		valuePresent.add(1);
		valuePresent.add(4);
		valuePresent.add(3);
		valuePresent.add(9);
		valuePresent.add(2);
		valuePresent.add(2);
		
		ArrayList<Integer>valuePresent2=new ArrayList<Integer>();
		valuePresent2.add(1);
		valuePresent2.add(4);
		valuePresent2.add(3);
		valuePresent2.add(1);
		valuePresent2.add(4);
		valuePresent2.add(3);
		
	Collections.copy(valuePresent, valuePresent2);
	System.out.println(valuePresent);
	
	
	// valuePresent.addAll(valuePresent2);
	
	
for(int i=0;i<valuePresent.size();i++) {
	valuePresent2.add(valuePresent.get(i));	
	
}
System.out.println(valuePresent2);
	}

	
	
	
	
}
