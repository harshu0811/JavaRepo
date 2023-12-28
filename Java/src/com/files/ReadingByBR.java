package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingByBR {
	public static void main(String[] args) throws IOException {
		BufferedReader br= new BufferedReader(new FileReader("abc.txt"));
		String s=br.readLine();
		while(s!=null) {
			System.out.println(s);
			s=br.readLine();
		}
	}
}
