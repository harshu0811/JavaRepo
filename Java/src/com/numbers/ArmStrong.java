package com.numbers;

public class ArmStrong {
	public static void main(String[] args) {
		int n=153; //153, 370, 371, 407
		int temp=n;
		int count=count(n);
		int res=0;
		while(n!=0)
		{
			int ld=n % 10;
			res+=power(ld,count);
			n/=10;
		}
		System.out.println(temp==res?"armstrong":"not armstrong");
	}
	public static int count(int n) {
		int count=0;
		while(n!=0) {
			count++;
			n/=10;
		}
		return count;
	}
	public static int power(int ld,int count)
	{
		int power=1;
		for(int i=1;i<=count;i++)
		{
			power*=ld;
		}
		return power;
	}
}
