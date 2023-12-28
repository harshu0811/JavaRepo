package com.files;
import java.io.*;
import java.util.Arrays;

public class FileCreation {

	public static void main(String[] args) throws IOException {
		
		File f=new File("abc.txt");
		f.createNewFile();
		
		File folder=new File("java");
		folder.mkdir();
		
		File folders=new File("java/elf");
		folders.mkdirs();
		
		System.out.println(f.exists() ? "exist":"not exist");
		
		String[] str=folder.list();
		System.out.println(Arrays.toString(str));
		
		System.out.println(f.length());
		
		System.out.println(folders.delete()? "deleted":"not deleted");
		
		
	}
}
