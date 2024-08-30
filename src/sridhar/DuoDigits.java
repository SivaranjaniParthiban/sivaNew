package sridhar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeMap;

public class DuoDigits {
	static boolean isAnagram(String a, String b) {
       // Complete the function
//      
        List<Character> loop1=new ArrayList<Character>();
        List<Character> loop2=new ArrayList<Character>();
//        
//        
        char[] c=a.toLowerCase().toCharArray();
       char[] d=b.toLowerCase().toCharArray();
       for(int i=0;i<c.length;i++){
           loop1.add(c[i]);
        }
        for(int i=0;i<d.length;i++){
            loop2.add(d[i]);
        }
//        
    return loop1.containsAll(
        loop2);
    }
	public static void main(String[] args) {
		
		
		
		 boolean result=true;
	       System.out.println((result)?"True":"false");
		Scanner scan = new Scanner(System.in);
      String ab = scan.next();
      String bc = scan.next();
      scan.close();
      boolean ret = isAnagram(ab, bc);
      System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
      
		int a=1120;
		int count = 0;
		char[] array=String .valueOf(a).toCharArray();
	
		try {
		
	
		for(int i=0;i<array.length;i++) {
		
			if(array[i]!=array[i+1]) {
			count=count+1;
			if(count>=2) {
				System.out.println("notduo");
				break;
			}
			}else if(array[i]==array[i+2]) {
				System.out.println("duodigit");
				break;
			}}
		}		
			catch(Exception e) {
			System.out.println("Duodigit");
}
	int b=9999;
		String name=String.valueOf(b);
		
		
		String reverse="";
		for(int i=name.length()-1;i>=0;i--) {
			reverse=reverse+name.charAt(i);
			System.out.println(reverse);
		}
		
		if(reverse.equalsIgnoreCase(name)) {
			System.out.println("same");
		}
		
		StringBuilder pal=new StringBuilder();
		pal=pal.append(name);
		StringBuilder pal2=new StringBuilder();
		
	pal2=	pal.reverse();

	System.out.println(pal2);
	if(pal.equals(pal2)) {
		System.out.println("same String");	
	}
	int temp;
		int arr[] = {1,8,4,9,2};

		int arr1[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
				}
				
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	int index=0;
		for(int i=0;i<arr.length;i++) {
		if(arr[i]%2==0) {
			arr1[index]=arr[i];
			index++;
		}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==1) {
				arr1[index]=arr[i];
				index++;
			}
			}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr1[i]);
		}
		
		ArrayList<Integer>hdjh=new ArrayList<Integer>();
		hdjh.add(1);
		hdjh.add(8);
		hdjh.add(4);
		hdjh.add(9);
		hdjh.add(3);
	
		
