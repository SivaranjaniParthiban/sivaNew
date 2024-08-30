package bala;

import java.io.PrintStream;
import java.util.Arrays;
import java.util.Scanner;

public class Interval {

    public static int findSmallestInterval(int[] numbers) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
    	 Arrays.sort(numbers); // Sort the array in ascending order
    	  int smallestInterval = Integer.MAX_VALUE; // Initialize smallestInterval to the largest possible integer value
    	 for (int i = 1; i < numbers.length; i++) {
    	  int interval = numbers[i] - numbers[i-1]; 
    	  System.out.println(interval);// Calculate the interval between adjacent elements
    	  if (interval < smallestInterval) { // If the interval is smaller than the current smallest interval
    	 smallestInterval = interval;
}
    	 }
    	 return smallestInterval;
    }

    /* Ignore and do not change the code below */
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = in.nextInt();
        }
        PrintStream outStream = System.out;
        System.setOut(System.err);
        int res = findSmallestInterval(numbers);
        System.setOut(outStream);
        System.out.println(res);
    }
    /* Ignore and do not change the code above */
}

