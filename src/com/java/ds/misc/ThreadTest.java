package com.java.ds.misc;

public class ThreadTest implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("Thread: " + Thread.currentThread().getId());
		}catch(Exception e) {
			System.out.println(e.getStackTrace());
		}
		
	}
	
	public static void main(String[] arg) {
		ThreadTest test = new ThreadTest();
		test.run();
		System.out.println(5*.1);
		
	}

}
