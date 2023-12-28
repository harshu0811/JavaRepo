package com.arrays;

import java.util.Arrays;

public class InsertElement {
	public static void main(String[] args) {
		int[]a = {1,2,3,4,5};
		int element=6;
		int[]b=new int[a.length +1];
		for(int i=0;i < b.length;i++ ) {
			if(i <a.length)
			{
				b[i]=a[i];
			}
			else
				b[i]=element;
		}
		System.out.println(Arrays.toString(b));
	}
}
