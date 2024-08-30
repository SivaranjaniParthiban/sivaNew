package w3Resource;

import java.util.Arrays;

public class ArrayShiftClockWiseOne {

	public static void main(String[] args) {
		int array[]= {10,20,30,40,50,60};
		 int x = array[array.length-1], i;
	       for (i = array.length-1; i > 0; i--)
	    	   array[i] = array[i-1];
	       array[0] = x;
		System.out.println(Arrays.toString(array));
	}
	

}
                                                                                                        