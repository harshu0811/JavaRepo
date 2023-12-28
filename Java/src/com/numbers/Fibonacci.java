package com.numbers;

import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		int fib1=0;
		int fib2=1;
		int fib3;
		if(n==1) {
			System.out.println(fib1);
		}
		else if(n==2) {
			System.out.println(fib1+","+fib2);
		}
		else {
		System.out.print(fib1+","+fib2+",");
		for(int i=3;i<=n;i++) {
			fib3=fib1+fib2;
			System.out.print(fib3+",");
			fib1=fib2;
			fib2=fib3;
		}
		}
	}
}
