package com.nagarro.designpatterns;




class ShapeMaker {
	private Shape rectangle;
	private Shape square;
	private Shape circle;

	public ShapeMaker() {
		rectangle = new Rectangle();
		square = new Square();
		circle = new Circle();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}

	public void drawCircle() {
		circle.draw();
	}

}

public class FacadeDesignPatternExample {

	public static void main(String[] args) {
		final ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawRectangle();
		shapeMaker.drawCircle();	
		shapeMaker.drawSquare();
	}

}
