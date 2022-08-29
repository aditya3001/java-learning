package com.nagarro.designpatterns;

class Example {
	/*
	 * Early Instantiation
	 */

//	private static Example object = new Example();
//	
//	private Example() {}
//	
//	
//	public static Example getInstance() {
//		return object;
//	}

	/*
	 * Lazy Instantiation
	 */
	private static Example object;

	private Example() {
		System.out.println("Instance Created");
	}

	public static Example getInstance() {
		if (object == null) {
			synchronized (Example.class) {

				if (object == null) {
					object = new Example();
				}

			}
		}
		return object;
	}
}

public class SingletonDesignPattern {

	public static void main(String[] args) {

//		final Example obj1 = Example.getInstance();
//		final Example obj2 = Example.getInstance();

		final Thread firstThread = new Thread(new Runnable() {

			@Override
			public void run() {
				Example firstObject = Example.getInstance();
				System.out.println(firstObject.hashCode());
			}
		});

		final Thread secondThread = new Thread(new Runnable() {

			@Override
			public void run() {
				Example secondObject = Example.getInstance();
				System.out.println(secondObject.hashCode());

			}
		});
		
		final Thread thirdThread = new Thread(()->{
			Example thirdObject = Example.getInstance();
			System.out.println(thirdObject.hashCode());

		});
		
		firstThread.start();
		secondThread.start();
		thirdThread.start();
	}

}
