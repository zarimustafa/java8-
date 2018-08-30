package com.java8.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamToArray {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("AB","BC","AC");
		
//		String[] arr = list.stream().toArray(String[]::new);
		
		String[] arr = list.stream().toArray(size->new String[size]);
		
		Arrays.asList(arr).stream().filter(e->e.contains("A")).forEach(System.out::println);
		
		Arrays.stream(arr).filter(e->e.startsWith("B")).forEach(System.out::println);
		
		
		Stream.of(1,2,3,4,5).skip(2).forEach(System.out::println);
		
		System.out.println("---------------------");
		int[] ar = {1,2,3,4,5};
		int sum = Arrays.stream(ar).sum();
		System.out.println(sum);
		System.out.println("---------------------");
		int max = Stream.of(100,2,3,44,5).map(i->i).max(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		}).get();
		
		System.out.println(max);
	}

}
