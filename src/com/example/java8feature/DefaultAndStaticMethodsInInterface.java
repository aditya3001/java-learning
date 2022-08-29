package com.example.java8feature;

interface Sayable {
	
	default void say() {
		System.out.println("I am saying that...");
	}
	
	void sayMore(String message);
	
	static void sayLouder() {
		System.out.println("I am saying it louder...");
	}
}

interface Sayable1 {
	
	default void say() {
		System.out.println("I am saying  from Sayable1 that...");
	}
	
	void sayMore(String message);
	
	static void sayLouder() {
		System.out.println("I am saying it louder from Sayable1 ...");
	}
}

class A{
	
}

class SayableImpl extends A implements Sayable1,Sayable{
	
	public void say() {
		System.out.println("I am saying  from child class that...");
	}

	@Override
	public void sayMore(String message) {
		System.out.println(message);
		
	}
	
}
public class DefaultAndStaticMethodsInInterface {


	public static void main(String[] args) {

		SayableImpl sayable = new SayableImpl(); 
		sayable.say();
		sayable.sayMore("Heyyaa");
		Sayable.sayLouder();
	}
}
