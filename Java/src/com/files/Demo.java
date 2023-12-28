package com.files;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

public class Demo {
	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
		File f2=new File("abc\\def");
		f2.mkdir();
		f2.mkdirs();
		File f3=new File("E:\\Java");
		String [] str=f3.list();
		System.out.println(Arrays.toString(str));
	}
}
