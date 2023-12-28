package com.assign;

import java.util.Arrays;

public class ArrayMerge {
	public static void main(String[] args) {
		int [] arr1 = {1,2,3,4};
		int [] arr2 = {5,6,7,8};
		int k=arr2.length-1;
		int [] arr_list=new int[ arr1.length + arr2.length ];
		for(int i=0;i<arr_list.length;i++) {
			if(i<arr1.length)
				arr_list[i]=arr1[i];
			else
				arr_list[i]=arr2[k--];
		}
		System.out.println(Arrays.toString(arr_list));
	}
}
