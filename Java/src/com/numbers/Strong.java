package com.numbers;

public class Strong {
	public static void main(String[] args) {
		int n=145;
		int temp=n;
		int res=0;
		while(n!=0)
		{
			int ld=n%10;
			res+=fact(ld);
			n/=10;
		}
		System.out.println(res==temp?"strong":"not strong");
	}
	public static int fact(int ld)
	{
		int fact=1;
		for(int i=1;i<=ld;i++)
		{
			fact*=i;
		}
		return fact;
	}
}
