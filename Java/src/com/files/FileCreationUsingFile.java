package com.files;

import java.io.File;
import java.io.IOException;

public class FileCreationUsingFile {

	public static void main(String[] args) throws IOException {
		File file=new File("Sample.txt");
		file.createNewFile();
	}
}
