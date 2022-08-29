package com.nagarro.designpatterns;

public interface Shape {
	void draw();

}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a Rectangle...");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a circle...");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Drawing a square...");
	}
}

