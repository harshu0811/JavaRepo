package com.upcastdowncast;

import java.util.Scanner;

public class CabDriver {
	public static void main(String[] args) {
		Cab c=null;
		System.out.println("====welcome to cab booking====");
		System.out.println("select below choices :");
		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("3. SUV");
		System.out.println("enter your choice :");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		switch(choice) {
		case 1: c=new Mini();break;
		case 2: c=new Sedan();break;
		case 3: c=new SUV();break;
		default: System.err.println("=====Invalid choice=====");
		}
		if(c instanceof Mini) {
			System.out.println(((Mini) c).price);                 
		}
		else if(c instanceof Sedan) { 
			System.out.println(((Sedan)c).price);
		}
		else if(c instanceof SUV) {
			System.out.println(((SUV)c).price);
		}
	}
}
