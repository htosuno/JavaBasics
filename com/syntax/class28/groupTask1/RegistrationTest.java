package com.syntax.class28.groupTask1;

public class RegistrationTest {
	public static void main(String[] args) {
		Registration r = new Registration();
		System.out.print("email after setEmail with un@gmail.com, email = ");
		r.setEmail("un@gmail.com");
		System.out.println(r.getEmail());
		System.out.print("email after setEmail with un@yahoo.com, email = ");
		r.setEmail("un@yahoo.com");
		System.out.println(r.getEmail());
		System.out.print("email after setUserName with ht, userName = ");
		r.setUserName("un");
		System.out.println(r.getUserName());
		System.out.print("email after setUserName with htosuno, userName = ");
		r.setUserName("userName1");
		System.out.println(r.getUserName());
		System.out.print("email after setPassword with pw, password = ");
		r.setPassword("pw");
		System.out.println(r.getPassword());
		System.out.print("email after setPassword with 2userName11, password = ");
		r.setPassword("2userName11");
		System.out.println(r.getPassword());
		System.out.print("email after setPassword with pw123456, password = ");
		r.setPassword("pw123456");
		System.out.println(r.getPassword());

	}
}