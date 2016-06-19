package org.study.filesnStreams;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

/**
 * For compatibility and other naming conventions each charset can have
 * multiple alias. We can follow the below process to obtain the charset aliases
 * @author pulgupta
 *
 */
public class CharacterSets {
	public static void main(String[] args) {
		//Print avaiable charset
		System.out.println("**AVAILABLE CHARSET ARE**");
		Map<String, Charset> charsets = Charset.availableCharsets();
		for (String string : charsets.keySet()) {
			System.out.println(string);
		}
		
		//Print charset alias
		System.out.println("\n**ALIASES FOR A CHARSET**");
		Charset cset = Charset.forName("UTF-8");
		Set<String> alias = cset.aliases();
		for (String string : alias) {
			System.out.println(string);
		}
	}
}
