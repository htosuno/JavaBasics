package com.syntax.class14;
import java.util.Scanner;
//Accept username, password and confirm password from a user and check following requirements:
//
//Username and Password cannot be  empty, if so→ message=“Username and Password cannot be empty”.
//Password should be minimum 8 characters, if less → message=“Password is too short”.
//Password cannot contain username if so, → message=“Password cannot contain username”.
//Password should match confirmed password, if not  → message=“Passwords do not match”.
//
//Only after all requirements met → message “Your username and password has been created”


public class UserNamePWCheck {

	public static void main(String[] args) {
		String name, pw, pw1;		
		boolean isEmpty,isLT8Chars,containsUN;
		Scanner s = new Scanner(System.in);
		do {
			System.out.print("Enter User Name: ");
			name = s.nextLine();
			isEmpty=name.isEmpty();
			if(isEmpty)System.out.println("Username and Password cannot be empty");

		} while (isEmpty);
		do {
			System.out.print("Enter Password: ");
			pw = s.nextLine();
			isEmpty=pw.isEmpty();
			isLT8Chars=pw.length()<8;
			containsUN=pw.contains(name);
			
			if(isEmpty)System.out.println("Username and Password cannot be empty");
			if(isLT8Chars)System.out.println("Password is too short");
			if(containsUN)System.out.println("Password cannot contain username");

		} while (isEmpty||isLT8Chars||containsUN);
		
		do {
			System.out.print("Enter Password Again: ");
			pw1=s.next();
			if(!pw.equals(pw1)) {
				System.out.println("Passwords do not match");
				continue;
			}else {
				System.out.println("Your username and password has been created");
				break;
			}			
		}while(true);
	}
}
