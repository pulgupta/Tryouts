package org.study.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDto {

	String fileName;
	Scanner scanner;

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
	public Scanner getScanner() {
		return scanner;
	}

	public void setScanner(Scanner scanner) {
		this.scanner = scanner;
	}

	public Scanner initializeScanner() throws FileNotFoundException{
		scanner = new Scanner(new File(this.fileName));
		return scanner;
	}
}
