package w3Resource;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SwapTwoElementsAndEmptyArrayList {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		
		colors.set(0, "Purple");
		colors.set(1, "Blue");
System.out.println(colors);


Collections.swap(colors, 1, 0);
System.out.println(colors);


colors.clear();
System.out.println(colors);
	}

}
