package com;

public class Q5_ReverseSentence {

	public static void main(String[] args) {

		/*StringBuilder sb = new StringBuilder("Hello Java World");
		sb.reverse();*/
		
		String str= "Hello World";
		String s = revStr(str);
		
		System.out.println(s);
	}
	
	static String revStr(String str) {
		if(str.isEmpty())
			return str;
		return revStr(str.substring(1)) + str.charAt(0);
	}

}
