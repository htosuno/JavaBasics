package com.syntax.class30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemovingElementsFromCollection {

	public static void main(String[] args) {
		ArrayList<String> cities=new ArrayList<>();
		String[] sA= {"Kyiv", "LA", "LA", "Istanbul", "DC", "New York"};
		cities.addAll(Arrays.asList(sA)) ;	
		
		System.out.println(cities);
		
		Iterator<String> citiesIt=cities.iterator();
		
		String city;
		while(citiesIt.hasNext()) {
			city=citiesIt.next();
			if(city.equals("LA") || city.equals("New York")) {
				citiesIt.remove();
			}
		}
		System.out.println(cities);

		
	}

}
