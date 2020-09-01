package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		ArrayList<String> cars=new ArrayList<>();
		String[] sA= {"Honda", "BMW", "Tesla", "Ford"};
		cars.addAll(Arrays.asList(sA));
		
		Iterator<String> carsI=cars.iterator();
		
		while(carsI.hasNext()) {
			System.out.println(carsI.next());
		}
		
		for(String s:cars) {
			System.out.println(s);
		}
		
		ArrayList<String> words=new ArrayList<>();
		String[] sA2= {"ytfe", "jhgwef", "jhsgfriu", "jhsvde", "hsgdf"};
		words.addAll(Arrays.asList(sA2));
		
		System.out.println(words);
		
		Iterator<String> wordsI=words.iterator();
		
		while(wordsI.hasNext()) {
			if(wordsI.next().endsWith("e")) {
				wordsI.remove();
			}
		}
		System.out.println(words);
		
	}

}
