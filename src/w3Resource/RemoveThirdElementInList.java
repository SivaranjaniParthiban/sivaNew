package w3Resource;

import java.util.ArrayList;
import java.util.List;

public class RemoveThirdElementInList {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		colors.add("Whites");
		System.out.println("Before Changes : "+colors);
		colors.remove(2);
		System.out.println("After Changes : "+colors);
		

	}

}
