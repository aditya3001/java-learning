package com.nagarro.collections;

public class QueueAlt {
	private int size = 10;
	private int[] array;
	private int currentIndex = 0;
		
	public QueueAlt(int size) {
		array = new int[size];
	}
	public int push(int i) {
		array[currentIndex+1] = i;
		currentIndex+=1;
		return i;
	}
	
	public int pop() {
		int objToReturn = 0;
		if(currentIndex>0) {
			objToReturn = array[0];
			
			refreshArray();
		} else {
		}
		 return objToReturn;
	}
	private void refreshArray() {
		
	}

}
