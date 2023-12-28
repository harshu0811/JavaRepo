package com.arrays;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		int[] b= {5,6,7,8};
		int[] c= new int[a.length+b.length];
		int j=0;
		for(int i=0;i<c.length;i++)
		{
			if(i<a.length)
				c[i]=a[i];
			else
				c[i]=b[j++];
		}
		System.out.println(Arrays.toString(c));
	}
}
