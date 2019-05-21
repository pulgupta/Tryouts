package org.java8.general.concepts;

import java.util.Optional;

public class OptionalTest {

	public static void main(String[] args) {
		Optional<String> optional = null;
		optional.ifPresent(System.out::println);
	}
}
