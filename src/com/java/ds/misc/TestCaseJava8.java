package com.java.ds.misc;

//A simple Java program to demonstrate multiple
//inheritance through default methods.

interface A {
	// default method
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface1 extends A {
	default void show() {
		System.out.println("Default TestInterface1");
	}
}

interface TestInterface2 extends A {
	default void show() {
		System.out.println("Default TestInterface2");
	}
}

// Implementation class code
public class TestCaseJava8 implements TestInterface1, TestInterface2 {
	
	public void show() {
		TestInterface1.super.show();
		TestInterface2.super.show();
	}
	
	public static void main(String args[]) {
		TestCaseJava8 d = new TestCaseJava8();
		d.show();
	}
}