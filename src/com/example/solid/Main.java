package com.example.solid;

public class Main {

	public static void main(String[] args) {
		Painter painter = new Painter();
		Cutter cutter = new Cutter();
		cutter.setI(12);
		Cutter anotherCutter = new Cutter();
		anotherCutter = cutter;
		System.out.println(anotherCutter);
		System.out.println(cutter);
		System.out.println(cutter.getI());
		anotherCutter.setI(14);
		System.out.println(cutter.getI());

		process(painter);
	}
	
	
	public static void process(Cutter cutter) {
		cutter.cut();
		
	}

}
