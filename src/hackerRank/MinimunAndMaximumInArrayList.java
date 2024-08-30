package hackerRank;

import java.util.ArrayList;
import java.util.Collections;

public class MinimunAndMaximumInArrayList {

	public static void main(String[] args) {
		ArrayList<Integer>valuePresent=new ArrayList<Integer>();
		valuePresent.add(1);
		valuePresent.add(4);
		valuePresent.add(3);
		valuePresent.add(9);
		valuePresent.add(2);
	

	int temp;
	for(int i=0;i<valuePresent.size();i++) {
		//for(int j=valuePresent.size()-1;j>i;j--) {
			for(int j=0;j<valuePresent.size();j++) {
			if(valuePresent.get(i)<(valuePresent.get(j))) {
			temp=valuePresent.get(i);
		
	valuePresent.set(i,valuePresent.get(j));
	valuePresent.set(j,temp);
	//System.out.print(temp);
			}
			
		}
		
	}
	System.out.println(valuePresent.get(0));
	System.out.println(valuePresent.get(valuePresent.size()-1));

	}

}
