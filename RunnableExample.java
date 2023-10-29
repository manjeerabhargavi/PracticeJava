package com.java8.practicejava.implementation.threads;

public class RunnableExample {
   public static void main(String args[]) {
	    Runnable task = () -> {
	    	for(int i=0;i<5;i++) {
	    		 System.out.println("Running inside the thread: " + i);
            } 
	    };
	    Thread myThread = new Thread(task);
	    myThread.start();
	      for(int i=0;i<3;i++) {
	    	  System.out.println("Running the main thread" +i);
	      }
	    }
   }

