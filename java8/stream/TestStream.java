package com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestStream {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(2,3,4,5,3,1,4,5);
		
//		List<Integer> list1 = list.stream().map(i->i*i).collect(Collectors.toList());
//		list1.forEach(e->System.out.println(e));
		
		list.stream().map(i->i*i).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println("-----------------------------------------------");
		list.stream().filter(p->p%2==0).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println("-----------------------------------------------");
		list.stream().map(i->i*i).filter(p -> p>10).collect(Collectors.toSet()).forEach(e->System.out.println(e));
		System.out.println("-----------------------------------------------");
		list.stream().map(i->i*i).sorted().forEach(e->System.out.println(e));
		System.out.println("-----------------------------------------------");
		int even  = list.stream().filter(e->e%2==0).reduce(0,(ans,i)->ans+i);
		System.out.println(even);
		System.out.println("-----------------------------------------------");
		list.stream().filter(e->e%2==0).map(i->i).collect(Collectors.toList()).forEach(e->System.out.println(e));
		System.out.println("-----------------------------------------------");
		System.out.println(IntStream.rangeClosed(1, 4).filter(e->e%2==0).map(i->i).sum());
		System.out.println("-----------------------------------------------");
		
		Stream.iterate(1, e->e+1).filter(e->e%5==1).limit(5).forEach(System.out::println);
		
		System.out.println("-----------------------------------------------");
//		IntStream.rangeClosed(1, 10).limit(5).forEach(System.out::println);
		IntStream.rangeClosed(1, 10).filter(e->e/2>=1).limit(2).forEach(System.out::println);
		
		
	}

}
