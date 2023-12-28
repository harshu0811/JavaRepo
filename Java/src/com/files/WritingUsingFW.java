package com.files;
import java.io.*;

public class WritingUsingFW {
	public static void main(String[] args) throws IOException {
		File f=new File("abc.txt");
		FileWriter fw=new FileWriter(f);
		fw.write(97);
		fw.write('b');
		fw.write("cdef");
		fw.write("\n");
		char[] ch= {'g','h','i','j','k','l'};
		fw.write(ch);
		fw.flush();
		fw.close();
	}
}
