package com.example.java8feature;

@FunctionalInterface
interface Foo{
	String value = "Foo Value";
	public String method(String string);

}


public class LambdaExpressionExample {

	private static final String value = "Enclosing Scope";


	public static void main(String[] args) {
		
		LambdaExpressionExample ex = new LambdaExpressionExample();
		ex.experiment();
		
		
	}

	
	public void experiment() {
//		String value = "asd";
		Foo fooImpl = new Foo() {
			String value = "Foo Inner class value";
			@Override
			public String method(String string) {
				return this.value;
			}
		};
		System.out.println(fooImpl.method(""));
		
		Foo fooLambdaImpl = param->{
			String value = "Foo Lambda value";
			return this.value;
		};
		
		System.out.println(fooLambdaImpl.method(""));
		
	}
}
