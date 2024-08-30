package siva;

import java.util.Arrays;

public class LargestInArray {
	public static int findLargest(int[] numbers) {
	    // Write your code here
		
		Arrays.sort(numbers);
		
        return numbers[numbers.length-1];
	}

/* Ignore and do not change the code below */
    public static void main(String args[]) {
        int[] arr = new int[]{12, 4, 5, 600, 18, 20};
        int res = findLargest(arr);
        System.out.println(res);
    }
    /* Ignore and do not change the code above */

}
