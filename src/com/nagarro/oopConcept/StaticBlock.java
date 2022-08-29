package com.nagarro.oopConcept;

public class StaticBlock {

	public static void main(String args[]) {

//		This code inside static block is executed only once: the first time the class is loaded into memory.
		Test t1 = new Test();
		Test t2 = new Test();
		Test t3 = new Test();
	}
}

class Test {

	static int i;
	int j;
	
	static {
		i = 10;
		System.out.println("static block called ");
	}
	
	{
        //Non-static block statement
		//Will be executed every time this class has been instantiated
    }
 
    static {
        //Static block statement
    	//Will be executed only once
    }

	Test() {
		System.out.println("Constructor called");
	}

}