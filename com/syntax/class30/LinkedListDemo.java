package com.syntax.class30;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> foods = new LinkedList<>();
		String[] sA = { "Doner", "Soup", "Salad", "Iskender" };
		foods.addAll(Arrays.asList(sA));
		System.out.println(foods);
		
		LinkedList<String> deserts = new LinkedList<>();
		String[] sA2 = { "cookies", "brownie", "baklava" };
		deserts.addAll(Arrays.asList(sA2));
		System.out.println(deserts);
		
		foods.addAll(2,deserts);
		System.out.println(foods);
		
		Iterator<String> it=foods.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		it=foods.iterator();
		String food;
		while(it.hasNext()) {
			food=it.next();
			if(food.equals("cookies") || food.equals("brownie")) {
				it.remove();
			}
		}
		System.out.println(foods);
	}

}
