package com.java8.interfaces;

public interface IInterface {

	public static void main(String []args) {
		System.out.println("This is from I-interface... :-) ");
	}
	
	default void say(String msg) {
		System.out.println(" From Default method - Msg - " + msg);
	}
}
