package com.assign;

public class DEmO {
	public static void main(String[] args) {
		int num='C';
		String res="";
		while(num>0) {
			int rem=num%2;
			res=rem+res;
			num/=2;
		}
		System.out.println(res);
	}
}
