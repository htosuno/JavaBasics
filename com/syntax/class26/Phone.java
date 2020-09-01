package com.syntax.class26;

public abstract class Phone {
	public void makeCall() {
		System.out.println("Call");
	}
	public void sendText() {
		System.out.println("Text");
	}
	public abstract void navigate();
	public abstract void playMusic();
}
class Samsung extends Phone{
	public void navigate() {
		System.out.println("Samsung navigates...");
	}
	public void playMusic() {
		System.out.println("Samsung plays music...");
	}
}
class IPhone extends Phone{
	public void navigate() {
		System.out.println("IPhone navigates...");
	}
	public void playMusic() {
		System.out.println("IPhone plays music...");
	}
}
