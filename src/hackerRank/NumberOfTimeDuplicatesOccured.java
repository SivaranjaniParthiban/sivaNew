package hackerRank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map.Entry;
import java.util.TreeMap;

public class NumberOfTimeDuplicatesOccured {

	public static void main(String[] args) {
		TreeMap<Integer,Integer>map=new TreeMap<Integer,Integer>();
		ArrayList<Integer>valuePresent=new ArrayList<Integer>();
	//int count=1;
		valuePresent.add(1);
		valuePresent.add(2);
		valuePresent.add(4);
		valuePresent.add(7);
		valuePresent.add(1);
		valuePresent.add(7);
		Collections.sort(valuePresent);
	for(int i=0;i<valuePresent.size();i++) {
		
		
		if(map.containsKey(valuePresent.get(i))) {
		
			int count =   map.get(valuePresent.get(i));
			map.put(valuePresent.get(i), count+1);
		}
		else {
		map.put(valuePresent.get(i) ,1);
		}
		
//		for(int j=i+1;j<valuePresent.size();j++) {
//			if(valuePresent.get(i).equals( valuePresent.get(j))) {
//			count =count+1;
//				System.out.println(valuePresent.get(i)+" "+count);
//			
//			}
			
	}

		for(Entry<Integer, Integer> jxj:map.entrySet()) {
			System.out.println( " "+jxj+" Times");
		}
			

	
	}
		

	}


