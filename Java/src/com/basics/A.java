package com.basics;

public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		int b='b';
		System.out.println(a.toString());
		System.out.println(a.hashCode());
		System.out.println(Integer.toHexString(a.hashCode()));
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.getClass().getName()+"@"+Integer.toHexString(a.hashCode()));
	}
}
