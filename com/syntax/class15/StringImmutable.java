package com.syntax.class15;

public class StringImmutable {

	public static void main(String[] args) {
		String str = "Today is a good day";
		
		str.replace("good", "amazing");
		System.out.println(str);
		
		str.concat(". I love Sundays");
		System.out.println(str);
		
		str.toUpperCase();
		System.out.println(str);
		
		String s1=new String("Hello");
		String s2="Hello";
		String s3="Hello";
		String s4="Hello";
		
		s2.toUpperCase();
		s2=s2.toLowerCase();
		
		System.out.println(str);
		

		
		
		
	}

}
