package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		// to add values to the arrayList
		arrayList.add("Hello");// 0
		arrayList.add("Welcome");// 1
		arrayList.add("How are you");// 2
		
		System.out.println(arrayList);

		int arrayListSize = arrayList.size();
		System.out.println(arrayListSize);
		
		System.out.println(arrayList.get(2));
		
		arrayList.add("Good Bye");
		arrayList.add("Thank you");
		
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
		arrayList.remove(0);
		System.out.println(arrayList.size());
		System.out.println(arrayList);
		
		arrayList.set(2, "Bye");
		System.out.println(arrayList);


	}

}
