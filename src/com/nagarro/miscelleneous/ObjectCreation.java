package com.nagarro.miscelleneous;

import java.lang.reflect.Constructor;

public class ObjectCreation implements Cloneable {
	
	String str = "New Object Created";
	
	public void setName(String str)   
	{   
	this.str = str;   
	}   

	public static void main(String[] args) throws ClassNotFoundException {

		final ObjectCreation objectCreationExample = new ObjectCreation();
		
		System.out.println(objectCreationExample.str);

		try {

			final ObjectCreation objCreationViaClone = (ObjectCreation) objectCreationExample.clone();
			System.out.println(objCreationViaClone.str);

		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		try {
			final Class ObjectCreationClass = Class.forName("com.nagarro.miscelleneous.ObjectCreation");
			final ObjectCreation objCreationViaInstance = (ObjectCreation) ObjectCreationClass.newInstance();
			System.out.println(objCreationViaInstance.str);
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		
		try  
		{   
		Constructor<ObjectCreation> constructor = ObjectCreation.class.getDeclaredConstructor();   
		ObjectCreation objCreation = constructor.newInstance();   
		objCreation.setName("Something");   
		System.out.println(objCreation.str);   
		}   
		catch (Exception e)   
		{   
		e.printStackTrace();   
		}   

	}
	

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// invokes the clone() method of the super class
		return super.clone();
	}

}
