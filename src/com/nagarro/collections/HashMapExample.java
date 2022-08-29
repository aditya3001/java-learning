package com.nagarro.collections;

import java.util.HashMap;
import java.util.Map;

class Key {
	private String val;
	
	public Key(String val) {
		this.val = val;
	}

	@Override
	public int hashCode() {
		return val.length();
	}

	@Override
	public boolean equals(Object o) {
		return false;
	}

}

public class HashMapExample {

	public static void main(String args[]) {
		Key key1 = new Key("abc");
		Key key2 = new Key("abcd");

		Map<Key, String> m = new HashMap<>();
		m.put(key1, "vipul");
		m.put(key1, "varun");
		m.put(key2, "vivek");

		System.out.println(key2 == key2);
		System.out.println(m.toString());
		System.out.println(m.get(key1));
	}

	
}