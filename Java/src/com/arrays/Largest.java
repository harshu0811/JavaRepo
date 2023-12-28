package com.arrays;

public class Largest {
	public static void main(String[] args) {
		int[] a= {67,89,0,45,8};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		System.out.println(max);
	}
}
