package bala;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReplaceLambda {

	

	    public static void main(String[] args) {
	        List<String> list = Arrays.asList("Alpha","Bravo","Charlie","Delta");
	        list.sort((str1, str2) -> Integer.compare(str1.length(), str2.length()));
	   
	        System.out.println(list);
	        //sorting a list of strings by length ---> replace this line using java8 lamda syntax
//	        Collections.sort(list, new Comparator<String>() {
//	         
//	            public int compare(String s1, String s2) {
//	                return Integer.compare(s1.length(), s2.length());
//	            }
//	        });   
	    }
	}

	
	
	
	
	
