package com.files;

public class LeftRotation {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int arr1[]= {1,2,3,4,5};
		int pos=2;
		int aa=1;
		while(aa<=1)
		{
			for(int i=0;i<arr.length-1;i++) {
				//for(int j=i+1;j<arr.length;j++) {
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				//}
			}
			aa++;
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		System.out.println();
		aa=1;
		while(aa<=1)
		{
			for(int i=arr1.length-1;i>0;i--) {
				//for(int j=i+1;j<arr.length;j++) {
					int temp=arr1[i];
					arr1[i]=arr1[i-1];
					arr1[i-1]=temp;
				//}
			}
			aa++;
		}
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i]);
		}
	}
}
