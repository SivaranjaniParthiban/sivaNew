package hackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class MapPhoneBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
        
        HashMap<String,Integer> phoneBook=new HashMap<String,Integer>();
        
		int n=in.nextInt();
		in.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            phoneBook.put(name, phone);
		}
       
		while(in.hasNext())
		{
			String s=in.nextLine();
         if(phoneBook.containsKey(s)==true){
             System.out.println(s+"="+phoneBook.get(s));
         } 
         else{
        System.out.println("Not found");
         }
		}
		in.close();
	}

}
