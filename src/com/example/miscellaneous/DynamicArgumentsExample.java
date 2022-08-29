package com.example.miscellaneous;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hamcrest.core.IsInstanceOf;

public class DynamicArgumentsExample {
	
	public enum Keywords{
		Data,If;
	}
	
	public static void call(Object e1, Object...objects) {
		System.out.println(objects.length);
		System.out.println(objects[0]);
	}

	public static void main(String[] args) {
		call("abc",new String[] { "foo", "bar" });

	}

}
