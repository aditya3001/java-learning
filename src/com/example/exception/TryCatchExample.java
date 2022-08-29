package com.example.exception;

import java.io.FileNotFoundException;

public class TryCatchExample {

	public static void main(String[] args) {

		try {
			throw new CustomException("Custom Exception thrown");
		}catch (CustomException e){
			System.out.println("Catched RuntimeException");
		}catch (RuntimeException e) {
			System.out.println("Catched CustomException");
		}
		
		try {
			throw new FileNotFoundException("File Not found Exception thrown");
		}catch (CustomException e){
			System.out.println("Catched RuntimeException");
		}catch (RuntimeException e) {
			System.out.println("Catched CustomException");
		} catch (FileNotFoundException e) {
			System.out.println("Catched File Not found exception");
		} 
		
		throw new Error("Something happened");
	}

}
