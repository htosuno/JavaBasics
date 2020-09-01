package com.syntax.class35;

public class FinallyBlock {

	public static void main(String[] args) {
		
		String str="Java";
		try {
			System.out.println("I am a try block");
			char c=str.charAt(6);
			System.out.println(c);
		}catch(Exception e) {
			System.out.println("I m the catch block");
			System.out.println(e);
		}finally {
			System.out.println("I am a finally block");
		}
	}

}
