package com.files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Reading {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("E:\\Files\\abc.txt");
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
		}
	}
}
