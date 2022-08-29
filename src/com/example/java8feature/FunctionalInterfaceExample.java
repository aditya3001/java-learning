package com.example.java8feature;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalInterfaceExample {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Double> func1 = (a1, a2) -> {
			return Math.pow(a1, a2);
		};

		Predicate<Double> check = (res) -> res > 100;

		Function<Double, String> func = (res) -> "Result is : " + res;

		System.out.println(func1.andThen(func).apply(2, 4));

		System.out.println(
				FunctionalInterfaceExample.convert(4, 5, (a1, a2) -> Math.pow(a1, a2), (res) -> "Result is : " + res));

		Consumer<Integer> printAgeConsumer = new Consumer<Integer>() {
			@Override
			public void accept(Integer age) {

				System.out.println("Age is " + age);
			}
		};
		// call the method
		printAgeConsumer.accept(23);// Age is 23
		Consumer<Integer> printAgeWithLamda = (age) -> System.out.println("Lamdda : age is " + age);
		// will work similar as printAgeConsumer
		printAgeWithLamda.accept(23);// Lamda : age is 223
		// chaining with andThen(Consumer)
		printAgeConsumer // 1st
				.andThen(printAgeWithLamda)// 2nd
				.andThen(age -> System.out.println("How old is he ? " + age))// 3rd
				.accept(23);// this value will be given to each consumer
	}

	public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2, BiFunction<A1, A2, R1> func1, Function<R1, R2> func2) {
		return func1.andThen(func2).apply(a1, a2);

	}

}
