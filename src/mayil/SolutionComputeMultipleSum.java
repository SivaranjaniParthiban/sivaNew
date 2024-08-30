package mayil;

public class SolutionComputeMultipleSum {
	
	public static int computeMultiplesSum(int n) {
        // Write your code here
        // To debug: System.err.println("Debug messages...");
		
		int sum=0;
		for(int i=0;i<=n;i++) {
		
			if(i%3==0||i%5==0||i%7==0) {
				sum+=i;
				
				
			}
			}
		
        
        return sum;
    }

    /* Ignore and do not change the code below */
    public static void main(String args[]) {
        int n = 10;
        int res = computeMultiplesSum(n);
        System.out.println(res);
    }
    /* Ignore and do not change the code above */

}
