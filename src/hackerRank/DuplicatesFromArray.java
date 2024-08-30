package hackerRank;

import java.util.ArrayList;


public class DuplicatesFromArray {

	public static void main(String[] args) {
		ArrayList<Integer>valuePresent=new ArrayList<Integer>();
		valuePresent.add(1);
		valuePresent.add(2);
		valuePresent.add(4);
		valuePresent.add(7);
		valuePresent.add(1);
		valuePresent.add(2);
		for(int i=0;i<valuePresent.size();i++) {
			for(int j=i+1;j<valuePresent.size();j++) {
				if(valuePresent.get(i).equals(valuePresent.get(j))) {
					System.out.println(valuePresent.get(j));
				}
			}
		}
		
		
	}
}
