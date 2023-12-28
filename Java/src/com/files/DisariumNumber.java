package com.files;

public class DisariumNumber {

	public static double DisariumNumber(int n)
	{
		int num=n;
		int count=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		double sum=0;
		while(n>0)
		{
			int rem=n%10;
			double power=Math.pow(rem, count);
			sum=sum+power;
			n=n/10;
			count--;
		}
		return sum;
	}
	public static void main(String[] args) {
		int n=179;
		if(DisariumNumber(n)==n)
		{
			System.out.println("Disarium number");
		}
		else
		{
			System.out.println("Not a Disarium number");
		}
	}
}
