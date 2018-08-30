package com.java8.stream;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStreamCollectors {

	public static void main(String[] args) {
		
		int[] arr = {1,2,2,3,2,2,3,4,5};

		Arrays.stream(arr).filter(i->i<4).forEach(System.out::println);
		
		System.out.println(Arrays.stream(arr).filter(i->i<4).sum());
		
		int sum = Stream.of(1,2,3,4,5).filter(p->p<=3).collect(Collectors.summingInt(i->i)).intValue();
		int avg = Stream.of(1,2,3,4,5).filter(p->p<=3).collect(Collectors.averagingInt(i->i)).intValue();
		
		System.out.println(sum);
		System.out.println(avg);
	}

}
