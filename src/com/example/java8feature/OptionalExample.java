package com.example.java8feature;

import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {

		final String name = "Aditya";
		Optional<String> obj1 = Optional.ofNullable(name);
		Optional<String> obj2 = Optional.ofNullable(name);

		System.out.println(obj1.hashCode());
		System.out.println(obj1.get());
		System.out.println(obj1.equals(obj2));

		String str1 = obj1.filter((val) -> {
			return val.charAt(0) == 'B';
		}).orElse(getDefaultString());
		String str2 = obj1.filter((val) -> {
			return val.charAt(0) == 'A';
		}).orElseGet(() -> getDefaultString());
		String str3 = obj1.filter((val) -> {
			return val.charAt(0) == 'A';
		}).orElseThrow(() -> new NullPointerException());

		System.out.println(str1);
		System.out.println("String 3");
		System.out.println(str3);

		obj1 = Optional.ofNullable("Arijit");
		obj1.ifPresent((val) -> System.out.println(val));
		System.out.println(obj1.map((val) -> {
			return val.toUpperCase();
		}).get());
		System.out.println(obj1.of("").toString());
		
	}

	public static String getDefaultString() {
		System.out.println("IN Default Method");
		return "default";
	}

}
