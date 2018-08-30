package com.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class TestConstructorMethodReference {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("A","B","C","D");
//		List<String> secList = new ArrayList<String>();
		copyElements(list, ArrayList<String>::new);
		

	}

	private static void copyElements(List<String> l1, Supplier<Collection<String>> l2) {
		
		l1.forEach(TestMethodRef::print);
		l1.forEach(x-> l2.get().add(x));
		System.out.println(l2.get().size());
		l2.get().stream().forEach(System.out::println);
	}
}
