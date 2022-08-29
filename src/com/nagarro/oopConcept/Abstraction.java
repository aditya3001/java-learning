package com.nagarro.oopConcept;

//Abstract class
abstract class Animal {
// Abstract method (does not have a body)
	public abstract void animalSound();

	public void sleep() {
		System.out.println("zzz");
	}
}

class Dog extends Animal {
	public void animalSound() {
		System.out.println("Woof Woof");
	}
}

class Abstraction {
	public static void main(String[] args) {
		Dog dog = new Dog(); // Create a Dog object
		dog.animalSound();
		dog.sleep();
	}
}
