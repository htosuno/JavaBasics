package com.syntax.class26;

public class PhoneTest {
	public static void main(String[] args) {
//		new Phone();abstract class can not be initialized

		Phone iphone = new IPhone();
		iphone.makeCall();
		iphone.sendText();
		iphone.navigate();
		iphone.playMusic();
		
		Phone samsung = new Samsung();
		samsung.makeCall();
		samsung.sendText();
		samsung.navigate();
		samsung.playMusic();
	}

}
