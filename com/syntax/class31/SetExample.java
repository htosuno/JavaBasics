package com.syntax.class31;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		HashSet<String> brands = new HashSet<>();
		brands.add("Nike");
		brands.add("Adidas");
		brands.add("H&M");
		brands.add("Zara");
		brands.add("Uniqlo");
		brands.add("Adidas");
		brands.add("H&M");

		System.out.println(brands.size());
		System.out.println(brands);

		System.out.println(brands.contains("Nike"));

		LinkedHashSet<String> luxBrand = new LinkedHashSet<String>();
		luxBrand.add("Prada");
		luxBrand.add("Chanel");
		luxBrand.add("Gucci");
		luxBrand.add("LV");
		luxBrand.add("Gucci");
		luxBrand.add("LV");

		System.out.println(luxBrand.size());
		System.out.println(luxBrand);

		TreeSet<String> allBrands = new TreeSet<>(brands);
		allBrands.add("Calvin Clein");
		allBrands.addAll(luxBrand);
		System.out.println(allBrands);

		Iterator<String> brandIt = allBrands.iterator();
		
		while(brandIt.hasNext()) {
			System.out.println(brandIt.next());
		}
		Set<Double> tSet=new LinkedHashSet<>();
		tSet.add(10.99);
		tSet.add(1.99);
		tSet.add(1000.99);
		tSet.add(10.01);
		tSet.add(10.99);
		
		System.out.println(tSet);
		
		
		
		

	}

}
