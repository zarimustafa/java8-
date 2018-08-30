package com.java8.lambdaTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestDevLambda {

	public static void main(String[] args) {

		List<Developer> devList = new ArrayList<>();
		
		devList.add(new Developer("V", "Angular", new BigDecimal(24000)));
		devList.add(new Developer("S", "Struts", new BigDecimal(26000)));
		devList.add(new Developer("R", "Spring", new BigDecimal(30000)));
		devList.add(new Developer("M", "Java", new BigDecimal(20000)));
		
		System.out.println("sort by salary --> ");
		devList.stream().sorted((Developer d1, Developer d2)->
		 {return d1.getSalary().intValue() - d2.getSalary().intValue();}).forEach(System.out::println);
		
		System.out.println("sort by Name --> ");
		devList.sort((Developer d1, Developer d2) -> d1.getName().compareTo(d2.getName()));
		devList.forEach(System.out::println);
		
		System.out.println("----------------------------");
		devList.stream().filter(d-> d.getMajor().equals("Spring")).forEach(System.out::println);
		
		
		
		Stream.of("Mustafa","Akash","Zeeshan","Rushi").forEachOrdered(System.out::println);
		Stream.of("Mustafa","Akash","Zeeshan","Rushi").sorted().forEachOrdered(System.out::println);
		//.forEachOrdered(System.out::println);
		
		
		System.out.println("----------------------------");
		List<String> list = Stream.of("Mustafa","Akash","Zeeshan","Rushi","Ahamad","Akshay","Azad","Arahan").
		filter(e->e.startsWith("A")).collect(Collectors.toList());//.forEach(System.out::println);
	
		System.out.println("----------------------------");
		for (String string : list) {
			System.out.println(string);
		}
		
//		IntStream.rangeClosed(1, 15).filter(x->x%3==0).forEach(System.out::println);	
	}

}
