package com.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteAFileUsingFOS {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("./src/Sample.txt");
		String s="Varshini";
		fos.write(s.getBytes());
	}
}
