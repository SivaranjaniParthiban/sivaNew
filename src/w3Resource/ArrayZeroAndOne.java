package w3Resource;

public class ArrayZeroAndOne {

	public static void main(String[] args) {
		
// Put Zero's first and then One In An Array		
//		int array[]= {0,1,1,0,1,0,1,1,0};
//		int array1[]=new int[array.length];
//		int index=0;
//		for(int i=0;i<array.length;i++) {
//			if(array[i]==0) {
//				array1[index]=array[i];
//				index++;
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			if(array[i]==1) {
//				array1[index]=array[i];
//				index++;
//			}
//		}
//for (int i = 0; i < array1.length; i++) {
//	System.out.print(array1[i]+" ");
//}



// Put Even Number First The Odd Numbers in An Array
int array[]= {2,1,3,5,1,6,1,1,8};
int array1[]=new int[array.length];
int index=0;
for(int i=0;i<array.length;i++) {
	if(array[i]%2==0) {
		array1[index]=array[i];
		index++;
	}
}
for (int i = 0; i < array.length; i++) {
	if(array[i]%2==1) {
		array1[index]=array[i];
		index++;
	}
}

for (int i = 0; i < array1.length; i++) {
System.out.print(array1[i]+" ");
}


	}

}
