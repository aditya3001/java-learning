package com.nagarro.multithreading;

public class DaemonThreadExample extends Thread{
	static int i = 10;
	
	public DaemonThreadExample(String name) {
		super(name);
	}
	
	public void run() {
		synchronized(DaemonThreadExample.class) {
			i+=1;
		}
		
		if(Thread.currentThread().isDaemon()) {
			i+=1;
			System.out.println(""+getName()+ " is a Daemon Thread");
		}else {
			System.out.println(i);
			System.out.println(""+getName()+ " is a User Thread");
		}
		
	}
	
	public static void main(String[] args) {
		final DaemonThreadExample th1 = new DaemonThreadExample("Thread1");
		final DaemonThreadExample th2 = new DaemonThreadExample("Thread2");
		final DaemonThreadExample th3 = new DaemonThreadExample("Thread3");

		th1.setDaemon(true);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
