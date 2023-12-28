package com.arrays;

public class SecondLargest {
	public static void main(String[] args) {
		int[] a= {67,89,0,45,8};
		int max=0;
		int smax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max)
				max=a[i];
		}
		for(int i=0;i<a.length;i++) {
			if(a[i]>smax&&a[i]<max) {
				smax=a[i];
			}
		}
		System.out.println(smax);
	}
}
