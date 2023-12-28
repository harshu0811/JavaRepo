package com.files;

public class PerfectNumber {

	public static int PerfectNumber(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int num=6;
		if(PerfectNumber(num)==num)
		{
			System.out.println("Perfect Number");
		}
		else
		{
			System.out.println("Not a Perfect number");
		}
			
	}
}
