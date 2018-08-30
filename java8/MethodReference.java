package com.java8;
/*
interface Sayaable{
	public void print();
}
*/
public class MethodReference {

	public static void main(String[] args) {
		Sayable sayable = MethodReference::printMsg;
		sayable.say();
		
		sayable = MethodReference::printGmMsg;
		sayable.say();
	}

	public static void printMsg() {
		System.out.println("say hello..");
	}

	public static void printGmMsg() {
		System.out.println("say Good morning...");
	}
	
	
}
