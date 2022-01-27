package com;

public class ThreadTest {

	public static void main(String[] args) {
		/*
		 * Shared target = new Shared(); Thread thread1 = new Thread(target,"A"); Thread
		 * thread2 = new Thread(target,"B"); Thread thread3 = new Thread(target,"C");
		 * 
		 * thread1.start(); thread2.start(); thread3.start();
		 */
		
		MyRunnable target = new MyRunnable();
		Thread t1 = new Thread(target,"A");
		Thread t2 = new Thread(target,"B");
		Thread t3 = new Thread(target,"C");
		t1.setDaemon(true);
		t2.setDaemon(true);
		t3.setDaemon(true);
		t1.start();
		t2.start();
		t3.start();
	}

}
