package w3Resource;

import java.util.Scanner;

public class ThreeDimensionalMatrix {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
System.out.println("Enter The Number Of values ");
int firstValue=scan.nextInt();
System.out.println("Enter The Number Of Rows ");
int firstRow =scan.nextInt();
System.out.println("Enter The Number Of Column");
int firstColumn=scan.nextInt();
int array1[][][]=new int [firstValue][firstRow][firstColumn];
int array2[][][]=new int [firstValue][firstRow][firstColumn];
int array3[][][]=new int [firstValue][firstRow][firstColumn];
int array[][][]=new int [firstValue][firstRow][firstColumn];

for(int i=0;i<firstValue;i++) { 
	for(int j=0;j<firstRow;j++) {
		for (int k= 0; k < firstColumn; k++) {
		System.out.println("Enter The First "+"["+i+"]"+" "+"["+j+"]"+"["+k+"]"+" Matrix");
		array1[i][j][k]=scan.nextInt();
		}
	}
}
;


for(int i=0;i<firstValue;i++) {
	for(int j=0;j<firstRow;j++) {
		for (int k= 0; k < firstColumn; k++) {
		System.out.println("Enter The Second "+"["+i+"]"+" "+"["+j+"]"+"["+k+"]"+" Matrix");
		array2[i][j][k]=scan.nextInt();
		}
	}
}
;


for(int i=0;i<firstValue;i++) {
	for(int j=0;j<firstRow;j++) {
		for (int k= 0; k < firstColumn; k++) {
		System.out.println("Enter The Third "+"["+i+"]"+" "+"["+j+"]"+"["+k+"]"+" Matrix");
		array3[i][j][k]=scan.nextInt();
		}
	}
}
;


System.out.println("First Matrix ");
for(int i=0;i<firstValue;i++) {
	
	for(int j=0;j<firstRow;j++) {
		for (int k= 0; k < firstColumn; k++) {
		System.out.print(array1[i][j][k]+"  ");
	}
	System.out.println("");
}
}	

System.out.println("Second Matrix ");
for(int l=0;l<firstValue;l++) {
	
	for(int j=0;j<firstRow;j++) {
		for (int k= 0; k < firstColumn; k++) {
		System.out.print(array2[l][j][k]+"  ");
	}
	System.out.println("");
}	
}

System.out.println("Third Matrix ");
for(int o=0;o<firstValue;o++) {
	
	for(int j=0;j<firstRow;j++) {
		for (int k= 0; k < firstColumn; k++) {
		System.out.print(array3[o][j][k]+"  ");
	}
	System.out.println("");
}
	
	}
System.out.println("Sum Of Matrices");
for(int g=0;g<firstValue;g++) {
	for(int j=0;j<firstRow;j++) {
		for (int k= 0; k < firstColumn; k++) {
		array[g][j][k]=array1[g][j][k]+array2[g][j][k]+array3[g][j][k];
		System.out.print(array[g][j][k]+"   ");
	}
		System.out.println("");
}
}
//Printing the added values

scan.close();}
}
