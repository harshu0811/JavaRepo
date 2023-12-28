package com.assign;

import java.util.Arrays;

public class SortingArrayByUnitsPlace {
	public static void main(String[] args) {
		int[] arr= {234,654,876,789,927,713,643};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				int num1=arr[i]/10%10;
				int num2=arr[j]/10%10;;
				if(num1>num2) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
