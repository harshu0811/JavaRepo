package com.assign;

public class MaxConsecutiveOnes {
	public static void main(String[] args) {
		int[] arr= {1,1,1,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,1,1};
		int count=0;
		int min=arr.length;
		boolean flag=false;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				count++;
				flag=true;
			}
			else if(flag)
			{
				if(count<min) {
					min=count;
				}
				flag=false;
				count=0;
			}
		}
		if(flag) {
			if(count<min) {
				min=count;
			}
		}
		System.out.println(min);
	}
}
