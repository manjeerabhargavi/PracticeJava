package com.java8.practicejava.implementation.threads;

import com.java8.practicejava.interfaces.FunctionalInterface1;

public class FunctionalInterfaceLambda {
	public static void main(String args[]) {
		FunctionalInterface1 functionaInterace1 = ()->System.out.print("This is example of Functional Interface");
		functionaInterace1.display();
	}

}
