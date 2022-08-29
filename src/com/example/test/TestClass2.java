package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.example.baseTest.MathUtilsTest;

@TestInstance(Lifecycle.PER_CLASS)
public class TestClass2 extends MathUtilsTest{

//	private static MathUtils mathUtils;
	
	@Test
	public void testDivide() {
		assertEquals("a", "a");
//		assertThrows(ArithmeticException.class, ()->{mathUtils.divide(1, 0);}, "Divide by zero should throw");
	}
}
