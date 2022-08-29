package com.example.java8feature;

public class ArrayListAlt<T> {
	
	private Class T;
	private int[] array;
	private int size = 2;
	private int currentIndex = 0;
	
	public ArrayListAlt() {
		
	}
	public ArrayListAlt(Class t, int[] array) {
		T = t;
		this.array = array;
	}
	
	public void add(int obj) {
		if(array == null) {
			array = new int[size];
			array[currentIndex] = obj;
			currentIndex++;
		}else if(currentIndex < size) {
			array[currentIndex] = obj;
			currentIndex++;
		} else {
			size = size*2;
			array = new int[size];
			int i = 0;
			
		}
	}
	
	public T get(int index) {
		
		return null;
	}
	
	

}
