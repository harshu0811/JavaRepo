package com.arrays;

import java.util.Arrays;

public class RemoveDuplicates2 {
	public static void main(String[] args) {
		int[] arr= {10,20,20,30,30,40,50,50};
		String result="";
		for(int i=0;i<arr.length;i++) {
			if(!(result.contains(arr[i]+""))) {
				result+=arr[i]+" ";
			}
		}
		String[] str=result.split(" ");
		arr=new int[str.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
	}
}
