package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ExternalDemoDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		ExternalDemo ed=new ExternalDemo("harsha", 143, 286);
		File f=new File("E:\\Files\\ExternalizationDemo.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(ed);
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		ExternalDemo ed2=(ExternalDemo)ois.readObject();
		System.out.println(ed2.i+"    "+ed2.s);
		
	}
}
