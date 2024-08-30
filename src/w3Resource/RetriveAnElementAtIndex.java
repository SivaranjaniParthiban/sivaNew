package w3Resource;

import java.util.ArrayList;
import java.util.List;

public class RetriveAnElementAtIndex {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		
		System.out.println(colors);
		
		System.out.println("The Element At First Is : "+colors.get(0));
	}

}
