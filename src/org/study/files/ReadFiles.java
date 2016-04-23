package org.study.files;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.Scanner;

/**
 * Different ways of reading files using different Stream/Reader classes
 * The approaches covered are : 
 * 	1. BufferedReader - Read String in buffered standard
 * 	2. Scanner - Will read strings but has advance features like Regex
 *  3. Stream - Will read bytes
 * @author pulgupta
 *
 */
public class ReadFiles {

	/**
	 * reading a simple file using buffered reader
	 */
	public void readUsingBufferedReader() {
		BufferedReader br;
		String currenntLine;
		try {
			br = new BufferedReader(new FileReader("/Users/pulgupta/Documents/JavaFileTest/user1.txt"));
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
			sc = new Scanner(new File("/Users/pulgupta/Documents/JavaFileTest/user1.txt"), "ISO-8859-1");
			while(sc.hasNextLine())
				System.out.println(sc.nextLine());
		} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void readUsingStreams() throws IOException {
		FileInputStream fin = new FileInputStream("/Users/pulgupta/Documents/JavaFileTest/user2.txt");
		
		System.out.println("\n****Bytes starts****");
		while(fin.available()!=0)
			System.out.print(fin.read() + " ");
		
		System.out.println("\n\n****Double data starts****");
		
		FileInputStream fis = new FileInputStream("/Users/pulgupta/Documents/JavaFileTest/user2.txt");
		
		DataInputStream dis = new DataInputStream(fis);
		while(dis.available()!=0)
			System.out.println(dis.readDouble());
		dis.close();
		fin.close();
		fis.close();
	}
	
	public static void main(String[] args) {
		//Testing my class here
		ReadFiles rf = new ReadFiles();
		//Method used here
		rf.readUsingBufferedReader();
		
		try {
			rf.readUsingStreams();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//Threading example
		System.out.println("\nLets do some threading"); 
		FileDto fd = new FileDto();
		fd.setFileName("/Users/pulgupta/Documents/JavaFileTest/user1.txt");
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
		
		//Method used here
		rf.readUsingScanner();
	}
}
