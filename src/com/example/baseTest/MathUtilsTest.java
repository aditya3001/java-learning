package com.example.baseTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import com.example.test.MathUtils;


public abstract class MathUtilsTest {
	
	
	public MathUtils mathUtils;
	
	@BeforeEach
	public void init() {
		System.out.println("BEFORE EACH");
		mathUtils = new MathUtils();
	}
	
	@BeforeAll
	public void initMethod() {
		System.out.println("BEFORE CLASS");
		mathUtils = new MathUtils();
	}
	
	@AfterAll
	public void afterInitMethod() {
		System.out.println("AFTER CLASS");
		mathUtils = new MathUtils();
	}

//	@ParameterizedTest
//	@ValueSource(ints= {1,2,3})
//	void testDivide() {
//		
//		assertThrows(ArithmeticException.class, ()->{mathUtils.divide(1, 0);}, "Divide by zero should throw");
//	}

}
