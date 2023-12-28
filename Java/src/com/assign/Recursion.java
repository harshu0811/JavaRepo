package com.assign;

public class Recursion {
	static int count=0;
	public static void main(String[] args) {
		int n=24;
		System.out.println(rec(n));
	}
	public static String rec(int n) {
		count++;
		if(count<=10) {
			return n+","+rec(n-1);
		}
		else
			return "";
	}
}
