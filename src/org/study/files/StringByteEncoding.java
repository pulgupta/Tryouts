package org.study.files;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.util.Map;
/**
 * This class is used to encode and decode string into to byte array
 * For this we will use the byte buffer. Only bytebuffer can hold the encoded value
 * Similarly only charBuffer can hold the encoded value. We can then covert them to 
 * byte array or string as needed.
 * @author pulgupta
 *
 */
class StringByteEncodingTest {

	static final Charset ch = Charset.forName("ISO-8859-1");

	/**
	 * Converting a string to a byte array
	 */
	public byte[] encode() {

		// to get the list of all availab;e charset in a particular java
		// implementations
		@SuppressWarnings("unused")
		Map<String, Charset> charsets = Charset.availableCharsets();
		
		ByteBuffer buffer = ch.encode("Hello world");
		byte[] bytes = buffer.array();
		for (byte b : bytes) {
			System.out.print(b);
		}
		System.out.println();
		return bytes;
	}

	public void decode(byte[] bytes) {
		ByteBuffer bbuf = ByteBuffer.wrap(bytes);
		CharBuffer cbuf = ch.decode(bbuf);
		String str = cbuf.toString();
		System.out.println(str);
	}

}

public class StringByteEncoding {
	public static void main(String[] args) throws IOException {
		StringByteEncodingTest sbet = new StringByteEncodingTest();
		sbet.decode(sbet.encode());
		
		
		//Better way
		System.out.println("\n\nWe can directly convert a string into a byte array");
		byte[] bytes = new String("Hello world").getBytes();
		InputStream bris = new ByteArrayInputStream(bytes);
		System.out.println("counting byte array input stream " + bris.read() + " " + bris.read());
		for (byte b : bytes) {
			System.out.print(b);
		}
		String s = new String(bytes); 
		System.out.println("\n" + s);
	}
}
