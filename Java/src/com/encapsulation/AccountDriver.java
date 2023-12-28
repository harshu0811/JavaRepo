package com.encapsulation;

public class AccountDriver {
	public static void main(String[] args) {
		BankAccount ba=new BankAccount();
		ba.deposit(330);
		System.out.println(ba.getBalance(1234));
		ba.withdrawal(1234,40);
		
	}
}
