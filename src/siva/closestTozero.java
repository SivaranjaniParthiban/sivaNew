package siva;

import java.util.Arrays;

public class closestTozero {
	 static int closestToZero(int[] ints) {
		 Arrays.sort(ints);
		System.out.println(ints[0]);
	        return ints[0];
		}
	 
	 
	 
	 public static void main(String[] args) {
		int [] array = new int [] {7, 5, 10, 3, 4};
		closestToZero(array);	}
}
