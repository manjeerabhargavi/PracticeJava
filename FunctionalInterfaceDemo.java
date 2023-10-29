package com.java8.practicejava.implementation.threads;

import com.java8.practicejava.interfaces.FunctionalInterface1;

public class FunctionalInterfaceDemo {
	public void show(String s) {
		System.out.println(" String"+s);
	}
    public static void main(String args[]) {
    	FunctionalInterfaceDemo demo = new FunctionalInterfaceDemo();
    	demo.show("lambda expression");
    }
}
