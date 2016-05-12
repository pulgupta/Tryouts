package org.study.filesnStreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Streams {

	public static void main(String[] args) throws IOException {
		InputStream is = new FileInputStream("/Users/pulgupta/Documents/JavaFileTest/user1.txt");
		//based on the size of the buffer it will read the data
		final int BUFFER_SIZE = 10;
		byte[] b=new byte[BUFFER_SIZE];
		//Lets read the whole file based on the buffers
		//In this case we are reading the file till we have enough data
		//and at the end we will read the remaining buffer.
		System.out.println(is.available());
		while(is.available()>BUFFER_SIZE){
			is.read(b);
			System.out.print(new String(b));
		}
		byte[] b1 = new byte[is.available()];
		is.read(b1);
		System.out.println(new String(b1));
		is.close();
		
		//LETS TRY THE SAME THING USING BUFFERED INPUT STREAM
//		BufferedInputStream br = new BufferedInputStream(is);
//		br.
//		
	}
}
