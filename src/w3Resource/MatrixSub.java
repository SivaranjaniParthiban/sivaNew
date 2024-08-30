package w3Resource;

import java.util.Scanner;

public class MatrixSub {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter The Number Of Rows in the first Matrix : ");
		int firstRow =scan.nextInt();
		System.out.println("Enter The Number Of Columns in the first Matrix : ");
		int firstColumn =scan.nextInt();
		System.out.println("Enter The Values in the first Matrix : ");
		int array[][]=new int [firstRow][firstColumn];
		for(int i=0;i<firstRow;i++) {
			for(int j=0;j<firstColumn;j++) {
			
				array[i][j]=scan.nextInt();
			}
		}
		
		System.out.println("Enter The Number Of Rows in the second Matrix : ");
		int secondRow =scan.nextInt();
		System.out.println("Enter The Number Of Columns in the second Matrix : ");
		int secondColumn =scan.nextInt();
		System.out.println("Enter The Values in the first Matrix : ");
		int array1[][]=new int [secondRow][secondColumn];
		for(int i=0;i<secondRow;i++) {
			for(int j=0;j<secondColumn;j++) {
				
				array1[i][j]=scan.nextInt();
			}
		}
		
		int arraySub[][]=new int[firstRow][firstColumn];
		for(int i=0;i<secondRow;i++) {
			for(int j=0;j<secondColumn;j++) {
				
				arraySub[i][j]=array1[i][j]-array[i][j];
			}
		}
		for(int i=0;i<secondRow;i++) {
			for(int j=0;j<secondColumn;j++) {
	System.out.print(arraySub[i][j]+" ");
			}
			System.out.println("");
		}
	
		
	}

}
