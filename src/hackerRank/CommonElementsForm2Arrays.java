package hackerRank;

import java.util.ArrayList;


public class CommonElementsForm2Arrays {

	public static void main(String[] args) {
		ArrayList<Integer>valuePresent=new ArrayList<Integer>();
		
		valuePresent.add(1);
		valuePresent.add(2);
		valuePresent.add(4);
		valuePresent.add(7);
		ArrayList<Integer>valuePresent2=new ArrayList<Integer>();
		valuePresent2.add(1);
		valuePresent2.add(3);
		valuePresent2.add(4);
		valuePresent2.add(7);
		ArrayList<Integer>valuePresent3=new ArrayList<Integer>();
		valuePresent3.add(1);
		valuePresent3.add(3);
		valuePresent3.add(5);
		valuePresent3.add(7);
		
	
valuePresent.retainAll(valuePresent2)	;
valuePresent.retainAll(valuePresent3)	;		
System.out.println(valuePresent);
		
//returns Common Elements From List
		for(int i=0;i<valuePresent.size();i++) {
			for(int j=0;j<valuePresent2.size();j++) {
				if(valuePresent.get(i)==(valuePresent2.get(j))) {
					System.out.println(valuePresent.get(i));
			
				}
			}
		}
		
		
		
	}

}
