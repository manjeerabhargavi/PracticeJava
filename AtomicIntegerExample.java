package com.java8.practicejava.implementation.threads;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerExample {
  public static void main(String args[]) {
	    AtomicInteger counter = new AtomicInteger(0);
	    	Runnable task=()->{
	    		for(int i=0;i<1000;i++) {
	    			counter.incrementAndGet();
	    		}
	    	};
	    	Thread thread1 =  new Thread(task);
	    	Thread thread2 =  new Thread(task);
	    	thread1.start();
	        thread2.start();
	        try {
	        	thread1.join();
	        	thread2.join();
	        }
	        catch(InterruptedException e) {
	        	e.printStackTrace();
	        }
	        System.out.println("Final counter value: " + counter.get());
      }
}
