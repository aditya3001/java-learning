package com.nagarro.miscelleneous;

import java.util.Comparator;

public class Compare implements Comparator<Compare> {

	@Override
	public int compare(Compare o1, Compare o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
class TestCompare {
	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		System.out.println("s1 == s2 is:" + s1 == s2);
	}
}
