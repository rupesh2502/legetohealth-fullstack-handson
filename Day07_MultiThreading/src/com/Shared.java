package com;

public class Shared implements Runnable{

	@Override
	public synchronized void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + " Entering into run() method");
		for(int i = 1;i <= 10;i++) {
			try {
				System.out.println(name +" "+i+" iterated");
				Thread.sleep(1000);
				if(name.equals("A") && i==5) {
					wait();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		notifyAll();
		System.out.println(name + "  Exiting from run() method ");
	}

}
