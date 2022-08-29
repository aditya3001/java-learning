package com.nagarro.miscelleneous;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Demo implements Serializable {

	private static final long serialVersionUID = 1L;
	public int a;
	public String b;

	public Demo(int a, String b) {
		this.a = a;
		this.b = b;
	}

}

class Emp implements Serializable {
	private static final long serialVersionUID = 129348938L;
	transient int a;
	static int b;
	String name;
	int age;

	public Emp(String name, int age, int a, int b) {
		this.name = name;
		this.age = age;
		this.a = a;
		this.b = b;
	}

}

public class SerialisationVsDeserialisation {

	public static void printdata(Emp object1) {

		System.out.println("name = " + object1.name);
		System.out.println("age = " + object1.age);
		System.out.println("a = " + object1.a);
		System.out.println("b = " + object1.b);
	}

	public static void main(String[] args) {

//		Mechanism used to persist the object
		/*
		 * Advantages of Serialisation - Save/persist an object - To travel an object
		 * across a network
		 * 
		 * NOTE: Only non-static data members are saved via Serialization process.
		 */

		final Demo object = new Demo(1, "MyDemo");
		final String filename = "file.k";

		// Serialization
		try {
			// Saving of object in a file
			final FileOutputStream file = new FileOutputStream(filename);
			final ObjectOutputStream out = new ObjectOutputStream(file);

			// Method for serialization of object
			out.writeObject(object);

			out.close();
			file.close();

			System.out.println("Object has been serialized");

		} catch (NotSerializableException n) {
			System.out.println("NotSerializableException caught");

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		Demo object1 = null;

		// Deserialization
		try {
			// Reading the object from a file
			final FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			// Method for deserialization of object
			object1 = (Demo) in.readObject();

			in.close();
			file.close();

			System.out.println("Object has been deserialized ");
			System.out.println("a = " + object1.a);
			System.out.println("b = " + object1.b);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException is caught");
		}

//		EXAMPLE 2
		Emp empObject = new Emp("ab", 20, 2, 1000);
		String fileName = "Aditya.txt";

//        Serialization
		try {
			FileOutputStream fileOutputStream = new FileOutputStream(fileName);
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

			// Method for serialization of object
			objectOutputStream.writeObject(empObject);

			objectOutputStream.close();
			fileOutputStream.close();

			System.out.println("Object has been serialized\n" + "Data before Deserialization.");
			printdata(empObject);

			// value of static variable changed
			empObject.b = 3000;
		} catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		empObject = null;

		// Deserialization
		try {

			// Reading the object from a file
			FileInputStream fileInputStream = new FileInputStream(fileName);
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

			// Method for deserialization of object
			empObject = (Emp) objectInputStream.readObject();

			objectInputStream.close();
			fileInputStream.close();
			System.out.println("Object has been deserialized\n" + "Data after Deserialization.");
			printdata(empObject);

			// System.out.println("z = " + object1.z);
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}

	}
}
