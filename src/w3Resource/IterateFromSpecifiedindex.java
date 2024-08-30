package w3Resource;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateFromSpecifiedindex {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		Iterator<String>specificIndex=colors.listIterator(1);
		while(specificIndex.hasNext()) {
			System.out.println(specificIndex.next());
		}
	}

}
