package com.java8.interfaces.consumer;

import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class TestBiConsumer {

	public static void main(String[] args) {

		BiConsumer<Integer, Integer> biConsumerAdd = (e1,e2)-> {System.out.println(e1 +" + "+e2+"="+(e1+e2));};
//		biConsumerAdd.accept(2, 3);
		
		Supplier<Integer> supplier = () -> {return new Random().nextInt(200);};
		
		biConsumerAdd.accept(supplier.get(), supplier.get());
	}

}
