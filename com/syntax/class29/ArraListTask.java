package com.syntax.class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArraListTask {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<>();
		System.out.println(names.size());
		String[] sA= {"Ann", "Bob", "Dan", "John", "Jack"};
		names.addAll(Arrays.asList(sA)) ;
		
		System.out.println(names);
		
		names.clear();
		
		System.out.println(names);
		
		names.addAll(Arrays.asList(sA)) ;
		
		names.remove("Dan");
		
		System.out.println(names);
		for(String s: names) {
			System.out.println(s);
		}
		int i=0;
		int sz=names.size();
		while(i<sz) {
			System.out.println(names.get(i));
			i++;
		}
		
		
		Iterator<String> it=names.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
//		ArrayList<Double> dAL= new ArrayList<>();
//		Double[] dA={10.99,9.99,8.99,9.99};
//		dAL.addAll(Arrays.asList(dA));
		

		
		
	}

}
