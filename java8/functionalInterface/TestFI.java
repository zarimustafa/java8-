package com.java8.functionalInterface;

import java.io.StringBufferInputStream;
import java.util.Comparator;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

import org.omg.Messaging.SyncScopeHelper;

@FunctionalInterface
interface Mortals{
	void isAlive();
	default void age() {
		System.out.println("will give you age of mortal shortly...");
	}
}

public class TestFI implements Mortals{

	
	public static void main(String[] args) {

		Mortals m = new TestFI();
		m.age();
		Mortals mm = ()->{System.out.println("dead man");};
		mm.isAlive();
		System.out.println("----------------------------");
		System.out.println(isPrime(53));
		System.out.println("----------------------------");
//		IntStream.range(1, 101).forEach(e->System.out.println(e));
		IntPredicate p = (e) -> e % 2 == 0;
//		IntConsumer consumer = p::test;

		IntStream.rangeClosed(1, 10).filter(p::test).forEach(e->System.out.println(e));
		
		System.out.println("----------------------------");
		int total = IntStream.rangeClosed(1, 10).filter(e->e%2==0)./*map(i->i).*/sum();
		System.out.println("Total = " + total);
		System.out.println("----------------------------");
//		int max = IntStream.rangeClosed(1, 10).filter(e->e%2==1).max().getAsInt();
//		System.out.println(max*max);
		
		
		System.out.println("----------------------------");
		
		
	}

	private static boolean isPrime(int n) {
		return n>1 && IntStream.range(2, n).noneMatch(index->n%index == 0);
	}
	@Override
	public void isAlive() {
		System.out.println("yes is alive...");
	}

}
