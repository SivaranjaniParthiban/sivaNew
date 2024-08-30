package w3Resource;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
	
		System.out.println("Enter The Number Of Rows In The  Matrices");
		int firstRow=scan.nextInt();
		System.out.println("Enter The Number Of Columns In The  Matrices");
		int firstColumn=scan.nextInt();
	
	
		int array1[][]=new int[firstRow][firstColumn];
		int array2[][]=new int [firstRow][firstColumn];
		int arraySum[][]=new int [firstRow][firstColumn];
	
			
		
			for(int i=0;i<firstRow;i++) {
				for(int j=0;j<firstColumn;j++) {
					System.out.println("Enter The First "+"["+i+"]"+" "+"["+j+"]"+" Matrix");
					array1[i][j]=scan.nextInt();
				}
			}
			;
			
			
			
			//Length of Columns or rows
			
//			int length=array1[0].length;
//			System.out.println(length);
			//Getting the second matrix
		
			for(int i=0;i<firstRow;i++) {
				for(int j=0;j<firstColumn;j++) {
					System.out.println("Enter The Second "+"["+i+"]"+" "+"["+j+"]"+" Matrix");
					array2[i][j]=scan.nextInt();
				}
			}
			
			
			System.out.println("First Matrix");
			for(int i=0;i<firstRow;i++) {
			
				for(int j=0;j<firstColumn;j++) {
					System.out.print(array1[i][j]+"  ");
				}
				System.out.println("");
			}
			System.out.println("Second Matrix");
			for(int i=0;i<firstRow;i++) {
				for(int j=0;j<firstColumn;j++) {
					System.out.print(array2[i][j]+"  ");
				}
				System.out.println("");
			}
			
			
			
			
			
			//Adding the values 
			for(int i=0;i<firstRow;i++) {
				for(int j=0;j<firstColumn;j++) {
					arraySum[i][j]=array1[i][j]+array2[i][j];
				}
			}
			
			//Printing the added values
			System.out.println("Sum Of Matrices");
			for(int i=0;i<arraySum.length;i++) {
				for (int j = 0; j < arraySum.length; j++) {	
				System.out.print(arraySum[i][j]+"  ");
			}
				System.out.println("");
			}
			
			
			
		}
	

	}


