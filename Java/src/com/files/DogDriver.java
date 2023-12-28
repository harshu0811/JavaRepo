package com.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DogDriver {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog d1=new Dog();
		File f=new File("E:\\Files\\serialization.ser");
		FileOutputStream fos= new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(d1);
		
		FileInputStream fis=new FileInputStream(f);
		ObjectInputStream ois=new ObjectInputStream(fis);
		Dog d2= (Dog) ois.readObject();
		System.out.println(d2.i+"    "+d2.j);
	}
}
