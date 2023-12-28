package com.pattern;

import java.util.Scanner;

public class P1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value: ");
		int n=sc.nextInt();
		char ch='A';
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j) {
					System.out.print(ch +"\t");
					ch++;
				}
				else
					System.out.print((i+j)+"\t");
			}
			System.out.println();
		}
	}
}
