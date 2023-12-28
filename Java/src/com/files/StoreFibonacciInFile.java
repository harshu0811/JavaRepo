package com.files;

import java.io.FileOutputStream;
import java.io.IOException;

public class StoreFibonacciInFile {

	public static String Fibonacci(int n)
	{
		int num1=0;
		int num2=1;
		int num3;
		String s=""+num1+","+num2;
		while(n>2)
		{
			num3=num1+num2;
			s=s+","+(num3);
			num1=num2;
			num2=num3;
			n--;
			
		}
		//System.out.println(s);
		return s;
	}
	public static void main(String[] args) throws IOException {
		String s=Fibonacci(10);
		FileOutputStream fos=new FileOutputStream("./src/Sample.txt");
		fos.write(s.getBytes());
	}
}
