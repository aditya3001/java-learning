package com.example.java8feature;

import java.util.StringJoiner;

public class StringJoinerExample {

	public static void main(String[] args) {
//		final StringJoiner joinNames = new StringJoiner("-", "[","]");
//		
//		joinNames.add("ABC");
//		joinNames.add("ABC");
//		joinNames.add("ABC");
//		
//		System.out.println(joinNames.toString());
//		final StringJoiner joinNames1 = new StringJoiner("-", "[","]");
//		
//		joinNames1.setEmptyValue("Empty");
//		System.out.println(joinNames1);

		String str = "''''''' '''";
		String result = "";

		System.out.println(str);
		result = str.substring(1, str.length() - 1);
		StringBuilder processedResult = new StringBuilder();
		int index = 0;
		if (result.length() > 0 && str.startsWith("'")) {
			
			while(index < result.length()) {
				if(index+1 < result.length()&&result.charAt(index) == '\'' && result.charAt(index+1) == '\'') {
					processedResult.append(result.charAt(index));
					index+=2;

				}else {
					processedResult.append(result.charAt(index));
					index++;
				}
			}
			
		}
		System.out.println(result.equals(" "));
		System.out.println("RESULT : "+ processedResult);

	}

}
