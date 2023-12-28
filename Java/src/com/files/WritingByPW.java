package com.files;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WritingByPW {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter pw=new PrintWriter("abc.txt");
		pw.write(100);
		pw.print(100);
		pw.flush();
		pw.close();
	}
}
