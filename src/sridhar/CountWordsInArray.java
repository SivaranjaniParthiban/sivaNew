package sridhar;

import java.util.Arrays;
import java.util.TreeMap;

public class CountWordsInArray {
	public static void main(String[] args) {

		
		String[] stringArray =new String[] {"the","got","bone","the","dog"};
	Arrays.sort(stringArray);

		TreeMap<String,Integer>mapping=new TreeMap<String,Integer>();
		
	for(int i=0;i<stringArray.length;i++) {
		if(mapping.containsKey(stringArray[i])) {
			int count = mapping.get(stringArray[i]);
			 mapping.put(stringArray[i], count+1);
	    }
	    else 
	    {
	    	mapping.put(stringArray[i], 1);
	    }
	  }


	for(Integer value :mapping.values()) {
	
		System.out.print(value+" ");
	}

		}

		

}
