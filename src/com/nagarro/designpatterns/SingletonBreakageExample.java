package com.nagarro.designpatterns;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.rmi.AlreadyBoundException;

class SingletonExample implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private static SingletonExample object;

	private SingletonExample() throws AlreadyBoundException {
		if (object != null) {
			throw new AlreadyBoundException("as");
		}
	}

	public static SingletonExample getInstance() {
		if (object == null) {
			try {
				object = new SingletonExample();
			} catch (AlreadyBoundException e) {
				e.printStackTrace();
			}
		}
		return object;
	}

	public Object readResolve() {
		return object;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return object;
	}

}

public class SingletonBreakageExample {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException,
			FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {

		final SingletonExample singletonExample1 = SingletonExample.getInstance();

//		Break via Reflection
//		final Constructor<SingletonExample> constructor = SingletonExample.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		SingletonExample singletonExample2 = (SingletonExample) constructor.newInstance();
//
//		System.out.println("VIA REFLECTION");
//		System.out.println("hashCode of instance 1 is - " + singletonExample1.hashCode());
//        System.out.println("hashCode of instance 2 is - " + singletonExample2.hashCode());

//		Via Deserialization
		ObjectOutput out = new ObjectOutputStream(new FileOutputStream("file.text"));
        out.writeObject(singletonExample1);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("file.text"));
        SingletonExample singletonExample2 = (SingletonExample) in.readObject();
        in.close();

        System.out.println("VIA DESERIALISATION");
        System.out.println("hashCode of instance 1 is - " + singletonExample1.hashCode());
        System.out.println("hashCode of instance 2 is - " + singletonExample2.hashCode());

		
//		Via Cloning
//		SingletonExample singletonExample2 = (SingletonExample) singletonExample1.clone();
//
//		System.out.println("VIA CLONING");
//		System.out.println("hashCode of instance 1 is - " + singletonExample1.hashCode());
//		System.out.println("hashCode of instance 2 is - " + singletonExample2.hashCode());
	}

}
