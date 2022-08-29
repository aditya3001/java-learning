package com.nagarro.string;



public class StringBufferVsStringBuilder {
	
	int a;
	public static void StringConcat(String str) {
		str = str + "_concatenated_as_String";
	}
	
	public static void StringBuilderConcat(StringBuilder str) {
		str.append("_concatenated_as_StringBuilder");
	}
	
	public static void StringBufferConcat(StringBuffer str) {
		str.append("_concatenated_again_using_stringBuffer_append");
	}

	public static void main(String[] args) {
		
		String str = "string";
		StringBuilder strBuilder = new StringBuilder("string");
		StringBuffer strBuffer = new StringBuffer("string");
		StringConcat(str);
		System.out.println(str);
		StringBuilderConcat(strBuilder);
		System.out.println(strBuilder);
		StringBufferConcat(strBuffer);
		System.out.println(strBuffer);
		
		
		//Conversion from string to string builder and vice versa
		String strC = "String";
        StringBuffer sbr = new StringBuffer(strC);
        StringBufferConcat(sbr);
        System.out.println(sbr);
        sbr.reverse(); 
        System.out.println(sbr);
        
       String a = "dsf";
       a = "vcv";
       System.out.println(a);

        }
	
	
	}

	
