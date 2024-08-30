package w3Resource;

import java.util.ArrayList;
import java.util.List;

public class SetValueInList {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		
		System.out.println("Before Changing The First :"+colors);
		
		colors.set(0, "White");
		
		System.out.println("After Changing The First : "+colors);

	}

}
