package com.arrays;

public class RemoveConsequtive {
	public static void main(String[] args) {
		String s="    java     programming     ";
		String s2="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length-1;i++) {
			if(!(ch[i]==' '&&ch[i+1]==' '))
			{
				s2+=ch[i];
			}
		}
		System.out.println(s2);
	}
}
