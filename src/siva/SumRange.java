package siva;

public class SumRange {

	    /**
	     * @return the sum of integers whose index is between n1 and​​​​​​‌​​‌‌‌‌‌‌‌‌​‌​‌‌​‌‌​​‌‌​​ n2
	     */
	    public static int sumRange(int[] array) {
	    	int sum=0;
	    	for (int i=0;i<array.length;i++) {
	    		if(array[i]>=10 && array[i]<=100) {
	    			sum+=array[i];
	    		}
	    	}
	        return sum;
		}

	/* Ignore and do not change the code below */
	    public static void main(String args[]) {	
	    	int[] array = new int[]{11, 12, 13, 14, 15, 16, 17, 18,19};	
		  int res = sumRange(array);
	        System.out.println(res);
	    }
	    /* Ignore and do not change the code above */

	}


