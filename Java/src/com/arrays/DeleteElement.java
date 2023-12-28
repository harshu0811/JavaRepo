package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElement {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5 };
		int element=1;
		int[] b=new int[a.length-1];
		int k=0;
		for (int i=0;i<a.length;i++) {
			if (a[i]!=element) {
				b[k++]=a[i];
			}
		}
		System.out.println(Arrays.toString(b));
	}
}
