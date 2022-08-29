package com.nagarro.miscelleneous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastVsFailSafe {

	public static void main(String[] args) {

//		Fail Safe
		final List<Integer> integerLists = new CopyOnWriteArrayList<>();
		integerLists.add(1);
		integerLists.add(2);
		integerLists.add(3);
		final Iterator<Integer> iterator = integerLists.iterator();
		while (iterator.hasNext()) {
			int a = iterator.next();
			if (a == 1) {
				System.out.println(Integer.valueOf(a));
				integerLists.remove(Integer.valueOf(a));
			}
			System.out.println(a);
		}

		System.out.println("AFETR REMOVAL");
		for (int a : integerLists) {
			System.out.println(a);
		}

//		Fail Fast
		final List<Integer> integers = new ArrayList<>();
		integers.add(1);
		integers.add(2);
		integers.add(3);
		final Iterator<Integer> itr = integers.iterator();
		while (itr.hasNext()) {

			int a = itr.next();
			integers.remove(a); // throw concurrentmodificationexception
//		    if(a==1) {
//			  itr.remove();         // will remove the element successfully
//		    }
		}

		System.out.println("AFETR REMOVAL");
		for (int a : integers) {
			System.out.println(a);
		}

//		Note : If you remove an element via Iterator remove() method, exception will not be thrown. 
//		However, in case of removing via a particular collection remove() 
//		method, ConcurrentModificationException will be thrown.

	}
	
	

}
