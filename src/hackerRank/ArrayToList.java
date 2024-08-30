package hackerRank;

import java.util.ArrayList;

public class ArrayToList {

	public static void main(String[] args) {
		
//Array
String[] name = new String [] {"Siva","Shanthi","Nandhi"};
//ArrayList-ForLoop
ArrayList<String>nameList=new ArrayList<String>();
for(int i=0;i<name.length;i++) {
	nameList.add(name[i]);
	
}
System.out.println(nameList);

	}

}
