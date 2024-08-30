package w3Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class TreeMapKeyReverse {

	public static void main(String[] args) {
		
		int num=1234567890;
		String njhj=String.valueOf(num);
		char[]njnn=njhj.toCharArray();
		
		TreeMap<Character,Integer>countCharOccur = new TreeMap<Character,Integer>();
		for(int i=0;i<njnn.length;i++) {
			if(countCharOccur.containsKey(njnn[i])) {
	int count = countCharOccur.get(njnn[i]);	
	countCharOccur.put(njnn[i], count+1);
			}
			else {
				countCharOccur.put(njnn[i], 1);
			}
		}
	System.out.println(countCharOccur);
		TreeMap<Integer,Integer> map=new TreeMap<Integer,Integer>();
		
		map.put(1, 2);
		map.put(2, 3);
		map.put(5, 4);
		map.put(2, 6);
//		NavigableSet<Integer>navset=new TreeSet<Integer>();
//		navset.add(0);
//		navset.add(1);
//		navset.add(2);
//		navset.add(3);
//		navset.add(4);
//		navset.add(5);
//		
//		System.out.println(navset.descendingSet());
		HashMap<Integer,Integer>map2= new HashMap<Integer,Integer>(map);
		LinkedHashMap<Integer,Integer>map3= new LinkedHashMap<Integer,Integer>(map);
		HashMap<String,String>map4= new HashMap<String,String>();
		map4.put("Mayil","1000067" );
		map4.put("Siva","1000068" );
		map4.put("Bala","1000069" );
		map4.put("Sridhar","1000071" );
		map4.merge("Siva", "68", (oldValue, newValue) -> oldValue +" / "+ newValue);
		System.out.println(map4);
		for (Entry<String, String> entry : map4.entrySet()) {
	        System.out.println(entry.getKey() + ":" + entry.getValue());
	    }
		System.out.println(map);
		System.out.println(map2);
		System.out.println(map3);
		
		
//CeilingEntry : Gives The Entry Of Key And Value Which Has Key Value Lesser Or Equal The Key 3=gives 3 or 5
		System.out.println(map.ceilingEntry(3));
		
		
		
//Descending KeySet : Gives The Map Key In Descending Order 
System.out.println(map.descendingKeySet());



//Ceiling Key : Returns the least key greater than or equal to the given key,or null if there is no such key.
System.out.println(map.ceilingKey(3));


//FloorKey : Returns the greatest key less than or equal to the given key,or null if there is no such key.
System.out.println(map.floorKey(5));	


//Lower Key : Returns the greatest key strictly less than the given key, or null if there is no such key.
System.out.println(map.lowerKey(4));


//Compute : Change The Value Of the Mentioned Key 
System.out.println(map.compute(3, (key, value) -> 30));



//ComputeIfPresent  : Change The Value Of The Mentioned Key If The Key Is Present .
System.out.println(map.computeIfPresent(1,(key,value)-> 20));


//Merge : Add Two Values For Same  Key Has Two Values In The Same Key  
map2.merge(2, 6, (oldValue, newValue) -> oldValue + newValue);
System.out.println(map2);


ArrayList<Object>list=new ArrayList<Object>();
list.add(1);
list.add("Siva");
list.add(3.00);
list.add(3.55566);
list.add(true);																																																																																											
list.add(123456789);

System.out.println(list);
	System.out.println(map);
	
	
//Descending Map : Gives The Map With Descending Key Sorting 
System.out.println( map.descendingMap());
	


PriorityQueue <String>barbeque=new PriorityQueue<String>();
barbeque.add("Siva");
barbeque.add("Nandhini");
barbeque.add("Sarvesh");
barbeque.add("Shandhini");
barbeque.add("Hari");
barbeque.add("Tiger");
barbeque.removeIf(n->n.charAt(0)!='H');
System.out.println(barbeque);
while(!barbeque.isEmpty()) {
	System.out.println(barbeque.remove());
}
	}

}
