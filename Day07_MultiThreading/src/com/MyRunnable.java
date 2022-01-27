package com;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Entering into run() method");
		for (int i = 0; i <= 10; i++) {
			System.out.println(name + " " + i + " iterated");
		}

	}

}
