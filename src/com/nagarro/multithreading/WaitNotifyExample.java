package com.nagarro.multithreading;

class Q{
	int num;
	boolean isValueAlreadySet;
	public synchronized void put(int num) {
		while(isValueAlreadySet) {
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}	
		}
		System.out.println("PUT : "+num);
		this.num = num;
		isValueAlreadySet = true;
		notify();
	}
	
	public synchronized void get() {
		while(!isValueAlreadySet) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
		}
		System.out.println("GET : "+num);
		isValueAlreadySet = false;
		notify();
	}
}

class Producer implements Runnable{

	Q q;
	
	public Producer(Q q) {
		this.q = q;
		Thread th = new Thread(this, "Producer");
		th.start();
	}
	
	@Override
	public void run() {
		int i = 0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
	}
	
}

class Consumer implements Runnable{
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		Thread th = new Thread(this,"Consumer");
		th.start();
	}

	@Override
	public void run() {
		while(true) {
			q.get();
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
		
	}
	
	
}

public class WaitNotifyExample {

	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
