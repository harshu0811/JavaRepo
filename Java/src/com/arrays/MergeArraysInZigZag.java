package com.arrays;

import java.util.Arrays;

public class MergeArraysInZigZag {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,6};
		int[] c= new int[a.length+b.length];
		int j=0;
		int k=b.length-1;
		for(int i=0;i<c.length;i++)
		{
			if(i%2==1&&j<a.length)
				c[i]=a[j++];
			else if(i%2==0&&k!=-1)
				c[i]=b[k--];
		}
		System.out.println(Arrays.toString(c));
	}
}
