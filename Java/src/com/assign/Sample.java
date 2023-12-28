package com.assign;

public class Sample {
	public static int extractfromarr(int arr[]) {
		int lowest = 10;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == 1) {
				count++;
			} else {
				if (lowest > count && count!=0) {
					lowest = count;
					count = 0;
				}

			}
			 //return lowest;
		}
//		if(count>0) {
//			if(lowest > count) {
//				lowest= count;
//			}
//		}
		return lowest;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 1, 0, 0, 0, 0, 1, 1,1,1, 0, 0, 0, 1, 1, 1, 1, 0, 0 ,1};
		System.out.println(extractfromarr(arr));

	}
}
