package com.files;

public class StrongNumber {

	public static int StrongNumber(int n)
	{
		int num=n;
		int sum=0;
		while(num>0)
		{
			int fact=1;
			int rem=num%10;
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		return sum;
	}
	public static void main(String[] args) {
	
		int num=145;
		if(StrongNumber(num)==num)
		{
			System.out.println("Strong number");
		}
		else
		{
			System.out.println("Not a Strong number");
		}
	}
}
