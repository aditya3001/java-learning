package com.example.miscellaneous;

abstract class Foo{
	protected String x;
	protected static  String y;
	static void methodA() {}
	void methodB() {}
	static String text = "Foo";

}

abstract class AbstractClass  extends Foo{
	
//	public static void main (String[] args ) {
//		AbstractClass abstractClass = new AbstractClass();
//		abstractClass.print();
//	}
	
	public String x;
	public static String y;
	static void methodA() {}
	@Override
	abstract void methodB();
	
	void print() {
		System.out.println(text);
	}
}
