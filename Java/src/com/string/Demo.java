package com.string;

public class Demo {
	public static void main(String[] args) {
		String s="how hy hii how are hii hye";
		String s2="";
		String[] str=s.split(" ");
		for(String s3: str)
		{
			if(s2.contains(s3))
			{
				
			}
			else
				s2+=s3+" ";
		}
		System.out.println(s2);
	}
}
