package com.nagarro.miscelleneous;

class ChangeIt {
	static void doIt(int[] z) {
		z[0] = 0;
	}
	
	ChangeIt getObject() {
		System.out.println("Parent");
		return null;
	}
}

class ChangeItChild extends ChangeIt{
	
	ChangeItChild getObject(){
		System.out.println("Child");
		return null;
	}
	
	void method1(Object obj) {
		System.out.println("null is an object");
	}
	
	void method1(String str) {
		System.out.println("null is String");
	}
	

}


public class MiscExample1 {

	public static void main(String[] args) {
		
		final int[] myArr = {1,2,3,4,5};
		
		ChangeIt.doIt(myArr);
		
		for(int i = 0; i < myArr.length ; i++) {
			System.out.println(myArr[i]);
		}
		
		// Return type of overriding methods can be child and parent?
		// yes
		final ChangeIt obj = new ChangeItChild();
		obj.getObject();
		

		//Null is an object or String?
		// First string then objects
		final ChangeItChild childObj = new ChangeItChild();
		childObj.method1(null);
		
//		String str = ""And"";  - Compilation Error
		
	}

}
