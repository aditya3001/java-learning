package com.example.java8feature;

import java.util.function.BiFunction;

class Arithmetic {

	public static int add(int a, int b) {
		return a + b;
	}
}

public class MethodReference {

	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;
		int result = adder.apply(10, 20);
		System.out.println(result);

		String a = "meow";
		String b = "meow";
		String ab = a + "deol";
		String abc = "meowdeol";
		System.out.println(ab.equals(abc));

		System.out.println(ab.hashCode());
		System.out.println(abc.hashCode());
		System.out.println(ab == abc);
		System.out.println(a == b);

	}

}
