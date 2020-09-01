package com.syntax.class15;

public class ReplaceFunction {

	public static void main(String[] args) {
		String me = "I am a good tester. I am a good person";

		String str = "Hello";

		str = str.replace('e', 'E');
		System.out.println(str);

		me = me.replace("good", "great");
		System.out.println(me);

		me = me.replace("we", "us");// no change
		System.out.println(me);

		String sample = "Phone nimber is 1234567890";
		sample = sample.replaceAll("[A-Z]", "");
		System.out.println(sample);

		sample = sample.replaceAll("[a-z]", "").trim();
		System.out.println("New String value is = " + sample);
		
		String sample2 = "Hello 1234567890";
		sample2 = sample2.replaceAll("[A-Za-z ]", "");
		System.out.println(sample2);
		

	}

}
