package com.syntax.class18;

public class House {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		cat1.name = "Jessy";
		cat1.age = 8;
		cat1.color = "grey";

		Cat cat2 = new Cat();
		cat2.name = "Kathy";
		cat2.age = 5;
		cat2.color = "yellow";

		cat1.displayCat();
		cat2.displayCat();
		cat1.displayCommonFeatures();

		cat2.tail = false;
		cat1.displayCommonFeatures();
		Cat.tail = true;
		cat2.displayCommonFeatures();

	}

}
