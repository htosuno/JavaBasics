package com.syntax.class32;

//import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class Task1 {
	public static void main(String[] args) {
		
		TreeMap<String, String> cMap = new TreeMap<>();
		cMap.put("Turkey", "Ankara");
		cMap.put("England", "London");
		cMap.put("USA", "Washington, DC");
		cMap.put("France", "Paris");
		cMap.put("Italy", "Rome");
		
		Set<String> countries=cMap.keySet();
		for (String s : countries) {
			System.out.println(cMap.get(s)+" is capital of "+s);		
		}

	}

}
