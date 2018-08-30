package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestMethodRef {

	public static void main(String[] args) {

		String[] list = {"Harvard", "Cambridge", "Oxford", "IISC"};
		Arrays.asList(list).forEach(TestMethodRef::print);
		
//		Arrays.asList(list).forEach((e)->System.out.println(e));
		
		 final List<Integer> listt = Arrays.asList(1, 2, 3, 4, 55, 6, 7, 8, 9, 10);
	        final MyComparator myComparator = new MyComparator();
	        // Method reference
	        Collections.sort(listt, myComparator::compare);
	        listt.forEach(TestMethodRef::print);
	    }
	
	    private static class MyComparator {
	        public int compare(final Integer a, final Integer b) {
	            return a.compareTo(b);
	        }
	    }
	    
	    
	public static void print(String msg) {
		System.out.println(msg);
	}
	

	public static void print(Integer msg) {
		System.out.println(msg);
	}


}