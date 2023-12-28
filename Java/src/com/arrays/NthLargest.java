package com.arrays;

public class NthLargest {
	public static void main(String[] args) {
		int[] a= {67,89,0,45,8};
		int n=4;
		int rmax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>rmax)
				rmax=a[i];
		}
		for(int i=1;i<n;i++) {
			int max=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]>max&&a[j]<rmax) 
					max=a[j];
			}
			rmax=max;
		}
		System.out.println(rmax);
	}
}
