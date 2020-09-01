package com.syntax.class29;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

		ArrayList<Integer> alist=new ArrayList<>();
		alist.add(100);
		alist.add(200);
		alist.add(300);
		
		System.out.println(alist.size());
		System.out.println(alist);
		
		alist.add(1);
		alist.add(2);
		alist.add(2);
		alist.add(2);
		alist.add(2);
		
		System.out.println(alist);
		
		alist.remove(4);
		
		System.out.println(alist);
		
		alist.remove((Integer)2);
		System.out.println(alist);

		




	}

}
