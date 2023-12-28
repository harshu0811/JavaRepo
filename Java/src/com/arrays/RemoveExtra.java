package com.arrays;

public class RemoveExtra {
	public static void main(String[] args) {
		String s="    java     programming     ";
		String s2="";
		char[] ch=s.toCharArray();
		int start=0;
		int end=ch.length-1;
		for(int i=0;i<ch.length;i++) {
			if(ch[start]==' ')
				start++;
			else if(ch[end]==' ')
				end--;
		}
		for(int i=start;i<=end;i++) {
			if(!(ch[i]==' '&&ch[i+1]==' '))
			{
				s2+=ch[i];
			}
		}
		System.out.println(s2);
	}
}
