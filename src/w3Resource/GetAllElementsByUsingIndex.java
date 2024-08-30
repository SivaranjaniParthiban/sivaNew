package w3Resource;

import java.util.ArrayList;
import java.util.List;

public class GetAllElementsByUsingIndex {

	public static void main(String[] args) {
		List<String>colors = new ArrayList<String>();
		colors.add("Blue");
		colors.add("Purple");
		colors.add("White");
		
		for(int i=0;i<colors.size();i++) {
			System.out.println(colors.get(i));
		}
	}

}
