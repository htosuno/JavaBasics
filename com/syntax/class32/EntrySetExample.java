package com.syntax.class32;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetExample {

	public static void main(String[] args) {

		Map<Integer, String> floors = new HashMap<>();
		floors.put(1, "Company 1");
		floors.put(2, "Company 2");
		floors.put(3, "Company 3");
		floors.put(4, "Company 4");

		System.out.println("Floors map " + floors);

		Set<Entry<Integer, String>> entries = floors.entrySet();
		System.out.println("Set of Entry objects: " + entries);

		for (Entry<Integer, String> entry : entries) {
			System.out.println(entry.getKey() + "----" + entry.getValue());
		}

		System.out.println("using itereator----------------");
		Iterator<Entry<Integer, String>> it = entries.iterator();

		while (it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + "====" + entry.getValue());
		}
	}

}
