package hackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class ListAddRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input = new Scanner(System.in);
	        int totalNumber= input.nextInt();
	        ArrayList<Integer> arrays = new ArrayList<Integer>();
	        for(int i=0;i<totalNumber;i++){
	            int numbers = input.nextInt();
	            arrays.add(numbers);
	            
	        }
	        int methodsNumber = input.nextInt();
	         for(int i=0;i<methodsNumber;i++){
	             String methodName = input.next();
	          if(methodName.equals("Insert")){
	              int index= input.nextInt();
	              int indexValue = input.nextInt();
	              arrays.add(index,indexValue);
	          }
	            else   if(methodName.equals("Delete")){
	              int indexes= input.nextInt();
	             
	              arrays.remove(indexes);
	          }
	            
	         }
	       for (Integer num : arrays) {
	            System.out.print(num + " ");
	        }
	       
	       input.close();
	}

}
