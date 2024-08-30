package w3Resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterateThroughArrayList {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		
		System.out.println(colors);
		
		
		Iterator<String>iterator=colors.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
