package com.files;
import java.io.*;

public class ReadingByFR {
	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		FileReader fr=new FileReader(f);
		int i=fr.read();
		while(i!=-1) {
			System.out.print((char)i);
			i=fr.read();
		}
		
	}
}
