package com.java8.interfaces;

public class TestIinterface implements IInterface {
	public static void main(String[] args) {
		System.out.println("This is from Test class");
		TestIinterface t = new TestIinterface();
		t.say("hello");
		IInterface iface = new IInterface() {
			public void say(String msg) {
				System.out.println("Default method - Overriddent - Msgg - " + msg);
			}
		};
		
		iface.say("Go man go");
	}
}
