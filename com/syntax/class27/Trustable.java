package com.syntax.class27;

public interface Trustable {
	void trust();
}

interface Bank extends Trustable {
	void deposit();

	void withdraw();
}

class PNC extends Mortgage implements Bank,Investments {
	public void trust() {
		System.out.println("You can trust PNC bank");
	}
	public void deposit() {
		System.out.println("PNC bank takes deposits");
	}
	public void withdraw() {
		System.out.println("PNC bakd provide withdraws");
	}
	public void giveMortgage() {
		System.out.println("PNC gives mortgage");
	}
	public void doInvestments() {
		System.out.println("You can invest your money with PNC");
	}

}