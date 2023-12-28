package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class VS {
	public static void main(String[] args) {
		System.out.println("enter a string :");
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String temp="";
		System.out.println("enter the length :");
		int n=sc.nextInt();
		for(int i=0;i<s.length();i++)
		{
			int k=n+i;
			if(k<=s.length())
				temp+=s.substring(i,k)+" ";
		}
		String[] str=temp.split(" ");
		System.out.println("Before sorting :"+Arrays.toString(str));
		Arrays.sort(str);
		System.out.println("after sorting :"+Arrays.toString(str));
		System.out.println("1st part :"+str[0]);
		System.out.println("last part :"+str[str.length-1]);
	}
}
