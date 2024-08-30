package w3Resource;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIsEmptyOrNotAndEnsureCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		colors.ensureCapacity(6);
		System.out.println(colors.size());
		System.out.println((colors.isEmpty())?"true":"false");
	}

}
