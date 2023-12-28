package com.files;

import java.io.FileWriter;
import java.io.IOException;

public class WritingUsingFileWriter {

	public static void main(String[] args) throws IOException {
		FileWriter fw= new FileWriter("E:\\Files\\abc.txt");
		fw.write(49);
		char[] ch= {'h','a','r' };
		fw.write(ch);
		fw.write("java");
		fw .flush();
		fw. close();
	}
}
