package w3Resource;

import java.util.ArrayList;
import java.util.List;

public class InsertElementAtFirstOfArrayList {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		
		System.out.println("Before Adding Element  "+colors);
		colors.add(0, "I am First");
		System.out.println("After Adding Element  "+colors);
		colors.add(0, "I am First");
	}

}
