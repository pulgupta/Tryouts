package org.study.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFiles {

	/**
	 * reading a simple file using buffered reader
	 */
	public void readUsingBufferedReader() {
		BufferedReader br;
		String currenntLine;
		try {
			br = new BufferedReader(new FileReader("/Users/pulgupta/Documents/users.txt"));
			while((currenntLine = br.readLine() )!= null)		
				System.out.println(currenntLine);
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	/**
	 * reading the same file using scanner
	 */
	public void readUsingScanner() {
		Scanner sc;
		try {
			sc = new Scanner(new File("/Users/pulgupta/Documents/users.txt"));
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) {
		ReadFiles rf = new ReadFiles();
		rf.readUsingBufferedReader();
		//Threading example
		System.out.println("Lets do some threading"); 
		FileDto fd = new FileDto();
		fd.setFileName("/Users/pulgupta/Documents/users.txt");
		try {
			fd.initializeScanner();
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ReadFileThreading rft = new ReadFileThreading();
		rft.setFileDto(fd);
		Thread th = new Thread(rft);
		Thread th2 = new Thread(rft);
		th2.start();
		th.start();
		
		rf.readUsingScanner();
	}
}
