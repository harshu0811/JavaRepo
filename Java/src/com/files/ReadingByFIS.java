package com.files;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadingByFIS {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Harsha GR\\Desktop\\Anonymous class.txt");
		int x=fis.read();
		while(x!=-1)
		{
			System.out.print((char)x);
			x=fis.read();
		}
	}
}
