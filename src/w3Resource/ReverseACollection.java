package w3Resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ReverseACollection {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
ListIterator<String>reverseCollection=colors.listIterator();

while(reverseCollection.hasPrevious()) {
	System.out.println(reverseCollection.previous());
}
		for(int i=0;i<colors.size();i++) {
			System.out.println(colors.get(i));
		}
		
		
		System.out.println(" ");
		for(int i=colors.size()-1;i>=0;i--) {
			System.out.println(colors.get(i));
		}
		
		System.out.println(" ");
		System.out.println(colors);
		Collections.reverse(colors);
		System.out.println(colors);
		
		
		
	}
	
	

}
