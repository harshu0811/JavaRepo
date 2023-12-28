package com.files;

public class ArmStrong {

	public static double ArmStrong(int n)
	{
		int num=n;
		int count=0;
		double sum=0;
		while(num>0)
		{
			count++;
			num=num/10;
		}
		while(n>0)
		{
			int rem=n%10;
			double pow=0;
			pow= Math.pow(rem, count);
			sum=sum+pow;	
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=143;
		if(ArmStrong(num)==num)
		{
			System.out.println("ArmStrong number");
		}
		else
		{
			System.out.println("Not a Armstrong number");
		}
	}
}
