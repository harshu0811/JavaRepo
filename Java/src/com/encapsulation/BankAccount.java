package com.encapsulation;

public class BankAccount {
	private double balance;
	private int pin=1234;
	String RESET="\u001B[0m";
	String GREEN="\u001B[32m";
	
	//getter
	public String getBalance(int pin) {
		if(this.pin==pin) {
			return "balance :"+balance;
		}
		else
		{
			System.err.print("invalid pin, balance cant be disclosed");
			return "";
		}
	}
	//setter
	public void deposit(double deposit)
	{
		if(deposit>0) {
			this.balance+=deposit;
			System.out.println(GREEN+"Deposited successfully"+RESET);
		}
		else
			System.err.println("deposition money should be greater than zero, please deposit proper amount");
	}
	
	public void withdrawal(int pin,double withdrawal)
	{
		if(this.pin==pin) {
			if(withdrawal<=balance && withdrawal >0) {
				this.balance-=withdrawal;
				System.out.println(GREEN+"Withdrawal successfully"+RESET);
			}
			else
				System.err.println("withdrawal amount is more then balance cant be withdraw");
		}
		else
			System.err.println("pin is invalid, Withdrawal not succeed");
	}
	
}
