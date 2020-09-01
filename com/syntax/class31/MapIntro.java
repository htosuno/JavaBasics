package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {

	public static void main(String[] args) {

		HashMap<Integer, String> hMap = new HashMap<>();
		hMap.put(10, "John");
		hMap.put(11, "Jane");
		hMap.put(12, "James");
		System.out.println(hMap);

		hMap.put(12, "Gozde");
		hMap.put(13, "Olga");
		hMap.put(1, "Olga");

		System.out.println(hMap);

		System.out.println(hMap.size());
		System.out.println(hMap.isEmpty());

		System.out.println("Map contains key object 12 = " + hMap.containsKey(12));
		System.out.println("Map contains value as John = " + hMap.containsValue("John"));

		System.out.println(hMap.get(13));

		hMap.remove(10);
		System.out.println(hMap);

	}

}
