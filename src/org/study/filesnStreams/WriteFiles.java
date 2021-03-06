package org.study.filesnStreams;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

class WriteFilesTest {
	//READER WRITER EXAMPLE
	public void writeUsingReader() throws IOException {
		FileWriter fw = new FileWriter("/Users/pulgupta/Documents/JavaFileTest/user1.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("Pulkit");
		bw.write("\nGargi");
		bw.close();
	}
	/**
	 * IMPORTANT
	 * I checked and Scanner class cannot be used to write files
	 * It is mainly used for reading files
	 */
	public void writeUsingScanner() {
		throw new RuntimeException();
	}
	
	//STREAM EXAMPLE
	/**
	 * DataI/O_Stream is used for reading and writing primitives
	 * This stream extends the filter stream like many other stream classes.
	 * @throws IOException
	 */
	public void writeUsingStream() throws IOException {
		FileOutputStream fw = new FileOutputStream("/Users/pulgupta/Documents/JavaFileTest/user2.txt");
		DataOutputStream dos = new DataOutputStream(fw);
		dos.writeDouble(10);
		dos.writeDouble(10.10);
		dos.close();
	}
}
public class WriteFiles {
	public static void main(String[] args) throws Exception {
		System.out.println(System.getProperty("line.separator"));
		WriteFilesTest wft = new WriteFilesTest();
		wft.writeUsingReader();
		wft.writeUsingStream();
		wft.writeUsingStream();
	}
}
