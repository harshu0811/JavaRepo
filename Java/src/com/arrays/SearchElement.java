package com.arrays;

public class SearchElement {
	public static void main(String[] args) {
		int[] a= {67,89,0,45,8};
		int n=45;
		int elementindex=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++) {
			if(a[i]==n) {
				elementindex=i;
				flag=true;
				break;
			}
		}
		if(flag)
			System.out.println("element found "+a[elementindex]+" at "+(elementindex+1)+" position");
		else
			System.out.println("element not found");
	}
}