//Shuffle the elements  		
		for(int i=0;i<hdjh.size();i++) {
			Random rn = new Random();
			int answer = rn.nextInt(4) + 1;
			System.out.println(hdjh.get(answer));
		}
		
		
		for(int i=0;i<hdjh.size();i++) {
			for(int j=i+1;j<hdjh.size();j++) {
		if(hdjh.get(i)>hdjh.get(j)) {
			int tempa=hdjh.get(i);
			hdjh.set(i,hdjh.get(j))	;
			hdjh.set(j, tempa);
		}
		
			}
		}
		System.out.println(hdjh);
		
		
		
		for(int i=0;i<=5;i++) {
			//for(int j=i;j<=4;j++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		String word="I Am A Java Programmer";
		String[] arrays=word.split(" ");
		
		
		for(int i=0;i<arrays.length;i++) {
			StringBuilder jvj= new StringBuilder (arrays[i]);
		jvj=jvj.reverse();
	
		System.out.println(jvj);
			
		}
		
		
		
		String jfgjyg="SIVA";
		char[] jdnfjn=jfgjyg.toCharArray();
		for(int i=0;i<jdnfjn.length;i++) {
			int hbdhb=(char)jdnfjn[i]+32;
			
	char	 hffgvv=(char)hbdhb;
		System.out.println(hffgvv);
	
		}
		
		int dhg=65;
		char dghhg=(char)dhg;
		System.out.println(dghhg);
		
		
		
		
		int j=1,k=1,counst=20;
		System.out.print(j+" ");
		System.out.print(k+" ");
		for(int i=0;i<=counst;i++) {
			
			int c=j+k;
			System.out.print(c+" ");
			j=k;
			k=c;
			
		}
		String anagram1="Army";
		String anagram2="Mary";
		
		
		char[] hshh= anagram1.toLowerCase().toCharArray();
		char[] khbj= anagram2.toLowerCase().toCharArray();
		
		Arrays.sort(hshh);
		Arrays.sort(khbj);
		System.out.println(Arrays.equals(hshh, khbj));
		
		
		
		for(int i=0;i<=4;i++) {
		String tgr="1234sjkfkryhfik567890";
		Random kfdhbkh= new Random();
		int kenfkn=kfdhbkh.nextInt(20);
		System.out.print(tgr.charAt(kenfkn));
		}
		
		String rgdt="Radar",rstr="";
		for(int l =rgdt.length()-1;l>=0;l--)
		{
		rstr=rstr+rgdt.charAt(l)	;
		}
		if(rstr.equalsIgnoreCase(rgdt)) {
			System.out.println("Smae");
		}
		
		String[] ekurhgb= {"the","got","bone","the"};
		Arrays.sort(ekurhgb);
		TreeMap<String,Integer>sghgvfj=new TreeMap<String,Integer>();
		
		for(int i=0;i<ekurhgb.length;i++) {
			
			if(sghgvfj.containsKey(ekurhgb[i])) {
				int countss=sghgvfj.get(ekurhgb[i]);
				sghgvfj.put(ekurhgb[i],countss+1);
			}
			else {
				sghgvfj.put(ekurhgb[i], 1);
			}
		}
		System.out.println(sghgvfj);
		int ind=0;
	int [] mnbvc = {3,0,5,6,0,0,7,0,0,2,7,5};
	int []vcxz = new int [mnbvc.length];
		for(int i=0;i<mnbvc.length;i++) {
		if(mnbvc[i]!=0) {
			vcxz[ind]=mnbvc[i];
			ind++;
		}
		}
		for(int h=0;h<mnbvc.length;h++) {
		 if(mnbvc[h]==0) {
			vcxz[ind]=mnbvc[h];
			ind++;
		}
		}
	for(int i=0;i<vcxz.length;i++) {
		System.out.print(vcxz[i]);
	}
	
	
	int abb[]= {10,20,30,40,50};
	int large=abb[0];	
	for(int i=0;i<abb.length;i++) {
		for(int d=0;d<abb.length;d++) {
	
			if(large<abb[i]) {
				large=abb[i];
				
			}
			
		}
	}
	System.out.println(large);
	
	
	int bbb[]= {30,20,10,50,40};
	
	
	
	int hsgj=0;
	for(int i=0;i<abb.length;i++) {
		for(int t=0;t<bbb.length;t++) {
			if(abb[i]==bbb[t]) {
				
				hsgj++;
			}
		}
	}
	if(hsgj==abb.length) {
		System.out.println("same");
	}
	
	LinkedList<Integer>hsygegb=new LinkedList<Integer>();
	
	Scanner sjgjv=new Scanner(System.in);
	int totalNumber = sjgjv.nextInt();
	for(int y=0;y<totalNumber;y++) {
		int numbers = sjgjv.nextInt();
		hsygegb.add(numbers);
		
	}
	System.out.println(hsygegb);
	
	
	int fdg[]= {1,4,67,68,45};
	Arrays.sort(fdg);
	int small=Integer.MAX_VALUE;
	for(int i=1;i<fdg.length;i++) {
		int interval = fdg[i]-fdg[i-1];
		if(interval<small) {
			small=interval;
		}
	}
	System.out.println(small);
	
	
	}
	
	
			}
		
	
		
		

		
	



