package org.study.filesnStreams;

import java.io.File;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Date;

class FilePropertiesTest {

}

/**
 * This class will contain the basic utilities for files and paths which the
 * java language provides.
 * Concepts coded are :
 * File
 * Path
 * DirectoryStream
 * FileChannel
 * FileLock
 * @author pulgupta
 *
 */
public class FileProperties {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("/Users/pulgupta/Documents/JavaFileTest");
		// Resolve will not do any thing other than just concatinating the name
		// with the
		// original path
		Path path2 = path.resolve("../../newDir");
		System.out.println("New path : " + path2);

		path2 = path2.normalize();
		System.out.println("Normalized path : " + path2);

		File file = new File("/Users/pulgupta/Documents/JavaFileTest/serial1.txt");
		file.createNewFile();
		// Here I am converting Epoch time to date
		Date date = new Date(file.lastModified());
		System.out.println(date);

		/*
		 * Traversing the files in a directory
		 * It will first try to get the lock and once we have the lock it will 
		 * try to traverse the directory.
		 */
		System.out.println("\n****Traversing the files in a directory****");
		FileChannel fileChannel = FileChannel.open(path);
		try (FileLock fileLock = fileChannel.tryLock()) {
			//Because we have used try with resource for locking
			//Once we exit the try block the lock will be released
			try (DirectoryStream<Path> entries = Files.newDirectoryStream(path)) {
				for (Path entry : entries) {
					System.out.println(entry);
				}
			}
		}

	}
}
