package hackerRank;

import java.util.ArrayList;

public class ArrayListValuePresent {

	public static void main(String[] args) {
	
ArrayList<Integer>valuePresent=new ArrayList<Integer>();
valuePresent.add(1);
valuePresent.add(2);
valuePresent.add(4);
valuePresent.add(7);
System.out.println((valuePresent.contains(7)?"true":"false"));
	
// Without Contains Method 

	for(int i=0;i<valuePresent.size();i++) {
		if(valuePresent.get(i).equals(7)) {
			System.out.println("true");
		}
	}
	
	
	}
}
