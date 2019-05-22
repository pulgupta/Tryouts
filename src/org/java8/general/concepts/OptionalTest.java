package org.java8.general.concepts;

import java.util.Optional;

public class OptionalTest {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		Optional<String> optional = null;
		System.out.println(optional.orElse("other"));
		// Null
		System.out.println(optional.isPresent());
		// Not Null
		System.out.println(optional);
		// null
		System.out.println(optional.get());
		// null
		optional.ifPresent(System.out::println);
	}
}
