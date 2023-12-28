package com.files;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class ReadingByFR2 {
	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		char[] ch= new char[(int)f.length()];
		fr.read(ch);
		System.out.println(Arrays.toString(ch));
		
	}
}
