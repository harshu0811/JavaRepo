package com.files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingByBW {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw=new BufferedWriter(new FileWriter("abc.txt",true));
		bw.newLine();
		bw.write("suriya johnson");
		bw.newLine();
		bw.write("navy blue");
		bw.flush();
		bw.close();
	}
}
