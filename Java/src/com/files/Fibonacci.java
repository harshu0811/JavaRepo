package com.files;

public class Fibonacci {

	public static void main(String[] args) {
		int a=10;
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		while(a>2)
		{
			int num3=num1+num2;
			System.out.println(num3);
			num1=num2;
			num2=num3;
			a--;
		}
	}
}
