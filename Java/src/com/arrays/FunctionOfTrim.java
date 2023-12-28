package com.arrays;

public class FunctionOfTrim {
	public static void main(String[] args) {
		String s="  java programming   ";
		char[] ch=s.toCharArray();
		String s2="";
		int start=0;
		int end=s.length()-1;
		for(int i=0;i<s.length();i++) {
			if(ch[start]==' ')
				start++;
			else if(ch[end]==' ')
				end--;
		}
		System.out.println(start+" "+end);
		for(int i=start;i<=end;i++) {
			s2+=ch[i];
		}
		System.out.println(s2);
	}
}
