package com.java8.practicejava.implementation.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * In the executor framework you can create a cached thread pool using
 * the Executors.newCachedThreadPool() method.The cached thread pool adjusts
 * the number of threads based on demand
 * 
 * if a thread is not used for a certain period of time,it is terminated, and if more tasks arrive, 
 * new threads are created. 
 * This is suitable for scenarios where you don't know the exact number of threads needed.
 * 
 */

public class CacheThreadPoolExample {
	public static void main(String args[]) {
		//Create a cache thread pool 
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		//Submit the tasks to the thread pool
		
		for(int i=1;i<=10;i++) {
			final int taskId = i;
			executorService.submit(()->{
				System.out.println("Task::"+taskId+":: is being executed by thread::"+Thread.currentThread().getName());
				try {
					Thread.sleep(1000);
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			});
		}
		executorService.shutdown();
	}

}
