package mayil;



public class ArrayIndexNumAdd {
	public static int calc(int[] array, int n1, int n2) {
		  // write your code here
		int sum = 0;
		
		
		for(int i=n1;i<=n2;i++) {
			 sum += array[i];
			 System.out.println(array[i]);
		}
   	
   	
       return sum;
		
		
		}

	/* Ignore and do not change the code below */
	    public static void main(String args[]) {
	         int[]  arr  = new int [] {11, 12, 13, 14, 15, 16, 17, 18, 19};
		    int n1 = 3;
		   int n2 = 5;
	        int res = calc(arr, n1, n2);
	        System.out.println(res);
	    }
	    /* Ignore and do not change the code above */

}
