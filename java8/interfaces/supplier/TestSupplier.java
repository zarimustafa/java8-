package com.java8.interfaces.supplier;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public abstract class TestSupplier {

	public static void main(String[] args) {
		Supplier<String> supplier = ()->{return "sudhansu";};
		Consumer<String> consumer = (e)->System.out.println(e);
		Consumer<String> consumer1 = (e)->System.out.println(e.length());
		Consumer<String> consumer2 = (e)->System.out.println(e.length()>5?"Greater":"Smaller");
		
		consumer.andThen(consumer1).andThen(consumer2).accept(supplier.get());
		
		Predicate<String> p = e -> e.startsWith("A");
		System.out.println(p.test(supplier.get()));
		
		supplier = ()->{return "Ahemed";};
		System.out.println(p.test(supplier.get()));
		consumer = (e)->System.out.println(p.test(e));
		System.out.println("---------------------------");
		consumer.andThen((e)->{System.out.println(e);}).accept(supplier.get());
		System.out.println("---------------------------");
		consumer.accept("Mustafa");
		
	}
	

}
