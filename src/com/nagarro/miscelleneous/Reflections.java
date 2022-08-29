package com.nagarro.miscelleneous;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Test {
	// creating a private field
	private String s;

	// creating a public constructor
	public Test() {
		s = "GeeksforGeeks";
	}

	// Creating a public method with no arguments
	public void method1() {
		System.out.println("The string is " + s);
	}

	// Creating a public method with int as argument
	public void method2(int n) {
		System.out.println("The number is " + n);
	}

	// creating a private method
	private void method3() {
		System.out.println("Private method invoked");
	}
}

public class Reflections {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, NoSuchFieldException {

		final Test testObject = new Test();
		Class cls = testObject.getClass();

		System.out.println("Class Name : " + cls.getName());

		Constructor constructor = cls.getConstructor();

		System.out.println("Constructor Name : " + constructor.getName());

		Method[] methods = cls.getMethods();
		for (Method method : methods) {
			System.out.println("Method Name is : " + method.getName());
		}

		// creates object of desired method by providing the
		// method name and parameter class as arguments to
		// the getDeclaredMethod
		Method methodcall1 = cls.getDeclaredMethod("method2", int.class);

		// invokes the method at runtime
		methodcall1.invoke(testObject, 19);

		// creates object of the desired field by providing
		// the name of field as argument to the
		// getDeclaredField method
		Field field = cls.getDeclaredField("s");

		// allows the object to access the field irrespective
		// of the access specifier used with the field
		field.setAccessible(true);

		// takes object and the new value to be assigned
		// to the field as arguments
		field.set(testObject, "JAVA");

		// Creates object of desired method by providing the
		// method name as argument to the getDeclaredMethod
		Method methodcall2 = cls.getDeclaredMethod("method1");

		// invokes the method at runtime
		methodcall2.invoke(testObject);

		// Creates object of the desired method by providing
		// the name of method as argument to the
		// getDeclaredMethod method
		Method methodcall3 = cls.getDeclaredMethod("method3");

		// allows the object to access the method irrespective
		// of the access specifier used with the method
		methodcall3.setAccessible(true);

		// invokes the method at runtime
		methodcall3.invoke(testObject);

	}

}
